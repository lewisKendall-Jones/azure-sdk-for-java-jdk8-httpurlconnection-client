// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Active Directory info. */
@Immutable
public final class ProviderPropertiesAad {
    /*
     * Provider's application id.
     */
    @JsonProperty(value = "applicationId", access = JsonProperty.Access.WRITE_ONLY)
    private String applicationId;

    /*
     * Provider's tenant id.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /** Creates an instance of ProviderPropertiesAad class. */
    public ProviderPropertiesAad() {
    }

    /**
     * Get the applicationId property: Provider's application id.
     *
     * @return the applicationId value.
     */
    public String applicationId() {
        return this.applicationId;
    }

    /**
     * Get the tenantId property: Provider's tenant id.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
