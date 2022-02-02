// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.models.CloudApplicationEntityProperties;
import com.azure.resourcemanager.securityinsights.fluent.models.EntityInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** Represents a cloud application entity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("CloudApplication")
@Fluent
public final class CloudApplicationEntity extends EntityInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CloudApplicationEntity.class);

    /*
     * CloudApplication entity properties
     */
    @JsonProperty(value = "properties")
    private CloudApplicationEntityProperties innerProperties;

    /**
     * Get the innerProperties property: CloudApplication entity properties.
     *
     * @return the innerProperties value.
     */
    private CloudApplicationEntityProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the appId property: The technical identifier of the application.
     *
     * @return the appId value.
     */
    public Integer appId() {
        return this.innerProperties() == null ? null : this.innerProperties().appId();
    }

    /**
     * Get the appName property: The name of the related cloud application.
     *
     * @return the appName value.
     */
    public String appName() {
        return this.innerProperties() == null ? null : this.innerProperties().appName();
    }

    /**
     * Get the instanceName property: The user defined instance name of the cloud application. It is often used to
     * distinguish between several applications of the same type that a customer has.
     *
     * @return the instanceName value.
     */
    public String instanceName() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceName();
    }

    /**
     * Get the additionalData property: A bag of custom fields that should be part of the entity and will be presented
     * to the user.
     *
     * @return the additionalData value.
     */
    public Map<String, Object> additionalData() {
        return this.innerProperties() == null ? null : this.innerProperties().additionalData();
    }

    /**
     * Get the friendlyName property: The graph item display name which is a short humanly readable description of the
     * graph item instance. This property is optional and might be system generated.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.innerProperties() == null ? null : this.innerProperties().friendlyName();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}