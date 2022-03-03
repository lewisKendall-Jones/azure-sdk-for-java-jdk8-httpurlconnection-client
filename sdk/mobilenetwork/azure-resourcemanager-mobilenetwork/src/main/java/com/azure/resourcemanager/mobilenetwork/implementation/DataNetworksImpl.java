// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.fluent.DataNetworksClient;
import com.azure.resourcemanager.mobilenetwork.fluent.models.DataNetworkInner;
import com.azure.resourcemanager.mobilenetwork.models.DataNetwork;
import com.azure.resourcemanager.mobilenetwork.models.DataNetworks;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DataNetworksImpl implements DataNetworks {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataNetworksImpl.class);

    private final DataNetworksClient innerClient;

    private final com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager;

    public DataNetworksImpl(
        DataNetworksClient innerClient, com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String mobileNetworkName, String dataNetworkName) {
        this.serviceClient().delete(resourceGroupName, mobileNetworkName, dataNetworkName);
    }

    public void delete(String resourceGroupName, String mobileNetworkName, String dataNetworkName, Context context) {
        this.serviceClient().delete(resourceGroupName, mobileNetworkName, dataNetworkName, context);
    }

    public DataNetwork get(String resourceGroupName, String mobileNetworkName, String dataNetworkName) {
        DataNetworkInner inner = this.serviceClient().get(resourceGroupName, mobileNetworkName, dataNetworkName);
        if (inner != null) {
            return new DataNetworkImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DataNetwork> getWithResponse(
        String resourceGroupName, String mobileNetworkName, String dataNetworkName, Context context) {
        Response<DataNetworkInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, mobileNetworkName, dataNetworkName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DataNetworkImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<DataNetwork> listByMobileNetwork(String resourceGroupName, String mobileNetworkName) {
        PagedIterable<DataNetworkInner> inner =
            this.serviceClient().listByMobileNetwork(resourceGroupName, mobileNetworkName);
        return Utils.mapPage(inner, inner1 -> new DataNetworkImpl(inner1, this.manager()));
    }

    public PagedIterable<DataNetwork> listByMobileNetwork(
        String resourceGroupName, String mobileNetworkName, Context context) {
        PagedIterable<DataNetworkInner> inner =
            this.serviceClient().listByMobileNetwork(resourceGroupName, mobileNetworkName, context);
        return Utils.mapPage(inner, inner1 -> new DataNetworkImpl(inner1, this.manager()));
    }

    public DataNetwork getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String mobileNetworkName = Utils.getValueFromIdByName(id, "mobileNetworks");
        if (mobileNetworkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'mobileNetworks'.", id)));
        }
        String dataNetworkName = Utils.getValueFromIdByName(id, "dataNetworks");
        if (dataNetworkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataNetworks'.", id)));
        }
        return this.getWithResponse(resourceGroupName, mobileNetworkName, dataNetworkName, Context.NONE).getValue();
    }

    public Response<DataNetwork> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String mobileNetworkName = Utils.getValueFromIdByName(id, "mobileNetworks");
        if (mobileNetworkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'mobileNetworks'.", id)));
        }
        String dataNetworkName = Utils.getValueFromIdByName(id, "dataNetworks");
        if (dataNetworkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataNetworks'.", id)));
        }
        return this.getWithResponse(resourceGroupName, mobileNetworkName, dataNetworkName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String mobileNetworkName = Utils.getValueFromIdByName(id, "mobileNetworks");
        if (mobileNetworkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'mobileNetworks'.", id)));
        }
        String dataNetworkName = Utils.getValueFromIdByName(id, "dataNetworks");
        if (dataNetworkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataNetworks'.", id)));
        }
        this.delete(resourceGroupName, mobileNetworkName, dataNetworkName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String mobileNetworkName = Utils.getValueFromIdByName(id, "mobileNetworks");
        if (mobileNetworkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'mobileNetworks'.", id)));
        }
        String dataNetworkName = Utils.getValueFromIdByName(id, "dataNetworks");
        if (dataNetworkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataNetworks'.", id)));
        }
        this.delete(resourceGroupName, mobileNetworkName, dataNetworkName, context);
    }

    private DataNetworksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager() {
        return this.serviceManager;
    }

    public DataNetworkImpl define(String name) {
        return new DataNetworkImpl(name, this.manager());
    }
}