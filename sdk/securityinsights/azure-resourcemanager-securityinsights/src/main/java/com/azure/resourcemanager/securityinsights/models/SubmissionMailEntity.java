// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.models.EntityInner;
import com.azure.resourcemanager.securityinsights.fluent.models.SubmissionMailEntityProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;

/** Represents a submission mail entity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("SubmissionMail")
@Fluent
public final class SubmissionMailEntity extends EntityInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SubmissionMailEntity.class);

    /*
     * Submission mail entity properties
     */
    @JsonProperty(value = "properties")
    private SubmissionMailEntityProperties innerProperties;

    /**
     * Get the innerProperties property: Submission mail entity properties.
     *
     * @return the innerProperties value.
     */
    private SubmissionMailEntityProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the networkMessageId property: The network message id of email to which submission belongs.
     *
     * @return the networkMessageId value.
     */
    public UUID networkMessageId() {
        return this.innerProperties() == null ? null : this.innerProperties().networkMessageId();
    }

    /**
     * Get the submissionId property: The submission id.
     *
     * @return the submissionId value.
     */
    public UUID submissionId() {
        return this.innerProperties() == null ? null : this.innerProperties().submissionId();
    }

    /**
     * Get the submitter property: The submitter.
     *
     * @return the submitter value.
     */
    public String submitter() {
        return this.innerProperties() == null ? null : this.innerProperties().submitter();
    }

    /**
     * Get the submissionDate property: The submission date.
     *
     * @return the submissionDate value.
     */
    public OffsetDateTime submissionDate() {
        return this.innerProperties() == null ? null : this.innerProperties().submissionDate();
    }

    /**
     * Get the timestamp property: The Time stamp when the message is received (Mail).
     *
     * @return the timestamp value.
     */
    public OffsetDateTime timestamp() {
        return this.innerProperties() == null ? null : this.innerProperties().timestamp();
    }

    /**
     * Get the recipient property: The recipient of the mail.
     *
     * @return the recipient value.
     */
    public String recipient() {
        return this.innerProperties() == null ? null : this.innerProperties().recipient();
    }

    /**
     * Get the sender property: The sender of the mail.
     *
     * @return the sender value.
     */
    public String sender() {
        return this.innerProperties() == null ? null : this.innerProperties().sender();
    }

    /**
     * Get the senderIp property: The sender's IP.
     *
     * @return the senderIp value.
     */
    public String senderIp() {
        return this.innerProperties() == null ? null : this.innerProperties().senderIp();
    }

    /**
     * Get the subject property: The subject of submission mail.
     *
     * @return the subject value.
     */
    public String subject() {
        return this.innerProperties() == null ? null : this.innerProperties().subject();
    }

    /**
     * Get the reportType property: The submission type for the given instance. This maps to Junk, Phish, Malware or
     * NotJunk.
     *
     * @return the reportType value.
     */
    public String reportType() {
        return this.innerProperties() == null ? null : this.innerProperties().reportType();
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