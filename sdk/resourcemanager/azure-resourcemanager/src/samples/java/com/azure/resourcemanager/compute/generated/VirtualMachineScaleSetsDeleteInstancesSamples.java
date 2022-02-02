// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetVMInstanceRequiredIDs;
import java.util.Arrays;

/** Samples for VirtualMachineScaleSets DeleteInstances. */
public final class VirtualMachineScaleSetsDeleteInstancesSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/VirtualMachineScaleSets_DeleteInstances_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSets_DeleteInstances_MaximumSet_Gen.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualMachineScaleSetsDeleteInstancesMaximumSetGen(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachineScaleSets()
            .deleteInstances(
                "rgcompute",
                "aaaaaaaaaaaaaaaaaaaa",
                new VirtualMachineScaleSetVMInstanceRequiredIDs()
                    .withInstanceIds(Arrays.asList("aaaaaaaaaaaaaaaaaaaaaaaaa")),
                true,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/VirtualMachineScaleSets_DeleteInstances_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSets_DeleteInstances_MinimumSet_Gen.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualMachineScaleSetsDeleteInstancesMinimumSetGen(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachineScaleSets()
            .deleteInstances(
                "rgcompute",
                "aaaaaaaaaaaaaaa",
                new VirtualMachineScaleSetVMInstanceRequiredIDs()
                    .withInstanceIds(Arrays.asList("aaaaaaaaaaaaaaaaaaaaaaaaa")),
                null,
                Context.NONE);
    }
}