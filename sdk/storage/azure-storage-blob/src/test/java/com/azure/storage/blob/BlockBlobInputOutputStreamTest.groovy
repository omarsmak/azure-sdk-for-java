package com.azure.storage.blob

import com.azure.storage.blob.models.BlobRequestConditions
import com.azure.storage.blob.models.BlobStorageException
import com.azure.storage.blob.models.BlobType
import com.azure.storage.blob.options.BlobInputStreamOptions
import com.azure.storage.blob.specialized.BlobOutputStream
import com.azure.storage.blob.specialized.BlockBlobClient
import com.azure.storage.common.implementation.Constants
import spock.lang.Requires
import spock.lang.Unroll

class BlockBlobInputOutputStreamTest extends APISpec {
    BlockBlobClient bc

    def setup() {
        bc = cc.getBlobClient(generateBlobName()).getBlockBlobClient()
    }

    @Unroll
    def "BlobInputStream read to large buffer"() {
        setup:
        byte[] data = getRandomByteArray(dataSize)
        bc.upload(new ByteArrayInputStream(data), data.length, true)
        def is = bc.openInputStream()
        byte[] outArr = new byte[10 * 1024 * 1024]

        when:
        def count = is.read(outArr)

        then:
        for (int i=0; i < dataSize; i++) {
            assert data[i] == outArr[i]
        }
        for (int i=dataSize; i < (outArr.length); i++) {
            assert outArr[i] == (byte) 0
        }

        count == retVal

        where:
        dataSize        || retVal
        0               || -1
        6 * 1024 * 1024 || 6 * 1024 * 1024 // Test for github issue #13811
    }

    // Only run this test in live mode as BlobOutputStream dynamically assigns blocks
    @Requires({ liveMode() })
    def "Upload download"() {
        when:
        int length = 6 * Constants.MB
        byte[] randomBytes = getRandomByteArray(length)

        BlobOutputStream outStream = bc.getBlobOutputStream()
        outStream.write(randomBytes, 1 * Constants.MB, 5 * Constants.MB)
        outStream.close()

        then:
        def inputStream = bc.openInputStream()
        int b
        def outputStream = new ByteArrayOutputStream()
        try {
            while ((b = inputStream.read()) != -1) {
                outputStream.write(b)
            }
        } catch (IOException ex) {
            throw new UncheckedIOException(ex)
        }
        def propertiesAfter = inputStream.getProperties()
        propertiesAfter.getBlobType() == BlobType.BLOCK_BLOB
        propertiesAfter.getBlobSize() == 5 * Constants.MB
        byte[] randomBytes2 = outputStream.toByteArray()
        assert randomBytes2 == Arrays.copyOfRange(randomBytes, 1 * Constants.MB, 6 * Constants.MB)
    }

    // Only run this test in live mode as BlobOutputStream dynamically assigns blocks
    @Requires({ liveMode() })
    @Unroll
    def "Upload download block size"() {
        when:
        int length = 6 * Constants.MB
        byte[] randomBytes = getRandomByteArray(length)

        BlobOutputStream outStream = bc.getBlobOutputStream()
        outStream.write(randomBytes, 0, 6 * Constants.MB)
        outStream.close()

        then:
        def inputStream = bc.openInputStream(new BlobInputStreamOptions().setBlockSize(blockSize))
        int b
        def outputStream = new ByteArrayOutputStream()
        try {
            for (int i = 0; i < numChunks; i++) {
                b = inputStream.read()
                assert b != -1
                outputStream.write(b)
                assert inputStream.available() == sizes[i] - 1 // Make sure the internal buffer is the expected chunk size.
                // Read the rest of the chunk
                for (int j = 0; j < sizes[i] - 1; j++) {
                    b = inputStream.read()
                    assert b != -1
                    outputStream.write(b)
                }
            }
        } catch (IOException ex) {
            throw new UncheckedIOException(ex)
        }
        assert inputStream.read() == -1 // Make sure we are at the end of the stream.
        def propertiesAfter = inputStream.getProperties()
        propertiesAfter.getBlobType() == BlobType.BLOCK_BLOB
        propertiesAfter.getBlobSize() == 6 * Constants.MB
        byte[] randomBytes2 = outputStream.toByteArray()
        assert randomBytes2 == randomBytes

        where:
        blockSize        || numChunks | sizes
        null             || 2         | [4 * Constants.MB, 2 * Constants.MB] // Default
        5 * Constants.MB || 2         | [5 * Constants.MB, 1 * Constants.MB] // Greater than default
        3 * Constants.MB || 2         | [3 * Constants.MB, 3 * Constants.MB] // Smaller than default
    }

