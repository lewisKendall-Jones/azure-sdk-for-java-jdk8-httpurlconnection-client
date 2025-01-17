// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.PrivateLinkResourcesWrapperInner;
import com.azure.resourcemanager.datafactory.models.PrivateLinkResource;
import com.azure.resourcemanager.datafactory.models.PrivateLinkResourceProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourcesWrapperInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourcesWrapperInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"groupId\":\"psmgo\",\"requiredMembers\":[\"amljdlrgmsplzgau\"],\"requiredZoneNames\":[\"hhvnewgnxkymp\",\"anxrj\",\"ixt\"]},\"name\":\"taoypnyghshxc\",\"type\":\"hkgmnsg\",\"etag\":\"xycphdrwjjkh\",\"id\":\"omacluzvxnqmhr\"},{\"properties\":{\"groupId\":\"df\",\"requiredMembers\":[\"oi\"],\"requiredZoneNames\":[\"ssffxuifmc\"]},\"name\":\"p\",\"type\":\"kdqzrdzsylo\",\"etag\":\"gtrczzydmxzjijpv\",\"id\":\"urkihci\"}]}")
                .toObject(PrivateLinkResourcesWrapperInner.class);
        Assertions.assertEquals("omacluzvxnqmhr", model.value().get(0).id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResourcesWrapperInner model =
            new PrivateLinkResourcesWrapperInner()
                .withValue(
                    Arrays
                        .asList(
                            new PrivateLinkResource()
                                .withId("omacluzvxnqmhr")
                                .withProperties(new PrivateLinkResourceProperties()),
                            new PrivateLinkResource()
                                .withId("urkihci")
                                .withProperties(new PrivateLinkResourceProperties())));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourcesWrapperInner.class);
        Assertions.assertEquals("omacluzvxnqmhr", model.value().get(0).id());
    }
}
