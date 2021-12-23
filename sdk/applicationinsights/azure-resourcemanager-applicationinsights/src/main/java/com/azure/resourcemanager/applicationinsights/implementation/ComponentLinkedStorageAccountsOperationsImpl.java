// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.applicationinsights.fluent.ComponentLinkedStorageAccountsOperationsClient;
import com.azure.resourcemanager.applicationinsights.fluent.models.ComponentLinkedStorageAccountsInner;
import com.azure.resourcemanager.applicationinsights.models.ComponentLinkedStorageAccounts;
import com.azure.resourcemanager.applicationinsights.models.ComponentLinkedStorageAccountsOperations;
import com.azure.resourcemanager.applicationinsights.models.StorageType;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ComponentLinkedStorageAccountsOperationsImpl implements ComponentLinkedStorageAccountsOperations {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ComponentLinkedStorageAccountsOperationsImpl.class);

    private final ComponentLinkedStorageAccountsOperationsClient innerClient;

    private final com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager;

    public ComponentLinkedStorageAccountsOperationsImpl(
        ComponentLinkedStorageAccountsOperationsClient innerClient,
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ComponentLinkedStorageAccounts get(String resourceGroupName, String resourceName, StorageType storageType) {
        ComponentLinkedStorageAccountsInner inner =
            this.serviceClient().get(resourceGroupName, resourceName, storageType);
        if (inner != null) {
            return new ComponentLinkedStorageAccountsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ComponentLinkedStorageAccounts> getWithResponse(
        String resourceGroupName, String resourceName, StorageType storageType, Context context) {
        Response<ComponentLinkedStorageAccountsInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, resourceName, storageType, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ComponentLinkedStorageAccountsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String resourceName, StorageType storageType) {
        this.serviceClient().delete(resourceGroupName, resourceName, storageType);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String resourceName, StorageType storageType, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, resourceName, storageType, context);
    }

    public ComponentLinkedStorageAccounts getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "components");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'components'.", id)));
        }
        StorageType storageType = StorageType.fromString(Utils.getValueFromIdByName(id, "linkedStorageAccounts"));
        if (storageType == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'linkedStorageAccounts'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, resourceName, storageType, Context.NONE).getValue();
    }

    public Response<ComponentLinkedStorageAccounts> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "components");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'components'.", id)));
        }
        StorageType storageType = StorageType.fromString(Utils.getValueFromIdByName(id, "linkedStorageAccounts"));
        if (storageType == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'linkedStorageAccounts'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, resourceName, storageType, context);
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
        String resourceName = Utils.getValueFromIdByName(id, "components");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'components'.", id)));
        }
        StorageType storageType = StorageType.fromString(Utils.getValueFromIdByName(id, "linkedStorageAccounts"));
        if (storageType == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'linkedStorageAccounts'.",
                                id)));
        }
        this.deleteWithResponse(resourceGroupName, resourceName, storageType, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "components");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'components'.", id)));
        }
        StorageType storageType = StorageType.fromString(Utils.getValueFromIdByName(id, "linkedStorageAccounts"));
        if (storageType == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'linkedStorageAccounts'.",
                                id)));
        }
        return this.deleteWithResponse(resourceGroupName, resourceName, storageType, context);
    }

    private ComponentLinkedStorageAccountsOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }

    public ComponentLinkedStorageAccountsImpl define(StorageType name) {
        return new ComponentLinkedStorageAccountsImpl(name, this.manager());
    }
}