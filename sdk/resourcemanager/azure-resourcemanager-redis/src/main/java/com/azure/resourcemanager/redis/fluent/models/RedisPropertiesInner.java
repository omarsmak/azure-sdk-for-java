// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.redis.models.ProvisioningState;
import com.azure.resourcemanager.redis.models.PublicNetworkAccess;
import com.azure.resourcemanager.redis.models.RedisCreateProperties;
import com.azure.resourcemanager.redis.models.RedisInstanceDetails;
import com.azure.resourcemanager.redis.models.RedisLinkedServer;
import com.azure.resourcemanager.redis.models.Sku;
import com.azure.resourcemanager.redis.models.TlsVersion;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Properties of the redis cache. */
@Immutable
public final class RedisPropertiesInner extends RedisCreateProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RedisPropertiesInner.class);

    /*
     * Redis version.
     */
    @JsonProperty(value = "redisVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String redisVersion;

    /*
     * Redis instance provisioning status.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Redis host name.
     */
    @JsonProperty(value = "hostName", access = JsonProperty.Access.WRITE_ONLY)
    private String hostname;

    /*
     * Redis non-SSL port.
     */
    @JsonProperty(value = "port", access = JsonProperty.Access.WRITE_ONLY)
    private Integer port;

    /*
     * Redis SSL port.
     */
    @JsonProperty(value = "sslPort", access = JsonProperty.Access.WRITE_ONLY)
    private Integer sslPort;

    /*
     * The keys of the Redis cache - not set if this object is not the response
     * to Create or Update redis cache
     */
    @JsonProperty(value = "accessKeys", access = JsonProperty.Access.WRITE_ONLY)
    private RedisAccessKeysInner accessKeys;

    /*
     * List of the linked servers associated with the cache
     */
    @JsonProperty(value = "linkedServers", access = JsonProperty.Access.WRITE_ONLY)
    private List<RedisLinkedServer> linkedServers;

    /*
     * List of the Redis instances associated with the cache
     */
    @JsonProperty(value = "instances", access = JsonProperty.Access.WRITE_ONLY)
    private List<RedisInstanceDetails> instances;

    /*
     * List of private endpoint connection associated with the specified redis
     * cache
     */
    @JsonProperty(value = "privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /**
     * Get the redisVersion property: Redis version.
     *
     * @return the redisVersion value.
     */
    public String redisVersion() {
        return this.redisVersion;
    }

    /**
     * Get the provisioningState property: Redis instance provisioning status.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the hostname property: Redis host name.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Get the port property: Redis non-SSL port.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Get the sslPort property: Redis SSL port.
     *
     * @return the sslPort value.
     */
    public Integer sslPort() {
        return this.sslPort;
    }

    /**
     * Get the accessKeys property: The keys of the Redis cache - not set if this object is not the response to Create
     * or Update redis cache.
     *
     * @return the accessKeys value.
     */
    public RedisAccessKeysInner accessKeys() {
        return this.accessKeys;
    }

    /**
     * Get the linkedServers property: List of the linked servers associated with the cache.
     *
     * @return the linkedServers value.
     */
    public List<RedisLinkedServer> linkedServers() {
        return this.linkedServers;
    }

    /**
     * Get the instances property: List of the Redis instances associated with the cache.
     *
     * @return the instances value.
     */
    public List<RedisInstanceDetails> instances() {
        return this.instances;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connection associated with the specified
     * redis cache.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /** {@inheritDoc} */
    @Override
    public RedisPropertiesInner withSku(Sku sku) {
        super.withSku(sku);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RedisPropertiesInner withSubnetId(String subnetId) {
        super.withSubnetId(subnetId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RedisPropertiesInner withStaticIp(String staticIp) {
        super.withStaticIp(staticIp);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RedisPropertiesInner withRedisConfiguration(Map<String, String> redisConfiguration) {
        super.withRedisConfiguration(redisConfiguration);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RedisPropertiesInner withEnableNonSslPort(Boolean enableNonSslPort) {
        super.withEnableNonSslPort(enableNonSslPort);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RedisPropertiesInner withReplicasPerMaster(Integer replicasPerMaster) {
        super.withReplicasPerMaster(replicasPerMaster);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RedisPropertiesInner withTenantSettings(Map<String, String> tenantSettings) {
        super.withTenantSettings(tenantSettings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RedisPropertiesInner withShardCount(Integer shardCount) {
        super.withShardCount(shardCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RedisPropertiesInner withMinimumTlsVersion(TlsVersion minimumTlsVersion) {
        super.withMinimumTlsVersion(minimumTlsVersion);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RedisPropertiesInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        super.withPublicNetworkAccess(publicNetworkAccess);
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
        if (accessKeys() != null) {
            accessKeys().validate();
        }
        if (linkedServers() != null) {
            linkedServers().forEach(e -> e.validate());
        }
        if (instances() != null) {
            instances().forEach(e -> e.validate());
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
    }
}
