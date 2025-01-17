// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Service network profile payload. */
@Fluent
public final class NetworkProfile {
    /*
     * Fully qualified resource Id of the subnet to host Azure Spring Apps
     * Service Runtime
     */
    @JsonProperty(value = "serviceRuntimeSubnetId")
    private String serviceRuntimeSubnetId;

    /*
     * Fully qualified resource Id of the subnet to host customer apps in Azure
     * Spring Apps
     */
    @JsonProperty(value = "appSubnetId")
    private String appSubnetId;

    /*
     * Azure Spring Apps service reserved CIDR
     */
    @JsonProperty(value = "serviceCidr")
    private String serviceCidr;

    /*
     * Name of the resource group containing network resources of Azure Spring
     * Apps Service Runtime
     */
    @JsonProperty(value = "serviceRuntimeNetworkResourceGroup")
    private String serviceRuntimeNetworkResourceGroup;

    /*
     * Name of the resource group containing network resources for customer
     * apps in Azure Spring Apps
     */
    @JsonProperty(value = "appNetworkResourceGroup")
    private String appNetworkResourceGroup;

    /*
     * Desired outbound IP resources for Azure Spring Apps resource.
     */
    @JsonProperty(value = "outboundIPs", access = JsonProperty.Access.WRITE_ONLY)
    private NetworkProfileOutboundIPs outboundIPs;

    /*
     * Required inbound or outbound traffics for Azure Spring Apps resource.
     */
    @JsonProperty(value = "requiredTraffics", access = JsonProperty.Access.WRITE_ONLY)
    private List<RequiredTraffic> requiredTraffics;

    /*
     * Ingress configuration payload for Azure Spring Apps resource.
     */
    @JsonProperty(value = "ingressConfig")
    private IngressConfig ingressConfig;

    /*
     * The egress traffic type of Azure Spring Apps VNet instances.
     */
    @JsonProperty(value = "outboundType")
    private String outboundType;

    /**
     * Get the serviceRuntimeSubnetId property: Fully qualified resource Id of the subnet to host Azure Spring Apps
     * Service Runtime.
     *
     * @return the serviceRuntimeSubnetId value.
     */
    public String serviceRuntimeSubnetId() {
        return this.serviceRuntimeSubnetId;
    }

    /**
     * Set the serviceRuntimeSubnetId property: Fully qualified resource Id of the subnet to host Azure Spring Apps
     * Service Runtime.
     *
     * @param serviceRuntimeSubnetId the serviceRuntimeSubnetId value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withServiceRuntimeSubnetId(String serviceRuntimeSubnetId) {
        this.serviceRuntimeSubnetId = serviceRuntimeSubnetId;
        return this;
    }

    /**
     * Get the appSubnetId property: Fully qualified resource Id of the subnet to host customer apps in Azure Spring
     * Apps.
     *
     * @return the appSubnetId value.
     */
    public String appSubnetId() {
        return this.appSubnetId;
    }

    /**
     * Set the appSubnetId property: Fully qualified resource Id of the subnet to host customer apps in Azure Spring
     * Apps.
     *
     * @param appSubnetId the appSubnetId value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withAppSubnetId(String appSubnetId) {
        this.appSubnetId = appSubnetId;
        return this;
    }

    /**
     * Get the serviceCidr property: Azure Spring Apps service reserved CIDR.
     *
     * @return the serviceCidr value.
     */
    public String serviceCidr() {
        return this.serviceCidr;
    }

    /**
     * Set the serviceCidr property: Azure Spring Apps service reserved CIDR.
     *
     * @param serviceCidr the serviceCidr value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withServiceCidr(String serviceCidr) {
        this.serviceCidr = serviceCidr;
        return this;
    }

    /**
     * Get the serviceRuntimeNetworkResourceGroup property: Name of the resource group containing network resources of
     * Azure Spring Apps Service Runtime.
     *
     * @return the serviceRuntimeNetworkResourceGroup value.
     */
    public String serviceRuntimeNetworkResourceGroup() {
        return this.serviceRuntimeNetworkResourceGroup;
    }

    /**
     * Set the serviceRuntimeNetworkResourceGroup property: Name of the resource group containing network resources of
     * Azure Spring Apps Service Runtime.
     *
     * @param serviceRuntimeNetworkResourceGroup the serviceRuntimeNetworkResourceGroup value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withServiceRuntimeNetworkResourceGroup(String serviceRuntimeNetworkResourceGroup) {
        this.serviceRuntimeNetworkResourceGroup = serviceRuntimeNetworkResourceGroup;
        return this;
    }

    /**
     * Get the appNetworkResourceGroup property: Name of the resource group containing network resources for customer
     * apps in Azure Spring Apps.
     *
     * @return the appNetworkResourceGroup value.
     */
    public String appNetworkResourceGroup() {
        return this.appNetworkResourceGroup;
    }

    /**
     * Set the appNetworkResourceGroup property: Name of the resource group containing network resources for customer
     * apps in Azure Spring Apps.
     *
     * @param appNetworkResourceGroup the appNetworkResourceGroup value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withAppNetworkResourceGroup(String appNetworkResourceGroup) {
        this.appNetworkResourceGroup = appNetworkResourceGroup;
        return this;
    }

    /**
     * Get the outboundIPs property: Desired outbound IP resources for Azure Spring Apps resource.
     *
     * @return the outboundIPs value.
     */
    public NetworkProfileOutboundIPs outboundIPs() {
        return this.outboundIPs;
    }

    /**
     * Get the requiredTraffics property: Required inbound or outbound traffics for Azure Spring Apps resource.
     *
     * @return the requiredTraffics value.
     */
    public List<RequiredTraffic> requiredTraffics() {
        return this.requiredTraffics;
    }

    /**
     * Get the ingressConfig property: Ingress configuration payload for Azure Spring Apps resource.
     *
     * @return the ingressConfig value.
     */
    public IngressConfig ingressConfig() {
        return this.ingressConfig;
    }

    /**
     * Set the ingressConfig property: Ingress configuration payload for Azure Spring Apps resource.
     *
     * @param ingressConfig the ingressConfig value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withIngressConfig(IngressConfig ingressConfig) {
        this.ingressConfig = ingressConfig;
        return this;
    }

    /**
     * Get the outboundType property: The egress traffic type of Azure Spring Apps VNet instances.
     *
     * @return the outboundType value.
     */
    public String outboundType() {
        return this.outboundType;
    }

    /**
     * Set the outboundType property: The egress traffic type of Azure Spring Apps VNet instances.
     *
     * @param outboundType the outboundType value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withOutboundType(String outboundType) {
        this.outboundType = outboundType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (outboundIPs() != null) {
            outboundIPs().validate();
        }
        if (requiredTraffics() != null) {
            requiredTraffics().forEach(e -> e.validate());
        }
        if (ingressConfig() != null) {
            ingressConfig().validate();
        }
    }
}
