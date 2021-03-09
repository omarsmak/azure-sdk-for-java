/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2020_09_01.ProxyOnlyResource;

/**
 * SSL certificate email.
 */
@JsonFlatten
public class CertificateEmailInner extends ProxyOnlyResource {
    /**
     * Email id.
     */
    @JsonProperty(value = "properties.emailId")
    private String emailId;

    /**
     * Time stamp.
     */
    @JsonProperty(value = "properties.timeStamp")
    private DateTime timeStamp;

    /**
     * Get email id.
     *
     * @return the emailId value
     */
    public String emailId() {
        return this.emailId;
    }

    /**
     * Set email id.
     *
     * @param emailId the emailId value to set
     * @return the CertificateEmailInner object itself.
     */
    public CertificateEmailInner withEmailId(String emailId) {
        this.emailId = emailId;
        return this;
    }

    /**
     * Get time stamp.
     *
     * @return the timeStamp value
     */
    public DateTime timeStamp() {
        return this.timeStamp;
    }

    /**
     * Set time stamp.
     *
     * @param timeStamp the timeStamp value to set
     * @return the CertificateEmailInner object itself.
     */
    public CertificateEmailInner withTimeStamp(DateTime timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

}
