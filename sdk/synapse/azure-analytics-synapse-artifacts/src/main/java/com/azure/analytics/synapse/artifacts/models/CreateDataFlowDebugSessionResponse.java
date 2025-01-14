// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response body structure for creating data flow debug session. */
@Fluent
public final class CreateDataFlowDebugSessionResponse {
    /*
     * The ID of data flow debug session.
     */
    @JsonProperty(value = "sessionId")
    private String sessionId;

    /** Creates an instance of CreateDataFlowDebugSessionResponse class. */
    public CreateDataFlowDebugSessionResponse() {}

    /**
     * Get the sessionId property: The ID of data flow debug session.
     *
     * @return the sessionId value.
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * Set the sessionId property: The ID of data flow debug session.
     *
     * @param sessionId the sessionId value to set.
     * @return the CreateDataFlowDebugSessionResponse object itself.
     */
    public CreateDataFlowDebugSessionResponse setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
}
