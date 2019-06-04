/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.apimanagement.v2019_01_01.implementation.IssueCommentContractInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2019_01_01.implementation.ApiManagementManager;
import org.joda.time.DateTime;

/**
 * Type representing IssueCommentContract.
 */
public interface IssueCommentContract extends HasInner<IssueCommentContractInner>, Indexable, Refreshable<IssueCommentContract>, Updatable<IssueCommentContract.Update>, HasManager<ApiManagementManager> {
    /**
     * @return the createdDate value.
     */
    DateTime createdDate();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the text value.
     */
    String text();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the userId value.
     */
    String userId();

    /**
     * The entirety of the IssueCommentContract definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithIssue, DefinitionStages.WithIfMatch, DefinitionStages.WithText, DefinitionStages.WithUserId, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of IssueCommentContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a IssueCommentContract definition.
         */
        interface Blank extends WithIssue {
        }

        /**
         * The stage of the issuecommentcontract definition allowing to specify Issue.
         */
        interface WithIssue {
           /**
            * Specifies resourceGroupName, serviceName, apiId, issueId.
            * @param resourceGroupName The name of the resource group
            * @param serviceName The name of the API Management service
            * @param apiId API identifier. Must be unique in the current API Management service instance
            * @param issueId Issue identifier. Must be unique in the current API Management service instance
            * @return the next definition stage
            */
            WithIfMatch withExistingIssue(String resourceGroupName, String serviceName, String apiId, String issueId);
        }

        /**
         * The stage of the issuecommentcontract definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
            * @return the next definition stage
            */
            WithText withIfMatch(String ifMatch);
        }

        /**
         * The stage of the issuecommentcontract definition allowing to specify Text.
         */
        interface WithText {
           /**
            * Specifies text.
            * @param text Comment text
            * @return the next definition stage
            */
            WithUserId withText(String text);
        }

        /**
         * The stage of the issuecommentcontract definition allowing to specify UserId.
         */
        interface WithUserId {
           /**
            * Specifies userId.
            * @param userId A resource identifier for the user who left the comment
            * @return the next definition stage
            */
            WithCreate withUserId(String userId);
        }

        /**
         * The stage of the issuecommentcontract definition allowing to specify CreatedDate.
         */
        interface WithCreatedDate {
            /**
             * Specifies createdDate.
             * @param createdDate Date and time when the comment was created
             * @return the next definition stage
             */
            WithCreate withCreatedDate(DateTime createdDate);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<IssueCommentContract>, DefinitionStages.WithCreatedDate {
        }
    }
    /**
     * The template for a IssueCommentContract update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<IssueCommentContract>, UpdateStages.WithIfMatch, UpdateStages.WithCreatedDate {
    }

    /**
     * Grouping of IssueCommentContract update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the issuecommentcontract update allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
             * @return the next update stage
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the issuecommentcontract update allowing to specify CreatedDate.
         */
        interface WithCreatedDate {
            /**
             * Specifies createdDate.
             * @param createdDate Date and time when the comment was created
             * @return the next update stage
             */
            Update withCreatedDate(DateTime createdDate);
        }

    }
}
