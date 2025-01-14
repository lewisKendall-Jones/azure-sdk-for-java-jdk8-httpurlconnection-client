// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.PrivateLinkResource;
import com.azure.resourcemanager.datafactory.models.PrivateLinkResourceProperties;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResource model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"groupId\":\"efxrdcoxnbk\",\"requiredMembers\":[\"nurnnq\",\"nqbpi\"],\"requiredZoneNames\":[\"ltgrdogypxrxv\",\"fihwu\"]},\"name\":\"ctafsrbxrblm\",\"type\":\"owxih\",\"etag\":\"nxw\",\"id\":\"gnepz\"}")
                .toObject(PrivateLinkResource.class);
        Assertions.assertEquals("gnepz", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResource model =
            new PrivateLinkResource().withId("gnepz").withProperties(new PrivateLinkResourceProperties());
        model = BinaryData.fromObject(model).toObject(PrivateLinkResource.class);
        Assertions.assertEquals("gnepz", model.id());
    }
}
