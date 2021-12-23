// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.edgeorder.fluent.models.ConfigurationInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of configurations. */
@Fluent
public final class Configurations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Configurations.class);

    /*
     * List of configurations.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<ConfigurationInner> value;

    /*
     * Link for the next set of configurations.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of configurations.
     *
     * @return the value value.
     */
    public List<ConfigurationInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Link for the next set of configurations.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link for the next set of configurations.
     *
     * @param nextLink the nextLink value to set.
     * @return the Configurations object itself.
     */
    public Configurations withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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