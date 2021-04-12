// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of exposure control features. */
@Fluent
public final class ExposureControlBatchRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExposureControlBatchRequest.class);

    /*
     * List of exposure control features.
     */
    @JsonProperty(value = "exposureControlRequests", required = true)
    private List<ExposureControlRequest> exposureControlRequests;

    /**
     * Get the exposureControlRequests property: List of exposure control features.
     *
     * @return the exposureControlRequests value.
     */
    public List<ExposureControlRequest> exposureControlRequests() {
        return this.exposureControlRequests;
    }

    /**
     * Set the exposureControlRequests property: List of exposure control features.
     *
     * @param exposureControlRequests the exposureControlRequests value to set.
     * @return the ExposureControlBatchRequest object itself.
     */
    public ExposureControlBatchRequest withExposureControlRequests(
        List<ExposureControlRequest> exposureControlRequests) {
        this.exposureControlRequests = exposureControlRequests;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (exposureControlRequests() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property exposureControlRequests in model ExposureControlBatchRequest"));
        } else {
            exposureControlRequests().forEach(e -> e.validate());
        }
    }
}
