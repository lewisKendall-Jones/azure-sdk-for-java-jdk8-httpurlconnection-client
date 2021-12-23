// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.models.VolumeGroupMetadata;
import com.azure.resourcemanager.netapp.models.VolumeGroupVolumeProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Volume group resource for create. */
@Fluent
public final class VolumeGroupDetailsInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VolumeGroupDetailsInner.class);

    /*
     * Resource location
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Resource Id
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Resource name
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Resource type
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Volume group properties
     */
    @JsonProperty(value = "properties")
    private VolumeGroupProperties innerProperties;

    /**
     * Get the location property: Resource location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource location.
     *
     * @param location the location value to set.
     * @return the VolumeGroupDetailsInner object itself.
     */
    public VolumeGroupDetailsInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the id property: Resource Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: Resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the VolumeGroupDetailsInner object itself.
     */
    public VolumeGroupDetailsInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: Volume group properties.
     *
     * @return the innerProperties value.
     */
    private VolumeGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the provisioningState property: Azure lifecycle management.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the groupMetadata property: Volume group details.
     *
     * @return the groupMetadata value.
     */
    public VolumeGroupMetadata groupMetadata() {
        return this.innerProperties() == null ? null : this.innerProperties().groupMetadata();
    }

    /**
     * Set the groupMetadata property: Volume group details.
     *
     * @param groupMetadata the groupMetadata value to set.
     * @return the VolumeGroupDetailsInner object itself.
     */
    public VolumeGroupDetailsInner withGroupMetadata(VolumeGroupMetadata groupMetadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeGroupProperties();
        }
        this.innerProperties().withGroupMetadata(groupMetadata);
        return this;
    }

    /**
     * Get the volumes property: List of volumes from group.
     *
     * @return the volumes value.
     */
    public List<VolumeGroupVolumeProperties> volumes() {
        return this.innerProperties() == null ? null : this.innerProperties().volumes();
    }

    /**
     * Set the volumes property: List of volumes from group.
     *
     * @param volumes the volumes value to set.
     * @return the VolumeGroupDetailsInner object itself.
     */
    public VolumeGroupDetailsInner withVolumes(List<VolumeGroupVolumeProperties> volumes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeGroupProperties();
        }
        this.innerProperties().withVolumes(volumes);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}