// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FlexibleServerEditionCapability;

public final class FlexibleServerEditionCapabilityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FlexibleServerEditionCapability model =
            BinaryData
                .fromString(
                    "{\"name\":\"zvyifqrvkdvj\",\"supportedStorageEditions\":[{\"name\":\"mvvd\",\"supportedStorageMB\":[{\"name\":\"kpnpulexxbczwtr\",\"supportedIops\":4653794584543146117,\"storageSizeMB\":1317414773933917011,\"supportedUpgradableTierList\":[{},{},{}],\"status\":\"ovm\"},{\"name\":\"kacspkw\",\"supportedIops\":9019954696773982094,\"storageSizeMB\":7249564448679749970,\"supportedUpgradableTierList\":[{},{},{}],\"status\":\"flbvvnchrkcciwwz\"}],\"status\":\"qkhr\"}],\"supportedServerVersions\":[{\"name\":\"wkuofoskghsauu\",\"supportedVersionsToUpgrade\":[\"mvxi\",\"duugidyjr\"],\"supportedVcores\":[{\"name\":\"aos\",\"vCores\":2143456307324889666,\"supportedIops\":4051313136213287553,\"supportedMemoryPerVcoreMB\":287468799693076440,\"status\":\"ocohslkevleg\"}],\"status\":\"fbuhfmvfaxkffe\"},{\"name\":\"th\",\"supportedVersionsToUpgrade\":[\"ez\"],\"supportedVcores\":[{\"name\":\"xmzsbbzogg\",\"vCores\":7717795130142477786,\"supportedIops\":3568340417000656363,\"supportedMemoryPerVcoreMB\":8593552720128453851,\"status\":\"xjnspy\"},{\"name\":\"tko\",\"vCores\":3980056682158656120,\"supportedIops\":3290062663385259489,\"supportedMemoryPerVcoreMB\":316131865784554272,\"status\":\"tiukbldngkpoci\"},{\"name\":\"z\",\"vCores\":911296392791855673,\"supportedIops\":7699505413324678544,\"supportedMemoryPerVcoreMB\":675318684186893935,\"status\":\"iucgygevqzn\"},{\"name\":\"pmr\",\"vCores\":557239132862310129,\"supportedIops\":8926601809796435270,\"supportedMemoryPerVcoreMB\":229202411338757943,\"status\":\"pyd\"}],\"status\":\"yhxdeoejzicwi\"},{\"name\":\"jttgzf\",\"supportedVersionsToUpgrade\":[\"hcbkhajde\",\"eamdp\",\"agalpbuxwgipwhon\",\"wkgshwa\"],\"supportedVcores\":[{\"name\":\"zbinjeputtm\",\"vCores\":8855720569573412705,\"supportedIops\":9169702468107282807,\"supportedMemoryPerVcoreMB\":2762275817927994814,\"status\":\"yqzrnkcqvyxlw\"},{\"name\":\"lsicohoqqnwv\",\"vCores\":3263586208444372741,\"supportedIops\":1033785149258539896,\"supportedMemoryPerVcoreMB\":3153727360520202232,\"status\":\"mmqhgyxzkonocuk\"},{\"name\":\"lyaxuc\",\"vCores\":6528833878276793812,\"supportedIops\":1922016953134738106,\"supportedMemoryPerVcoreMB\":2514389459149223363,\"status\":\"pewr\"},{\"name\":\"mwvvjektcxsenhw\",\"vCores\":961124014694533513,\"supportedIops\":4986041102570951835,\"supportedMemoryPerVcoreMB\":8621829788027916589,\"status\":\"qdqgbi\"}],\"status\":\"lihkaetcktvfc\"},{\"name\":\"fsnkymuctq\",\"supportedVersionsToUpgrade\":[\"bebrjcxerfuwuttt\",\"fvjrbirphxepcy\",\"ahfn\"],\"supportedVcores\":[{\"name\":\"qxj\",\"vCores\":8484849300760600701,\"supportedIops\":8463316449918745617,\"supportedMemoryPerVcoreMB\":2270588281817751740,\"status\":\"jljyoxgv\"},{\"name\":\"tbgsncghkj\",\"vCores\":1424414082099964347,\"supportedIops\":4319774285609495271,\"supportedMemoryPerVcoreMB\":8613430323770215410,\"status\":\"fvgxbfsmxneh\"},{\"name\":\"vecxgodebfqkk\",\"vCores\":8422654337875438873,\"supportedIops\":3982659969367884384,\"supportedMemoryPerVcoreMB\":2067637314540840468,\"status\":\"lzlfbxzpuz\"},{\"name\":\"ispnqzahmgkbrp\",\"vCores\":7247932824726952770,\"supportedIops\":762877145565948123,\"supportedMemoryPerVcoreMB\":1340075206936885297,\"status\":\"pikad\"}],\"status\":\"vtq\"}],\"status\":\"n\"}")
                .toObject(FlexibleServerEditionCapability.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FlexibleServerEditionCapability model = new FlexibleServerEditionCapability();
        model = BinaryData.fromObject(model).toObject(FlexibleServerEditionCapability.class);
    }
}
