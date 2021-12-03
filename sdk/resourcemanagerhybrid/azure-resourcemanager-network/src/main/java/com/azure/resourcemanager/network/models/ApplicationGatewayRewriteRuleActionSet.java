// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Set of actions in the Rewrite Rule in Application Gateway. */
@Fluent
public final class ApplicationGatewayRewriteRuleActionSet {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayRewriteRuleActionSet.class);

    /*
     * Request Header Actions in the Action Set
     */
    @JsonProperty(value = "requestHeaderConfigurations")
    private List<ApplicationGatewayHeaderConfiguration> requestHeaderConfigurations;

    /*
     * Response Header Actions in the Action Set
     */
    @JsonProperty(value = "responseHeaderConfigurations")
    private List<ApplicationGatewayHeaderConfiguration> responseHeaderConfigurations;

    /**
     * Get the requestHeaderConfigurations property: Request Header Actions in the Action Set.
     *
     * @return the requestHeaderConfigurations value.
     */
    public List<ApplicationGatewayHeaderConfiguration> requestHeaderConfigurations() {
        return this.requestHeaderConfigurations;
    }

    /**
     * Set the requestHeaderConfigurations property: Request Header Actions in the Action Set.
     *
     * @param requestHeaderConfigurations the requestHeaderConfigurations value to set.
     * @return the ApplicationGatewayRewriteRuleActionSet object itself.
     */
    public ApplicationGatewayRewriteRuleActionSet withRequestHeaderConfigurations(
        List<ApplicationGatewayHeaderConfiguration> requestHeaderConfigurations) {
        this.requestHeaderConfigurations = requestHeaderConfigurations;
        return this;
    }

    /**
     * Get the responseHeaderConfigurations property: Response Header Actions in the Action Set.
     *
     * @return the responseHeaderConfigurations value.
     */
    public List<ApplicationGatewayHeaderConfiguration> responseHeaderConfigurations() {
        return this.responseHeaderConfigurations;
    }

    /**
     * Set the responseHeaderConfigurations property: Response Header Actions in the Action Set.
     *
     * @param responseHeaderConfigurations the responseHeaderConfigurations value to set.
     * @return the ApplicationGatewayRewriteRuleActionSet object itself.
     */
    public ApplicationGatewayRewriteRuleActionSet withResponseHeaderConfigurations(
        List<ApplicationGatewayHeaderConfiguration> responseHeaderConfigurations) {
        this.responseHeaderConfigurations = responseHeaderConfigurations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (requestHeaderConfigurations() != null) {
            requestHeaderConfigurations().forEach(e -> e.validate());
        }
        if (responseHeaderConfigurations() != null) {
            responseHeaderConfigurations().forEach(e -> e.validate());
        }
    }
}