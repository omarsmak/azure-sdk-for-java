// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.GalleryApplicationVersionPropertiesProvisioningState;
import com.azure.resourcemanager.compute.models.GalleryApplicationVersionPublishingProfile;
import com.azure.resourcemanager.compute.models.ReplicationStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Specifies information about the gallery Application Version that you want to create or update. */
@JsonFlatten
@Fluent
public class GalleryApplicationVersionInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GalleryApplicationVersionInner.class);

    /*
     * The publishing profile of a gallery image version.
     */
    @JsonProperty(value = "properties.publishingProfile")
    private GalleryApplicationVersionPublishingProfile publishingProfile;

    /*
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private GalleryApplicationVersionPropertiesProvisioningState provisioningState;

    /*
     * This is the replication status of the gallery Image Version.
     */
    @JsonProperty(value = "properties.replicationStatus", access = JsonProperty.Access.WRITE_ONLY)
    private ReplicationStatus replicationStatus;

    /**
     * Get the publishingProfile property: The publishing profile of a gallery image version.
     *
     * @return the publishingProfile value.
     */
    public GalleryApplicationVersionPublishingProfile publishingProfile() {
        return this.publishingProfile;
    }

    /**
     * Set the publishingProfile property: The publishing profile of a gallery image version.
     *
     * @param publishingProfile the publishingProfile value to set.
     * @return the GalleryApplicationVersionInner object itself.
     */
    public GalleryApplicationVersionInner withPublishingProfile(
        GalleryApplicationVersionPublishingProfile publishingProfile) {
        this.publishingProfile = publishingProfile;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public GalleryApplicationVersionPropertiesProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the replicationStatus property: This is the replication status of the gallery Image Version.
     *
     * @return the replicationStatus value.
     */
    public ReplicationStatus replicationStatus() {
        return this.replicationStatus;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryApplicationVersionInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryApplicationVersionInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publishingProfile() != null) {
            publishingProfile().validate();
        }
        if (replicationStatus() != null) {
            replicationStatus().validate();
        }
    }
}
