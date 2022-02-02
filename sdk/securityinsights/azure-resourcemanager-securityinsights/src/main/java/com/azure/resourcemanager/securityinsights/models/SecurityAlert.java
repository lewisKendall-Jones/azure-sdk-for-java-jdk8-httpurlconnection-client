// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.models.EntityInner;
import com.azure.resourcemanager.securityinsights.fluent.models.SecurityAlertProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Represents a security alert entity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("SecurityAlert")
@Fluent
public final class SecurityAlert extends EntityInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SecurityAlert.class);

    /*
     * SecurityAlert entity properties
     */
    @JsonProperty(value = "properties")
    private SecurityAlertProperties innerProperties;

    /**
     * Get the innerProperties property: SecurityAlert entity properties.
     *
     * @return the innerProperties value.
     */
    private SecurityAlertProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the alertDisplayName property: The display name of the alert.
     *
     * @return the alertDisplayName value.
     */
    public String alertDisplayName() {
        return this.innerProperties() == null ? null : this.innerProperties().alertDisplayName();
    }

    /**
     * Get the alertType property: The type name of the alert.
     *
     * @return the alertType value.
     */
    public String alertType() {
        return this.innerProperties() == null ? null : this.innerProperties().alertType();
    }

    /**
     * Get the compromisedEntity property: Display name of the main entity being reported on.
     *
     * @return the compromisedEntity value.
     */
    public String compromisedEntity() {
        return this.innerProperties() == null ? null : this.innerProperties().compromisedEntity();
    }

    /**
     * Get the confidenceLevel property: The confidence level of this alert.
     *
     * @return the confidenceLevel value.
     */
    public ConfidenceLevel confidenceLevel() {
        return this.innerProperties() == null ? null : this.innerProperties().confidenceLevel();
    }

    /**
     * Get the confidenceReasons property: The confidence reasons.
     *
     * @return the confidenceReasons value.
     */
    public List<SecurityAlertPropertiesConfidenceReasonsItem> confidenceReasons() {
        return this.innerProperties() == null ? null : this.innerProperties().confidenceReasons();
    }

    /**
     * Get the confidenceScore property: The confidence score of the alert.
     *
     * @return the confidenceScore value.
     */
    public Double confidenceScore() {
        return this.innerProperties() == null ? null : this.innerProperties().confidenceScore();
    }

    /**
     * Get the confidenceScoreStatus property: The confidence score calculation status, i.e. indicating if score
     * calculation is pending for this alert, not applicable or final.
     *
     * @return the confidenceScoreStatus value.
     */
    public ConfidenceScoreStatus confidenceScoreStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().confidenceScoreStatus();
    }

    /**
     * Get the description property: Alert description.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Get the endTimeUtc property: The impact end time of the alert (the time of the last event contributing to the
     * alert).
     *
     * @return the endTimeUtc value.
     */
    public OffsetDateTime endTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().endTimeUtc();
    }

    /**
     * Get the intent property: Holds the alert intent stage(s) mapping for this alert.
     *
     * @return the intent value.
     */
    public KillChainIntent intent() {
        return this.innerProperties() == null ? null : this.innerProperties().intent();
    }

    /**
     * Get the providerAlertId property: The identifier of the alert inside the product which generated the alert.
     *
     * @return the providerAlertId value.
     */
    public String providerAlertId() {
        return this.innerProperties() == null ? null : this.innerProperties().providerAlertId();
    }

    /**
     * Get the processingEndTime property: The time the alert was made available for consumption.
     *
     * @return the processingEndTime value.
     */
    public OffsetDateTime processingEndTime() {
        return this.innerProperties() == null ? null : this.innerProperties().processingEndTime();
    }

    /**
     * Get the productComponentName property: The name of a component inside the product which generated the alert.
     *
     * @return the productComponentName value.
     */
    public String productComponentName() {
        return this.innerProperties() == null ? null : this.innerProperties().productComponentName();
    }

    /**
     * Get the productName property: The name of the product which published this alert.
     *
     * @return the productName value.
     */
    public String productName() {
        return this.innerProperties() == null ? null : this.innerProperties().productName();
    }

    /**
     * Get the productVersion property: The version of the product generating the alert.
     *
     * @return the productVersion value.
     */
    public String productVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().productVersion();
    }

    /**
     * Get the remediationSteps property: Manual action items to take to remediate the alert.
     *
     * @return the remediationSteps value.
     */
    public List<String> remediationSteps() {
        return this.innerProperties() == null ? null : this.innerProperties().remediationSteps();
    }

    /**
     * Get the severity property: The severity of the alert.
     *
     * @return the severity value.
     */
    public AlertSeverity severity() {
        return this.innerProperties() == null ? null : this.innerProperties().severity();
    }

    /**
     * Set the severity property: The severity of the alert.
     *
     * @param severity the severity value to set.
     * @return the SecurityAlert object itself.
     */
    public SecurityAlert withSeverity(AlertSeverity severity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityAlertProperties();
        }
        this.innerProperties().withSeverity(severity);
        return this;
    }

    /**
     * Get the startTimeUtc property: The impact start time of the alert (the time of the first event contributing to
     * the alert).
     *
     * @return the startTimeUtc value.
     */
    public OffsetDateTime startTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().startTimeUtc();
    }

    /**
     * Get the status property: The lifecycle status of the alert.
     *
     * @return the status value.
     */
    public AlertStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the systemAlertId property: Holds the product identifier of the alert for the product.
     *
     * @return the systemAlertId value.
     */
    public String systemAlertId() {
        return this.innerProperties() == null ? null : this.innerProperties().systemAlertId();
    }

    /**
     * Get the tactics property: The tactics of the alert.
     *
     * @return the tactics value.
     */
    public List<AttackTactic> tactics() {
        return this.innerProperties() == null ? null : this.innerProperties().tactics();
    }

    /**
     * Get the timeGenerated property: The time the alert was generated.
     *
     * @return the timeGenerated value.
     */
    public OffsetDateTime timeGenerated() {
        return this.innerProperties() == null ? null : this.innerProperties().timeGenerated();
    }

    /**
     * Get the vendorName property: The name of the vendor that raise the alert.
     *
     * @return the vendorName value.
     */
    public String vendorName() {
        return this.innerProperties() == null ? null : this.innerProperties().vendorName();
    }

    /**
     * Get the alertLink property: The uri link of the alert.
     *
     * @return the alertLink value.
     */
    public String alertLink() {
        return this.innerProperties() == null ? null : this.innerProperties().alertLink();
    }

    /**
     * Get the resourceIdentifiers property: The list of resource identifiers of the alert.
     *
     * @return the resourceIdentifiers value.
     */
    public List<Object> resourceIdentifiers() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceIdentifiers();
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