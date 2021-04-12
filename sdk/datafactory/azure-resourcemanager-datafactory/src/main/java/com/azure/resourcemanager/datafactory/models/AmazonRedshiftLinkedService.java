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

/** Linked service for Amazon Redshift. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AmazonRedshift")
@JsonFlatten
@Fluent
public class AmazonRedshiftLinkedService extends LinkedService {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AmazonRedshiftLinkedService.class);

    /*
     * The name of the Amazon Redshift server. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.server", required = true)
    private Object server;

    /*
     * The username of the Amazon Redshift source. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /*
     * The password of the Amazon Redshift source.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * The database name of the Amazon Redshift source. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.database", required = true)
    private Object database;

    /*
     * The TCP port number that the Amazon Redshift server uses to listen for
     * client connections. The default value is 5439. Type: integer (or
     * Expression with resultType integer).
     */
    @JsonProperty(value = "typeProperties.port")
    private Object port;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the server property: The name of the Amazon Redshift server. Type: string (or Expression with resultType
     * string).
     *
     * @return the server value.
     */
    public Object server() {
        return this.server;
    }

    /**
     * Set the server property: The name of the Amazon Redshift server. Type: string (or Expression with resultType
     * string).
     *
     * @param server the server value to set.
     * @return the AmazonRedshiftLinkedService object itself.
     */
    public AmazonRedshiftLinkedService withServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get the username property: The username of the Amazon Redshift source. Type: string (or Expression with
     * resultType string).
     *
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: The username of the Amazon Redshift source. Type: string (or Expression with
     * resultType string).
     *
     * @param username the username value to set.
     * @return the AmazonRedshiftLinkedService object itself.
     */
    public AmazonRedshiftLinkedService withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password of the Amazon Redshift source.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: The password of the Amazon Redshift source.
     *
     * @param password the password value to set.
     * @return the AmazonRedshiftLinkedService object itself.
     */
    public AmazonRedshiftLinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the database property: The database name of the Amazon Redshift source. Type: string (or Expression with
     * resultType string).
     *
     * @return the database value.
     */
    public Object database() {
        return this.database;
    }

    /**
     * Set the database property: The database name of the Amazon Redshift source. Type: string (or Expression with
     * resultType string).
     *
     * @param database the database value to set.
     * @return the AmazonRedshiftLinkedService object itself.
     */
    public AmazonRedshiftLinkedService withDatabase(Object database) {
        this.database = database;
        return this;
    }

    /**
     * Get the port property: The TCP port number that the Amazon Redshift server uses to listen for client connections.
     * The default value is 5439. Type: integer (or Expression with resultType integer).
     *
     * @return the port value.
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the port property: The TCP port number that the Amazon Redshift server uses to listen for client connections.
     * The default value is 5439. Type: integer (or Expression with resultType integer).
     *
     * @param port the port value to set.
     * @return the AmazonRedshiftLinkedService object itself.
     */
    public AmazonRedshiftLinkedService withPort(Object port) {
        this.port = port;
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
     * @return the AmazonRedshiftLinkedService object itself.
     */
    public AmazonRedshiftLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonRedshiftLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonRedshiftLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonRedshiftLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonRedshiftLinkedService withAnnotations(List<Object> annotations) {
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
        if (server() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property server in model AmazonRedshiftLinkedService"));
        }
        if (password() != null) {
            password().validate();
        }
        if (database() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property database in model AmazonRedshiftLinkedService"));
        }
    }
}
