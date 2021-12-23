// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

/** Samples for Remediations CreateOrUpdateAtResourceGroup. */
public final class RemediationsCreateOrUpdateAtResourceGroupSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2021-10-01/examples/Remediations_CreateResourceGroupScope.json
     */
    /**
     * Sample code: Create remediation at resource group scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void createRemediationAtResourceGroupScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .remediations()
            .define("storageRemediation")
            .withExistingResourceGroup("myResourceGroup")
            .withPolicyAssignmentId(
                "/subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/resourceGroups/myResourceGroup/providers/microsoft.authorization/policyassignments/b101830944f246d8a14088c5")
            .create();
    }
}