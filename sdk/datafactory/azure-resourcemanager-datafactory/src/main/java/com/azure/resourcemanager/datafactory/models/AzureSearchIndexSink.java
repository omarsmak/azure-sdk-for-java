// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Azure Search Index sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureSearchIndexSink")
@Fluent
public final class AzureSearchIndexSink extends CopySink {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureSearchIndexSink.class);

    /*
     * Specify the write behavior when upserting documents into Azure Search
     * Index.
     */
    @JsonProperty(value = "writeBehavior")
    private AzureSearchIndexWriteBehaviorType writeBehavior;

    /**
     * Get the writeBehavior property: Specify the write behavior when upserting documents into Azure Search Index.
     *
     * @return the writeBehavior value.
     */
    public AzureSearchIndexWriteBehaviorType writeBehavior() {
        return this.writeBehavior;
    }

    /**
     * Set the writeBehavior property: Specify the write behavior when upserting documents into Azure Search Index.
     *
     * @param writeBehavior the writeBehavior value to set.
     * @return the AzureSearchIndexSink object itself.
     */
    public AzureSearchIndexSink withWriteBehavior(AzureSearchIndexWriteBehaviorType writeBehavior) {
        this.writeBehavior = writeBehavior;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSearchIndexSink withWriteBatchSize(Object writeBatchSize) {
        super.withWriteBatchSize(writeBatchSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSearchIndexSink withWriteBatchTimeout(Object writeBatchTimeout) {
        super.withWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSearchIndexSink withSinkRetryCount(Object sinkRetryCount) {
        super.withSinkRetryCount(sinkRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSearchIndexSink withSinkRetryWait(Object sinkRetryWait) {
        super.withSinkRetryWait(sinkRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSearchIndexSink withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
