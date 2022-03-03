// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.Context;

/** Samples for Sims List. */
public final class SimsListSamples {
    /*
     * x-ms-original-file: specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/preview/2022-01-01-preview/examples/SimListBySubscription.json
     */
    /**
     * Sample code: List sims in a subscription.
     *
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void listSimsInASubscription(com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        manager.sims().list(Context.NONE);
    }
}