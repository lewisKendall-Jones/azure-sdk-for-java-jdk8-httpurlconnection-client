// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.Context;

/** Samples for Outputs Delete. */
public final class OutputsDeleteSamples {
    /*
     * x-ms-original-file: specification/streamanalytics/resource-manager/Microsoft.StreamAnalytics/stable/2020-03-01/examples/Output_Delete.json
     */
    /**
     * Sample code: Delete an output.
     *
     * @param manager Entry point to StreamAnalyticsManager.
     */
    public static void deleteAnOutput(com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager manager) {
        manager.outputs().deleteWithResponse("sjrg2157", "sj6458", "output1755", Context.NONE);
    }
}