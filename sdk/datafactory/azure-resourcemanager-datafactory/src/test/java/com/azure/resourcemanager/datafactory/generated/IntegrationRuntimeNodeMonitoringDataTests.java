// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeNodeMonitoringData;
import java.util.HashMap;
import java.util.Map;

public final class IntegrationRuntimeNodeMonitoringDataTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationRuntimeNodeMonitoringData model =
            BinaryData
                .fromString(
                    "{\"nodeName\":\"cwwfvovbvme\",\"availableMemoryInMB\":321338352,\"cpuUtilization\":1542315989,\"concurrentJobsLimit\":1560245881,\"concurrentJobsRunning\":343837467,\"maxConcurrentJobs\":1240635196,\"sentBytes\":81.17821,\"receivedBytes\":67.35784,\"\":{\"wit\":\"datajueiotwmcdytd\"}}")
                .toObject(IntegrationRuntimeNodeMonitoringData.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationRuntimeNodeMonitoringData model =
            new IntegrationRuntimeNodeMonitoringData()
                .withAdditionalProperties(
                    mapOf(
                        "nodeName",
                        "cwwfvovbvme",
                        "cpuUtilization",
                        1542315989,
                        "receivedBytes",
                        67.35784f,
                        "concurrentJobsLimit",
                        1560245881,
                        "concurrentJobsRunning",
                        343837467,
                        "maxConcurrentJobs",
                        1240635196,
                        "availableMemoryInMB",
                        321338352,
                        "sentBytes",
                        81.17821f));
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeNodeMonitoringData.class);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
