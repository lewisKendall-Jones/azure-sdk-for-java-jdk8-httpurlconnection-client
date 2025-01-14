// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.baremetalinfrastructure.models.AzureBareMetalInstancePowerStateEnum;
import com.azure.resourcemanager.baremetalinfrastructure.models.AzureBareMetalProvisioningStatesEnum;
import com.azure.resourcemanager.baremetalinfrastructure.models.HardwareProfile;
import com.azure.resourcemanager.baremetalinfrastructure.models.NetworkProfile;
import com.azure.resourcemanager.baremetalinfrastructure.models.OSProfile;
import com.azure.resourcemanager.baremetalinfrastructure.models.StorageProfile;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the properties of an AzureBareMetal instance. */
@Fluent
public final class AzureBareMetalInstanceProperties {
    /*
     * Specifies the hardware settings for the AzureBareMetal instance.
     */
    @JsonProperty(value = "hardwareProfile")
    private HardwareProfile hardwareProfile;

    /*
     * Specifies the storage settings for the AzureBareMetal instance disks.
     */
    @JsonProperty(value = "storageProfile")
    private StorageProfile storageProfile;

    /*
     * Specifies the operating system settings for the AzureBareMetal instance.
     */
    @JsonProperty(value = "osProfile")
    private OSProfile osProfile;

    /*
     * Specifies the network settings for the AzureBareMetal instance.
     */
    @JsonProperty(value = "networkProfile")
    private NetworkProfile networkProfile;

    /*
     * Specifies the AzureBareMetal instance unique ID.
     */
    @JsonProperty(value = "azureBareMetalInstanceId", access = JsonProperty.Access.WRITE_ONLY)
    private String azureBareMetalInstanceId;

    /*
     * Resource power state
     */
    @JsonProperty(value = "powerState", access = JsonProperty.Access.WRITE_ONLY)
    private AzureBareMetalInstancePowerStateEnum powerState;

    /*
     * Resource proximity placement group
     */
    @JsonProperty(value = "proximityPlacementGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String proximityPlacementGroup;

    /*
     * Hardware revision of an AzureBareMetal instance
     */
    @JsonProperty(value = "hwRevision", access = JsonProperty.Access.WRITE_ONLY)
    private String hwRevision;

    /*
     * ARM ID of another AzureBareMetalInstance that will share a network with this AzureBareMetalInstance
     */
    @JsonProperty(value = "partnerNodeId")
    private String partnerNodeId;

    /*
     * State of provisioning of the AzureBareMetalInstance
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private AzureBareMetalProvisioningStatesEnum provisioningState;

    /** Creates an instance of AzureBareMetalInstanceProperties class. */
    public AzureBareMetalInstanceProperties() {
    }

    /**
     * Get the hardwareProfile property: Specifies the hardware settings for the AzureBareMetal instance.
     *
     * @return the hardwareProfile value.
     */
    public HardwareProfile hardwareProfile() {
        return this.hardwareProfile;
    }

    /**
     * Set the hardwareProfile property: Specifies the hardware settings for the AzureBareMetal instance.
     *
     * @param hardwareProfile the hardwareProfile value to set.
     * @return the AzureBareMetalInstanceProperties object itself.
     */
    public AzureBareMetalInstanceProperties withHardwareProfile(HardwareProfile hardwareProfile) {
        this.hardwareProfile = hardwareProfile;
        return this;
    }

    /**
     * Get the storageProfile property: Specifies the storage settings for the AzureBareMetal instance disks.
     *
     * @return the storageProfile value.
     */
    public StorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: Specifies the storage settings for the AzureBareMetal instance disks.
     *
     * @param storageProfile the storageProfile value to set.
     * @return the AzureBareMetalInstanceProperties object itself.
     */
    public AzureBareMetalInstanceProperties withStorageProfile(StorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the osProfile property: Specifies the operating system settings for the AzureBareMetal instance.
     *
     * @return the osProfile value.
     */
    public OSProfile osProfile() {
        return this.osProfile;
    }

    /**
     * Set the osProfile property: Specifies the operating system settings for the AzureBareMetal instance.
     *
     * @param osProfile the osProfile value to set.
     * @return the AzureBareMetalInstanceProperties object itself.
     */
    public AzureBareMetalInstanceProperties withOsProfile(OSProfile osProfile) {
        this.osProfile = osProfile;
        return this;
    }

    /**
     * Get the networkProfile property: Specifies the network settings for the AzureBareMetal instance.
     *
     * @return the networkProfile value.
     */
    public NetworkProfile networkProfile() {
        return this.networkProfile;
    }

    /**
     * Set the networkProfile property: Specifies the network settings for the AzureBareMetal instance.
     *
     * @param networkProfile the networkProfile value to set.
     * @return the AzureBareMetalInstanceProperties object itself.
     */
    public AzureBareMetalInstanceProperties withNetworkProfile(NetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
        return this;
    }

    /**
     * Get the azureBareMetalInstanceId property: Specifies the AzureBareMetal instance unique ID.
     *
     * @return the azureBareMetalInstanceId value.
     */
    public String azureBareMetalInstanceId() {
        return this.azureBareMetalInstanceId;
    }

    /**
     * Get the powerState property: Resource power state.
     *
     * @return the powerState value.
     */
    public AzureBareMetalInstancePowerStateEnum powerState() {
        return this.powerState;
    }

    /**
     * Get the proximityPlacementGroup property: Resource proximity placement group.
     *
     * @return the proximityPlacementGroup value.
     */
    public String proximityPlacementGroup() {
        return this.proximityPlacementGroup;
    }

    /**
     * Get the hwRevision property: Hardware revision of an AzureBareMetal instance.
     *
     * @return the hwRevision value.
     */
    public String hwRevision() {
        return this.hwRevision;
    }

    /**
     * Get the partnerNodeId property: ARM ID of another AzureBareMetalInstance that will share a network with this
     * AzureBareMetalInstance.
     *
     * @return the partnerNodeId value.
     */
    public String partnerNodeId() {
        return this.partnerNodeId;
    }

    /**
     * Set the partnerNodeId property: ARM ID of another AzureBareMetalInstance that will share a network with this
     * AzureBareMetalInstance.
     *
     * @param partnerNodeId the partnerNodeId value to set.
     * @return the AzureBareMetalInstanceProperties object itself.
     */
    public AzureBareMetalInstanceProperties withPartnerNodeId(String partnerNodeId) {
        this.partnerNodeId = partnerNodeId;
        return this;
    }

    /**
     * Get the provisioningState property: State of provisioning of the AzureBareMetalInstance.
     *
     * @return the provisioningState value.
     */
    public AzureBareMetalProvisioningStatesEnum provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hardwareProfile() != null) {
            hardwareProfile().validate();
        }
        if (storageProfile() != null) {
            storageProfile().validate();
        }
        if (osProfile() != null) {
            osProfile().validate();
        }
        if (networkProfile() != null) {
            networkProfile().validate();
        }
    }
}
