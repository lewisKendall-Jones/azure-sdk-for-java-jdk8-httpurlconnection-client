// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.resourcehealth.models.KeyValueItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Impacted resource for an event. */
@Fluent
public final class EventImpactedResourceInner extends ProxyResource {
    /*
     * Properties of impacted resource.
     */
    @JsonProperty(value = "properties")
    private EventImpactedResourceProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of EventImpactedResourceInner class. */
    public EventImpactedResourceInner() {
    }

    /**
     * Get the innerProperties property: Properties of impacted resource.
     *
     * @return the innerProperties value.
     */
    private EventImpactedResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the targetResourceType property: Resource type within Microsoft cloud.
     *
     * @return the targetResourceType value.
     */
    public String targetResourceType() {
        return this.innerProperties() == null ? null : this.innerProperties().targetResourceType();
    }

    /**
     * Get the targetResourceId property: Identity for resource within Microsoft cloud.
     *
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().targetResourceId();
    }

    /**
     * Get the targetRegion property: Impacted resource region name.
     *
     * @return the targetRegion value.
     */
    public String targetRegion() {
        return this.innerProperties() == null ? null : this.innerProperties().targetRegion();
    }

    /**
     * Get the info property: Additional information.
     *
     * @return the info value.
     */
    public List<KeyValueItem> info() {
        return this.innerProperties() == null ? null : this.innerProperties().info();
    }

    /**
     * Set the info property: Additional information.
     *
     * @param info the info value to set.
     * @return the EventImpactedResourceInner object itself.
     */
    public EventImpactedResourceInner withInfo(List<KeyValueItem> info) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventImpactedResourceProperties();
        }
        this.innerProperties().withInfo(info);
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
