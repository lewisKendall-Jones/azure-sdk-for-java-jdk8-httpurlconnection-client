// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.OperationListResultInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Operation;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationListResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationListResultInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"hgwxrtfudx\",\"display\":{\"provider\":\"gyqagvrvmnpkuk\",\"resource\":\"i\",\"operation\":\"blxgwimf\",\"description\":\"hfjx\"},\"isDataAction\":true,\"origin\":\"user\",\"properties\":{\"a\":\"dataoqreyfkzikfjawn\",\"elpcirelsfeaenwa\":\"datavxwc\",\"xbjhwuaanozjosph\":\"datafatkld\"}},{\"name\":\"ulpjr\",\"display\":{\"provider\":\"glrvimjwosytxi\",\"resource\":\"skfc\",\"operation\":\"qumiek\",\"description\":\"zzikhlyfjhdg\"},\"isDataAction\":true,\"origin\":\"user\",\"properties\":{\"qidbqfatpxllrxcy\":\"datanyga\",\"dmjsjqb\":\"datamoadsuvarmy\",\"yc\":\"datahhyxxrw\"}},{\"name\":\"uhpkxkgymar\",\"display\":{\"provider\":\"ajxq\",\"resource\":\"jhkycub\",\"operation\":\"dgssofwqmzqal\",\"description\":\"mnjijpxacqqudf\"},\"isDataAction\":true,\"origin\":\"system\",\"properties\":{\"ayffim\":\"dataabjy\",\"gsexne\":\"datazrtuzq\",\"wmewzsyy\":\"datafdnw\",\"judpfrxt\":\"dataeuzsoi\"}}],\"nextLink\":\"hzv\"}")
                .toObject(OperationListResultInner.class);
        Assertions.assertEquals(true, model.value().get(0).isDataAction());
        Assertions.assertEquals("hzv", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationListResultInner model =
            new OperationListResultInner()
                .withValue(
                    Arrays
                        .asList(
                            new Operation().withIsDataAction(true),
                            new Operation().withIsDataAction(true),
                            new Operation().withIsDataAction(true)))
                .withNextLink("hzv");
        model = BinaryData.fromObject(model).toObject(OperationListResultInner.class);
        Assertions.assertEquals(true, model.value().get(0).isDataAction());
        Assertions.assertEquals("hzv", model.nextLink());
    }
}
