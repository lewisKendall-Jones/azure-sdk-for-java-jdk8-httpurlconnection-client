// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.securityinsights.fluent.models.RelationInner;

/** An immutable client-side representation of Relation. */
public interface Relation {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the etag property: Etag of the azure resource.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the relatedResourceId property: The resource ID of the related resource.
     *
     * @return the relatedResourceId value.
     */
    String relatedResourceId();

    /**
     * Gets the relatedResourceName property: The name of the related resource.
     *
     * @return the relatedResourceName value.
     */
    String relatedResourceName();

    /**
     * Gets the relatedResourceType property: The resource type of the related resource.
     *
     * @return the relatedResourceType value.
     */
    String relatedResourceType();

    /**
     * Gets the relatedResourceKind property: The resource kind of the related resource.
     *
     * @return the relatedResourceKind value.
     */
    String relatedResourceKind();

    /**
     * Gets the inner com.azure.resourcemanager.securityinsights.fluent.models.RelationInner object.
     *
     * @return the inner object.
     */
    RelationInner innerModel();

    /** The entirety of the Relation definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The Relation definition stages. */
    interface DefinitionStages {
        /** The first stage of the Relation definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Relation definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName, bookmarkId.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param workspaceName The name of the workspace.
             * @param bookmarkId Bookmark ID.
             * @return the next definition stage.
             */
            WithCreate withExistingBookmark(String resourceGroupName, String workspaceName, String bookmarkId);
        }
        /**
         * The stage of the Relation definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithEtag, DefinitionStages.WithRelatedResourceId {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Relation create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Relation create(Context context);
        }
        /** The stage of the Relation definition allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: Etag of the azure resource.
             *
             * @param etag Etag of the azure resource.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
        /** The stage of the Relation definition allowing to specify relatedResourceId. */
        interface WithRelatedResourceId {
            /**
             * Specifies the relatedResourceId property: The resource ID of the related resource.
             *
             * @param relatedResourceId The resource ID of the related resource.
             * @return the next definition stage.
             */
            WithCreate withRelatedResourceId(String relatedResourceId);
        }
    }
    /**
     * Begins update for the Relation resource.
     *
     * @return the stage of resource update.
     */
    Relation.Update update();

    /** The template for Relation update. */
    interface Update extends UpdateStages.WithEtag, UpdateStages.WithRelatedResourceId {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Relation apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Relation apply(Context context);
    }
    /** The Relation update stages. */
    interface UpdateStages {
        /** The stage of the Relation update allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: Etag of the azure resource.
             *
             * @param etag Etag of the azure resource.
             * @return the next definition stage.
             */
            Update withEtag(String etag);
        }
        /** The stage of the Relation update allowing to specify relatedResourceId. */
        interface WithRelatedResourceId {
            /**
             * Specifies the relatedResourceId property: The resource ID of the related resource.
             *
             * @param relatedResourceId The resource ID of the related resource.
             * @return the next definition stage.
             */
            Update withRelatedResourceId(String relatedResourceId);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Relation refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Relation refresh(Context context);
}