    // Only run this test in live mode as BlobOutputStream dynamically assigns blocks
    @Requires({ liveMode() })
    def "Get properties before"() {
        when:
        int length = 6 * Constants.MB
        byte[] randomBytes = getRandomByteArray(length)

        BlobOutputStream outStream = bc.getBlobOutputStream()
        outStream.write(randomBytes, 1 * Constants.MB, 5 * Constants.MB)
        outStream.close()

        then:
        def inputStream = bc.openInputStream()
        def propertiesBefore = inputStream.getProperties()
        int b
        def outputStream = new ByteArrayOutputStream()
        try {
            while ((b = inputStream.read()) != -1) {
                outputStream.write(b)
            }
        } catch (IOException ex) {
            throw new UncheckedIOException(ex)
        }
        propertiesBefore.getBlobType() == BlobType.BLOCK_BLOB
        propertiesBefore.getBlobSize() == 5 * Constants.MB
        byte[] randomBytes2 = outputStream.toByteArray()
        assert randomBytes2 == Arrays.copyOfRange(randomBytes, 1 * Constants.MB, 6 * Constants.MB)
    }

    // Only run this test in live mode as BlobOutputStream dynamically assigns blocks
    @Requires({ liveMode() })
    def "Input stream etag lock"() {
        setup:
        int length = 6 * Constants.MB
        byte[] randomBytes = getRandomByteArray(length)
        BlobOutputStream outStream = bc.getBlobOutputStream()
        outStream.write(randomBytes, 1 * Constants.MB, 5 * Constants.MB)
        outStream.close()

        // Read from the input stream
        // Note: Setting block size to 1 is inefficient but helps demonstrate the purpose of this test.
        def inputStream = bc.openInputStream(new BlobInputStreamOptions().setBlockSize(1))
        inputStream.read()

        // Modify the blob again.
        outStream = bc.getBlobOutputStream(true)
        outStream.write(randomBytes, 1 * Constants.MB, 5 * Constants.MB)
        outStream.close()

        when:
        inputStream.read()

        then:
        thrown(IOException)
    }

    @Unroll
    def "InputStream AC"() {
        setup:
        bc.upload(new ByteArrayInputStream(new byte[0]), 0)
        def t = new HashMap<String, String>()
        t.put("foo", "bar")
        bc.setTags(t)
        def bac = new BlobRequestConditions()
            .setLeaseId(setupBlobLeaseCondition(bc, leaseID))
            .setIfMatch(setupBlobMatchCondition(bc, match))
            .setIfNoneMatch(noneMatch)
            .setIfModifiedSince(modified)
            .setIfUnmodifiedSince(unmodified)
            .setTagsConditions(tags)

        expect:
        bc.openInputStream(new BlobInputStreamOptions().setRequestConditions(bac))

        where:
        modified | unmodified | match        | noneMatch   | leaseID         | tags
        null     | null       | null         | null        | null            | null
        oldDate  | null       | null         | null        | null            | null
        null     | newDate    | null         | null        | null            | null
        null     | null       | receivedEtag | null        | null            | null
        null     | null       | null         | garbageEtag | null            | null
        null     | null       | null         | null        | receivedLeaseID | null
        null     | null       | null         | null        | null            | "\"foo\" = 'bar'"
    }

    @Unroll
    def "InputStream AC fail"() {
        setup:
        bc.upload(new ByteArrayInputStream(new byte[0]), 0)
        def bac = new BlobRequestConditions()
            .setLeaseId(setupBlobLeaseCondition(bc, leaseID))
            .setIfMatch(match)
            .setIfNoneMatch(setupBlobMatchCondition(bc, noneMatch))
            .setIfModifiedSince(modified)
            .setIfUnmodifiedSince(unmodified)
            .setTagsConditions(tags)

        when:
        bc.openInputStream(new BlobInputStreamOptions().setRequestConditions(bac))

        then:
        thrown(BlobStorageException)

        where:
        modified | unmodified | match       | noneMatch    | leaseID        | tags
        newDate  | null       | null        | null         | null           | null
        null     | oldDate    | null        | null         | null           | null
        null     | null       | garbageEtag | null         | null           | null
        null     | null       | null        | receivedEtag | null           | null
        null     | null       | null        | null         | garbageLeaseID | null
        null     | null       | null         | null        | null           | "\"notfoo\" = 'notbar'"
    }
}
