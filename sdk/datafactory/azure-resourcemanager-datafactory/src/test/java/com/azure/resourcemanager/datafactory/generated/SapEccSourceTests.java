// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SapEccSource;

public final class SapEccSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapEccSource model =
            BinaryData
                .fromString(
                    "{\"type\":\"SapEccSource\",\"query\":\"datacgcdfelvap\",\"httpRequestTimeout\":\"databicjzntiblxeygo\",\"queryTimeout\":\"datahroi\",\"additionalColumns\":\"datatg\",\"sourceRetryCount\":\"dataymoanpkcmdixiu\",\"sourceRetryWait\":\"databc\",\"maxConcurrentConnections\":\"datagspzoafprzlvho\",\"disableMetricsCollection\":\"datakc\",\"\":{\"e\":\"datadzposmnmky\",\"avxea\":\"datamuueoxmkru\",\"pjaekbwbxvsyt\":\"datamflchwpfunptsr\"}}")
                .toObject(SapEccSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapEccSource model =
            new SapEccSource()
                .withSourceRetryCount("dataymoanpkcmdixiu")
                .withSourceRetryWait("databc")
                .withMaxConcurrentConnections("datagspzoafprzlvho")
                .withDisableMetricsCollection("datakc")
                .withQueryTimeout("datahroi")
                .withAdditionalColumns("datatg")
                .withQuery("datacgcdfelvap")
                .withHttpRequestTimeout("databicjzntiblxeygo");
        model = BinaryData.fromObject(model).toObject(SapEccSource.class);
    }
}
