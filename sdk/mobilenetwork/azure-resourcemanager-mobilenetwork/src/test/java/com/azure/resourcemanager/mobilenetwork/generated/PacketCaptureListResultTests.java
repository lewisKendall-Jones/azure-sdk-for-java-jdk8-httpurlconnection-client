// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCaptureInner;
import com.azure.resourcemanager.mobilenetwork.models.PacketCaptureListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PacketCaptureListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PacketCaptureListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Unknown\",\"status\":\"Error\",\"reason\":\"qyud\",\"captureStartTime\":\"2021-08-19T10:45:17Z\",\"networkInterfaces\":[\"b\",\"oczvy\",\"fqrvkdvjsllrmvvd\",\"watkpnpulexxb\"],\"bytesToCapturePerPacket\":8119628141774012024,\"totalBytesPerSession\":6075438403018061337,\"timeLimitInSeconds\":223654021},\"id\":\"zb\",\"name\":\"j\",\"type\":\"sovmyokacspkwl\"},{\"properties\":{\"provisioningState\":\"Canceled\",\"status\":\"Running\",\"reason\":\"xjmflbvv\",\"captureStartTime\":\"2021-01-14T17:49:26Z\",\"networkInterfaces\":[\"cciw\",\"zjuqkhrsaj\",\"wkuofoskghsauu\",\"mjmvxieduugidyjr\"],\"bytesToCapturePerPacket\":3682891038702940178,\"totalBytesPerSession\":7621842593771814376,\"timeLimitInSeconds\":28529322},\"id\":\"xc\",\"name\":\"onpc\",\"type\":\"hocohslkev\"},{\"properties\":{\"provisioningState\":\"Failed\",\"status\":\"Running\",\"reason\":\"buhfmvfaxkffeiit\",\"captureStartTime\":\"2021-08-31T22:03:19Z\",\"networkInterfaces\":[\"zy\"],\"bytesToCapturePerPacket\":4685428530799529051,\"totalBytesPerSession\":6199142667074725987,\"timeLimitInSeconds\":63743502},\"id\":\"zoggigrxwburvjxx\",\"name\":\"nspydptkoenkoukn\",\"type\":\"udwtiukbl\"},{\"properties\":{\"provisioningState\":\"Canceled\",\"status\":\"Error\",\"reason\":\"cipazyxoegukgjnp\",\"captureStartTime\":\"2021-06-13T14:39:26Z\",\"networkInterfaces\":[\"gevqznty\",\"mrbpizcdrqj\",\"dpydn\",\"yhxdeoejzicwi\"],\"bytesToCapturePerPacket\":6694189583402716643,\"totalBytesPerSession\":1558927295996088992,\"timeLimitInSeconds\":1731680066},\"id\":\"ishc\",\"name\":\"khaj\",\"type\":\"eyeam\"}],\"nextLink\":\"hagalpbuxwgipwh\"}")
                .toObject(PacketCaptureListResult.class);
        Assertions.assertEquals("b", model.value().get(0).networkInterfaces().get(0));
        Assertions.assertEquals(8119628141774012024L, model.value().get(0).bytesToCapturePerPacket());
        Assertions.assertEquals(6075438403018061337L, model.value().get(0).totalBytesPerSession());
        Assertions.assertEquals(223654021, model.value().get(0).timeLimitInSeconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PacketCaptureListResult model =
            new PacketCaptureListResult()
                .withValue(
                    Arrays
                        .asList(
                            new PacketCaptureInner()
                                .withNetworkInterfaces(Arrays.asList("b", "oczvy", "fqrvkdvjsllrmvvd", "watkpnpulexxb"))
                                .withBytesToCapturePerPacket(8119628141774012024L)
                                .withTotalBytesPerSession(6075438403018061337L)
                                .withTimeLimitInSeconds(223654021),
                            new PacketCaptureInner()
                                .withNetworkInterfaces(
                                    Arrays.asList("cciw", "zjuqkhrsaj", "wkuofoskghsauu", "mjmvxieduugidyjr"))
                                .withBytesToCapturePerPacket(3682891038702940178L)
                                .withTotalBytesPerSession(7621842593771814376L)
                                .withTimeLimitInSeconds(28529322),
                            new PacketCaptureInner()
                                .withNetworkInterfaces(Arrays.asList("zy"))
                                .withBytesToCapturePerPacket(4685428530799529051L)
                                .withTotalBytesPerSession(6199142667074725987L)
                                .withTimeLimitInSeconds(63743502),
                            new PacketCaptureInner()
                                .withNetworkInterfaces(
                                    Arrays.asList("gevqznty", "mrbpizcdrqj", "dpydn", "yhxdeoejzicwi"))
                                .withBytesToCapturePerPacket(6694189583402716643L)
                                .withTotalBytesPerSession(1558927295996088992L)
                                .withTimeLimitInSeconds(1731680066)));
        model = BinaryData.fromObject(model).toObject(PacketCaptureListResult.class);
        Assertions.assertEquals("b", model.value().get(0).networkInterfaces().get(0));
        Assertions.assertEquals(8119628141774012024L, model.value().get(0).bytesToCapturePerPacket());
        Assertions.assertEquals(6075438403018061337L, model.value().get(0).totalBytesPerSession());
        Assertions.assertEquals(223654021, model.value().get(0).timeLimitInSeconds());
    }
}
