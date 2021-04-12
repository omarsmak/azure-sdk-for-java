// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Azure Function linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureFunction")
@JsonFlatten
@Fluent
public class AzureFunctionLinkedService extends LinkedService {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureFunctionLinkedService.class);

    /*
     * The endpoint of the Azure Function App. URL will be in the format
     * https://<accountName>.azurewebsites.net.
     */
    @JsonProperty(value = "typeProperties.functionAppUrl", required = true)
    private Object functionAppUrl;

    /*
     * Function or Host key for Azure Function App.
     */
    @JsonProperty(value = "typeProperties.functionKey")
    private SecretBase functionKey;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the functionAppUrl property: The endpoint of the Azure Function App. URL will be in the format
     * https://&lt;accountName&gt;.azurewebsites.net.
     *
     * @return the functionAppUrl value.
     */
    public Object functionAppUrl() {
        return this.functionAppUrl;
    }

    /**
     * Set the functionAppUrl property: The endpoint of the Azure Function App. URL will be in the format
     * https://&lt;accountName&gt;.azurewebsites.net.
     *
     * @param functionAppUrl the functionAppUrl value to set.
     * @return the AzureFunctionLinkedService object itself.
     */
    public AzureFunctionLinkedService withFunctionAppUrl(Object functionAppUrl) {
        this.functionAppUrl = functionAppUrl;
        return this;
    }

    /**
     * Get the functionKey property: Function or Host key for Azure Function App.
     *
     * @return the functionKey value.
     */
    public SecretBase functionKey() {
        return this.functionKey;
    }

    /**
     * Set the functionKey property: Function or Host key for Azure Function App.
     *
     * @param functionKey the functionKey value to set.
     * @return the AzureFunctionLinkedService object itself.
     */
    public AzureFunctionLinkedService withFunctionKey(SecretBase functionKey) {
        this.functionKey = functionKey;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureFunctionLinkedService object itself.
     */
    public AzureFunctionLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFunctionLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFunctionLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFunctionLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFunctionLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
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
        if (functionAppUrl() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property functionAppUrl in model AzureFunctionLinkedService"));
        }
        if (functionKey() != null) {
            functionKey().validate();
        }
    }
}
