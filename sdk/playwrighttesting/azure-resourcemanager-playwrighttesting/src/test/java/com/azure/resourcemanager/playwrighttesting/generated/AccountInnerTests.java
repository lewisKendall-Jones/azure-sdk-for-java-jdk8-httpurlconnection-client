// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.playwrighttesting.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.playwrighttesting.fluent.models.AccountInner;
import com.azure.resourcemanager.playwrighttesting.models.EnablementStatus;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AccountInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccountInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"dashboardUri\":\"s\",\"regionalAffinity\":\"Disabled\",\"scalableExecution\":\"Enabled\",\"reporting\":\"Enabled\",\"provisioningState\":\"Canceled\"},\"location\":\"htnapczwlokjyem\",\"tags\":{\"joxzjnchgejspodm\":\"ni\",\"h\":\"ilzyd\"},\"id\":\"jwyahuxinpmqnja\",\"name\":\"wixjsprozvcp\",\"type\":\"tegjvwmf\"}")
                .toObject(AccountInner.class);
        Assertions.assertEquals("htnapczwlokjyem", model.location());
        Assertions.assertEquals("ni", model.tags().get("joxzjnchgejspodm"));
        Assertions.assertEquals(EnablementStatus.DISABLED, model.regionalAffinity());
        Assertions.assertEquals(EnablementStatus.ENABLED, model.scalableExecution());
        Assertions.assertEquals(EnablementStatus.ENABLED, model.reporting());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccountInner model =
            new AccountInner()
                .withLocation("htnapczwlokjyem")
                .withTags(mapOf("joxzjnchgejspodm", "ni", "h", "ilzyd"))
                .withRegionalAffinity(EnablementStatus.DISABLED)
                .withScalableExecution(EnablementStatus.ENABLED)
                .withReporting(EnablementStatus.ENABLED);
        model = BinaryData.fromObject(model).toObject(AccountInner.class);
        Assertions.assertEquals("htnapczwlokjyem", model.location());
        Assertions.assertEquals("ni", model.tags().get("joxzjnchgejspodm"));
        Assertions.assertEquals(EnablementStatus.DISABLED, model.regionalAffinity());
        Assertions.assertEquals(EnablementStatus.ENABLED, model.scalableExecution());
        Assertions.assertEquals(EnablementStatus.ENABLED, model.reporting());
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
