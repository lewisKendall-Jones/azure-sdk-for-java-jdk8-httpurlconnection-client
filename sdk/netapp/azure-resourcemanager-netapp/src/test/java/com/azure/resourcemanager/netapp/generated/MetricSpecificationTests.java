// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.Dimension;
import com.azure.resourcemanager.netapp.models.MetricAggregationType;
import com.azure.resourcemanager.netapp.models.MetricSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MetricSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MetricSpecification model =
            BinaryData
                .fromString(
                    "{\"name\":\"whybcib\",\"displayName\":\"vdcsitynn\",\"displayDescription\":\"mdectehfiqscjey\",\"unit\":\"hezrkgq\",\"supportedAggregationTypes\":[\"Average\",\"Average\",\"Average\",\"Average\"],\"supportedTimeGrainTypes\":[\"mkqsleyyv\"],\"internalMetricName\":\"qjpkcattpngjcrc\",\"enableRegionalMdmAccount\":true,\"sourceMdmAccount\":\"pjhvmdajvnys\",\"sourceMdmNamespace\":\"nqecanoaeup\",\"dimensions\":[{\"name\":\"ltrpmopj\",\"displayName\":\"matuok\"},{\"name\":\"fu\",\"displayName\":\"aodsfcpkv\"},{\"name\":\"dpuozmyz\",\"displayName\":\"agfuaxbezyiu\"},{\"name\":\"ktwh\",\"displayName\":\"xw\"}],\"aggregationType\":\"wqsmbsur\",\"fillGapWithZero\":true,\"category\":\"o\",\"resourceIdDimensionNameOverride\":\"ocfs\",\"isInternal\":false}")
                .toObject(MetricSpecification.class);
        Assertions.assertEquals("whybcib", model.name());
        Assertions.assertEquals("vdcsitynn", model.displayName());
        Assertions.assertEquals("mdectehfiqscjey", model.displayDescription());
        Assertions.assertEquals("hezrkgq", model.unit());
        Assertions.assertEquals(MetricAggregationType.AVERAGE, model.supportedAggregationTypes().get(0));
        Assertions.assertEquals("mkqsleyyv", model.supportedTimeGrainTypes().get(0));
        Assertions.assertEquals("qjpkcattpngjcrc", model.internalMetricName());
        Assertions.assertEquals(true, model.enableRegionalMdmAccount());
        Assertions.assertEquals("pjhvmdajvnys", model.sourceMdmAccount());
        Assertions.assertEquals("nqecanoaeup", model.sourceMdmNamespace());
        Assertions.assertEquals("ltrpmopj", model.dimensions().get(0).name());
        Assertions.assertEquals("matuok", model.dimensions().get(0).displayName());
        Assertions.assertEquals("wqsmbsur", model.aggregationType());
        Assertions.assertEquals(true, model.fillGapWithZero());
        Assertions.assertEquals("o", model.category());
        Assertions.assertEquals("ocfs", model.resourceIdDimensionNameOverride());
        Assertions.assertEquals(false, model.isInternal());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MetricSpecification model =
            new MetricSpecification()
                .withName("whybcib")
                .withDisplayName("vdcsitynn")
                .withDisplayDescription("mdectehfiqscjey")
                .withUnit("hezrkgq")
                .withSupportedAggregationTypes(
                    Arrays
                        .asList(
                            MetricAggregationType.AVERAGE,
                            MetricAggregationType.AVERAGE,
                            MetricAggregationType.AVERAGE,
                            MetricAggregationType.AVERAGE))
                .withSupportedTimeGrainTypes(Arrays.asList("mkqsleyyv"))
                .withInternalMetricName("qjpkcattpngjcrc")
                .withEnableRegionalMdmAccount(true)
                .withSourceMdmAccount("pjhvmdajvnys")
                .withSourceMdmNamespace("nqecanoaeup")
                .withDimensions(
                    Arrays
                        .asList(
                            new Dimension().withName("ltrpmopj").withDisplayName("matuok"),
                            new Dimension().withName("fu").withDisplayName("aodsfcpkv"),
                            new Dimension().withName("dpuozmyz").withDisplayName("agfuaxbezyiu"),
                            new Dimension().withName("ktwh").withDisplayName("xw")))
                .withAggregationType("wqsmbsur")
                .withFillGapWithZero(true)
                .withCategory("o")
                .withResourceIdDimensionNameOverride("ocfs")
                .withIsInternal(false);
        model = BinaryData.fromObject(model).toObject(MetricSpecification.class);
        Assertions.assertEquals("whybcib", model.name());
        Assertions.assertEquals("vdcsitynn", model.displayName());
        Assertions.assertEquals("mdectehfiqscjey", model.displayDescription());
        Assertions.assertEquals("hezrkgq", model.unit());
        Assertions.assertEquals(MetricAggregationType.AVERAGE, model.supportedAggregationTypes().get(0));
        Assertions.assertEquals("mkqsleyyv", model.supportedTimeGrainTypes().get(0));
        Assertions.assertEquals("qjpkcattpngjcrc", model.internalMetricName());
        Assertions.assertEquals(true, model.enableRegionalMdmAccount());
        Assertions.assertEquals("pjhvmdajvnys", model.sourceMdmAccount());
        Assertions.assertEquals("nqecanoaeup", model.sourceMdmNamespace());
        Assertions.assertEquals("ltrpmopj", model.dimensions().get(0).name());
        Assertions.assertEquals("matuok", model.dimensions().get(0).displayName());
        Assertions.assertEquals("wqsmbsur", model.aggregationType());
        Assertions.assertEquals(true, model.fillGapWithZero());
        Assertions.assertEquals("o", model.category());
        Assertions.assertEquals("ocfs", model.resourceIdDimensionNameOverride());
        Assertions.assertEquals(false, model.isInternal());
    }
}
