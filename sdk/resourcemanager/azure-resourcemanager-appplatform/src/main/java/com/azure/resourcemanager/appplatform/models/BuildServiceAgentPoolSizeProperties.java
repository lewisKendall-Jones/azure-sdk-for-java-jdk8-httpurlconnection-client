// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Build service agent pool size properties. */
@Fluent
public final class BuildServiceAgentPoolSizeProperties {
    /*
     * The name of build service agent pool size
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The cpu property of build service agent pool size
     */
    @JsonProperty(value = "cpu", access = JsonProperty.Access.WRITE_ONLY)
    private String cpu;

    /*
     * The memory property of build service agent pool size
     */
    @JsonProperty(value = "memory", access = JsonProperty.Access.WRITE_ONLY)
    private String memory;

    /**
     * Get the name property: The name of build service agent pool size.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of build service agent pool size.
     *
     * @param name the name value to set.
     * @return the BuildServiceAgentPoolSizeProperties object itself.
     */
    public BuildServiceAgentPoolSizeProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the cpu property: The cpu property of build service agent pool size.
     *
     * @return the cpu value.
     */
    public String cpu() {
        return this.cpu;
    }

    /**
     * Get the memory property: The memory property of build service agent pool size.
     *
     * @return the memory value.
     */
    public String memory() {
        return this.memory;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}