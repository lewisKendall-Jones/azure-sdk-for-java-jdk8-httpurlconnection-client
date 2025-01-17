// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SIMs to upload. The SIM credentials must be encrypted. */
@Fluent
public final class EncryptedSimUploadList {
    /*
     * The upload file format version.
     */
    @JsonProperty(value = "version", required = true)
    private int version;

    /*
     * An identifier for the Azure SIM onboarding public key used for encrypted upload.
     */
    @JsonProperty(value = "azureKeyIdentifier", required = true)
    private int azureKeyIdentifier;

    /*
     * The fingerprint of the SIM vendor public key. The private counterpart is used for signing the encrypted
     * transport key.
     */
    @JsonProperty(value = "vendorKeyFingerprint", required = true)
    private String vendorKeyFingerprint;

    /*
     * The transport key used for encrypting SIM credentials, encrypted using the SIM onboarding public key.
     */
    @JsonProperty(value = "encryptedTransportKey", required = true)
    private String encryptedTransportKey;

    /*
     * The encrypted transport key, signed using the SIM vendor private key.
     */
    @JsonProperty(value = "signedTransportKey", required = true)
    private String signedTransportKey;

    /*
     * A list of SIMs to upload, with encrypted properties.
     */
    @JsonProperty(value = "sims", required = true)
    private List<SimNameAndEncryptedProperties> sims;

    /** Creates an instance of EncryptedSimUploadList class. */
    public EncryptedSimUploadList() {
    }

    /**
     * Get the version property: The upload file format version.
     *
     * @return the version value.
     */
    public int version() {
        return this.version;
    }

    /**
     * Set the version property: The upload file format version.
     *
     * @param version the version value to set.
     * @return the EncryptedSimUploadList object itself.
     */
    public EncryptedSimUploadList withVersion(int version) {
        this.version = version;
        return this;
    }

    /**
     * Get the azureKeyIdentifier property: An identifier for the Azure SIM onboarding public key used for encrypted
     * upload.
     *
     * @return the azureKeyIdentifier value.
     */
    public int azureKeyIdentifier() {
        return this.azureKeyIdentifier;
    }

    /**
     * Set the azureKeyIdentifier property: An identifier for the Azure SIM onboarding public key used for encrypted
     * upload.
     *
     * @param azureKeyIdentifier the azureKeyIdentifier value to set.
     * @return the EncryptedSimUploadList object itself.
     */
    public EncryptedSimUploadList withAzureKeyIdentifier(int azureKeyIdentifier) {
        this.azureKeyIdentifier = azureKeyIdentifier;
        return this;
    }

    /**
     * Get the vendorKeyFingerprint property: The fingerprint of the SIM vendor public key. The private counterpart is
     * used for signing the encrypted transport key.
     *
     * @return the vendorKeyFingerprint value.
     */
    public String vendorKeyFingerprint() {
        return this.vendorKeyFingerprint;
    }

    /**
     * Set the vendorKeyFingerprint property: The fingerprint of the SIM vendor public key. The private counterpart is
     * used for signing the encrypted transport key.
     *
     * @param vendorKeyFingerprint the vendorKeyFingerprint value to set.
     * @return the EncryptedSimUploadList object itself.
     */
    public EncryptedSimUploadList withVendorKeyFingerprint(String vendorKeyFingerprint) {
        this.vendorKeyFingerprint = vendorKeyFingerprint;
        return this;
    }

    /**
     * Get the encryptedTransportKey property: The transport key used for encrypting SIM credentials, encrypted using
     * the SIM onboarding public key.
     *
     * @return the encryptedTransportKey value.
     */
    public String encryptedTransportKey() {
        return this.encryptedTransportKey;
    }

    /**
     * Set the encryptedTransportKey property: The transport key used for encrypting SIM credentials, encrypted using
     * the SIM onboarding public key.
     *
     * @param encryptedTransportKey the encryptedTransportKey value to set.
     * @return the EncryptedSimUploadList object itself.
     */
    public EncryptedSimUploadList withEncryptedTransportKey(String encryptedTransportKey) {
        this.encryptedTransportKey = encryptedTransportKey;
        return this;
    }

    /**
     * Get the signedTransportKey property: The encrypted transport key, signed using the SIM vendor private key.
     *
     * @return the signedTransportKey value.
     */
    public String signedTransportKey() {
        return this.signedTransportKey;
    }

    /**
     * Set the signedTransportKey property: The encrypted transport key, signed using the SIM vendor private key.
     *
     * @param signedTransportKey the signedTransportKey value to set.
     * @return the EncryptedSimUploadList object itself.
     */
    public EncryptedSimUploadList withSignedTransportKey(String signedTransportKey) {
        this.signedTransportKey = signedTransportKey;
        return this;
    }

    /**
     * Get the sims property: A list of SIMs to upload, with encrypted properties.
     *
     * @return the sims value.
     */
    public List<SimNameAndEncryptedProperties> sims() {
        return this.sims;
    }

    /**
     * Set the sims property: A list of SIMs to upload, with encrypted properties.
     *
     * @param sims the sims value to set.
     * @return the EncryptedSimUploadList object itself.
     */
    public EncryptedSimUploadList withSims(List<SimNameAndEncryptedProperties> sims) {
        this.sims = sims;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vendorKeyFingerprint() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property vendorKeyFingerprint in model EncryptedSimUploadList"));
        }
        if (encryptedTransportKey() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property encryptedTransportKey in model EncryptedSimUploadList"));
        }
        if (signedTransportKey() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property signedTransportKey in model EncryptedSimUploadList"));
        }
        if (sims() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sims in model EncryptedSimUploadList"));
        } else {
            sims().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EncryptedSimUploadList.class);
}
