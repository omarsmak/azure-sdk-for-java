/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hybridcompute.v2020_08_02;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error response.
 * Contains details when the response code indicates an error.
 */
public class ErrorResponse {
    /**
     * The error details.
     */
    @JsonProperty(value = "error", required = true)
    private ErrorDetail error;

    /**
     * Get the error details.
     *
     * @return the error value
     */
    public ErrorDetail error() {
        return this.error;
    }

    /**
     * Set the error details.
     *
     * @param error the error value to set
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withError(ErrorDetail error) {
        this.error = error;
        return this;
    }

}