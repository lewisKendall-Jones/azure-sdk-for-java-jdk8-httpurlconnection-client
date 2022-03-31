// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for DynamicVNetAssignmentScope. */
public enum DynamicVNetAssignmentScope {
    /** Enum value none. */
    NONE("none"),

    /** Enum value job. */
    JOB("job");

    /** The actual serialized value for a DynamicVNetAssignmentScope instance. */
    private final String value;

    DynamicVNetAssignmentScope(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DynamicVNetAssignmentScope instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DynamicVNetAssignmentScope object, or null if unable to parse.
     */
    @JsonCreator
    public static DynamicVNetAssignmentScope fromString(String value) {
        DynamicVNetAssignmentScope[] items = DynamicVNetAssignmentScope.values();
        for (DynamicVNetAssignmentScope item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}