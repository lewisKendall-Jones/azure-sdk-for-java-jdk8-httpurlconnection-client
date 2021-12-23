// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.kubernetesconfiguration.fluent.models.OperationStatusResultInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The async operations in progress, in the cluster. */
@Immutable
public final class OperationStatusList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationStatusList.class);

    /*
     * List of async operations in progress, in the cluster.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<OperationStatusResultInner> value;

    /*
     * URL to get the next set of Operation Result objects, if any.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: List of async operations in progress, in the cluster.
     *
     * @return the value value.
     */
    public List<OperationStatusResultInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URL to get the next set of Operation Result objects, if any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}