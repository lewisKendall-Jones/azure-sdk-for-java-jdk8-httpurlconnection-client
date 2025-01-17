// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Describes a set of worker selectors that will be attached if the given condition resolves to true. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("conditional")
@Immutable
public final class ConditionalWorkerSelectorAttachment extends WorkerSelectorAttachment {
    /*
     * A rule of one of the following types:
     *
     * StaticRule:  A rule
     * providing static rules that always return the same result, regardless of
     * input.
     * DirectMapRule:  A rule that return the same labels as the input
     * labels.
     * ExpressionRule: A rule providing inline expression
     * rules.
     * FunctionRule: A rule providing a binding to an HTTP Triggered Azure
     * Function.
     * WebhookRule: A rule providing a binding to a webserver following
     * OAuth2.0 authentication protocol.
     */
    @Generated
    @JsonProperty(value = "condition")
    private RouterRule condition;

    /*
     * The worker selectors to attach
     */
    @Generated
    @JsonProperty(value = "workerSelectors")
    private List<RouterWorkerSelector> workerSelectors;

    /**
     * Creates an instance of ConditionalWorkerSelectorAttachment class.
     *
     * @param condition the condition value to set.
     * @param workerSelectors the workerSelectors value to set.
     */
    @Generated
    @JsonCreator
    public ConditionalWorkerSelectorAttachment(
            @JsonProperty(value = "condition") RouterRule condition,
            @JsonProperty(value = "workerSelectors") List<RouterWorkerSelector> workerSelectors) {
        this.condition = condition;
        this.workerSelectors = workerSelectors;
    }

    /**
     * Get the condition property: A rule of one of the following types:
     *
     * <p>StaticRule: A rule providing static rules that always return the same result, regardless of input.
     * DirectMapRule: A rule that return the same labels as the input labels. ExpressionRule: A rule providing inline
     * expression rules. FunctionRule: A rule providing a binding to an HTTP Triggered Azure Function. WebhookRule: A
     * rule providing a binding to a webserver following OAuth2.0 authentication protocol.
     *
     * @return the condition value.
     */
    @Generated
    public RouterRule getCondition() {
        return this.condition;
    }

    /**
     * Get the workerSelectors property: The worker selectors to attach.
     *
     * @return the workerSelectors value.
     */
    @Generated
    public List<RouterWorkerSelector> getWorkerSelectors() {
        return this.workerSelectors;
    }
}
