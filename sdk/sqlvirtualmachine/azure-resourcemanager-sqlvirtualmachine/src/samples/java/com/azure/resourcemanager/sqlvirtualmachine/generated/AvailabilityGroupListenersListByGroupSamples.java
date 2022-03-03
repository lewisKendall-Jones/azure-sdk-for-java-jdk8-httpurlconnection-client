// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated;

import com.azure.core.util.Context;

/** Samples for AvailabilityGroupListeners ListByGroup. */
public final class AvailabilityGroupListenersListByGroupSamples {
    /*
     * x-ms-original-file: specification/sqlvirtualmachine/resource-manager/Microsoft.SqlVirtualMachine/preview/2021-11-01-preview/examples/ListByGroupAvailabilityGroupListener.json
     */
    /**
     * Sample code: Lists all availability group listeners in a SQL virtual machine group.
     *
     * @param manager Entry point to SqlVirtualMachineManager.
     */
    public static void listsAllAvailabilityGroupListenersInASQLVirtualMachineGroup(
        com.azure.resourcemanager.sqlvirtualmachine.SqlVirtualMachineManager manager) {
        manager.availabilityGroupListeners().listByGroup("testrg", "testvmgroup", Context.NONE);
    }
}