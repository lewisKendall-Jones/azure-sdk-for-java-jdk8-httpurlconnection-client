// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Extensions. */
public interface Extensions {
    /**
     * List all Extensions under ArcSetting resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param arcSettingName The name of the proxy resource holding details of HCI ArcSetting information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Extensions in HCI cluster as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Extension> listByArcSetting(String resourceGroupName, String clusterName, String arcSettingName);

    /**
     * List all Extensions under ArcSetting resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param arcSettingName The name of the proxy resource holding details of HCI ArcSetting information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Extensions in HCI cluster as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Extension> listByArcSetting(
        String resourceGroupName, String clusterName, String arcSettingName, Context context);

    /**
     * Get particular Arc Extension of HCI Cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param arcSettingName The name of the proxy resource holding details of HCI ArcSetting information.
     * @param extensionName The name of the machine extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return particular Arc Extension of HCI Cluster.
     */
    Extension get(String resourceGroupName, String clusterName, String arcSettingName, String extensionName);

    /**
     * Get particular Arc Extension of HCI Cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param arcSettingName The name of the proxy resource holding details of HCI ArcSetting information.
     * @param extensionName The name of the machine extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return particular Arc Extension of HCI Cluster along with {@link Response}.
     */
    Response<Extension> getWithResponse(
        String resourceGroupName, String clusterName, String arcSettingName, String extensionName, Context context);

    /**
     * Delete particular Arc Extension of HCI Cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param arcSettingName The name of the proxy resource holding details of HCI ArcSetting information.
     * @param extensionName The name of the machine extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String clusterName, String arcSettingName, String extensionName);

    /**
     * Delete particular Arc Extension of HCI Cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param arcSettingName The name of the proxy resource holding details of HCI ArcSetting information.
     * @param extensionName The name of the machine extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName, String clusterName, String arcSettingName, String extensionName, Context context);

    /**
     * Get particular Arc Extension of HCI Cluster.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return particular Arc Extension of HCI Cluster along with {@link Response}.
     */
    Extension getById(String id);

    /**
     * Get particular Arc Extension of HCI Cluster.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return particular Arc Extension of HCI Cluster along with {@link Response}.
     */
    Response<Extension> getByIdWithResponse(String id, Context context);

    /**
     * Delete particular Arc Extension of HCI Cluster.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete particular Arc Extension of HCI Cluster.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Extension resource.
     *
     * @param name resource name.
     * @return the first stage of the new Extension definition.
     */
    Extension.DefinitionStages.Blank define(String name);
}