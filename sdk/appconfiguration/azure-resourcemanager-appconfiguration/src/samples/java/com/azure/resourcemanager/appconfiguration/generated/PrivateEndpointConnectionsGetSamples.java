// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections Get. */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/preview/2021-10-01-preview/examples/ConfigurationStoresGetPrivateEndpointConnection.json
     */
    /**
     * Sample code: PrivateEndpointConnection_GetConnection.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void privateEndpointConnectionGetConnection(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager
            .privateEndpointConnections()
            .getWithResponse("myResourceGroup", "contoso", "myConnection", Context.NONE);
    }
}