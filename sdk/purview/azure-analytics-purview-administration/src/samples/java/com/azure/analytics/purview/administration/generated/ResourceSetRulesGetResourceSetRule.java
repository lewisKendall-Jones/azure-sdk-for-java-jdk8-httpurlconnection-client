// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.administration.generated;

import com.azure.analytics.purview.administration.PurviewAccountClientBuilder;
import com.azure.analytics.purview.administration.ResourceSetRulesClient;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class ResourceSetRulesGetResourceSetRule {
    public static void main(String[] args) {
        ResourceSetRulesClient client =
                new PurviewAccountClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{endpoint}")
                        .buildResourceSetRulesClient();
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = client.getResourceSetRuleWithResponse(requestOptions);
    }
}