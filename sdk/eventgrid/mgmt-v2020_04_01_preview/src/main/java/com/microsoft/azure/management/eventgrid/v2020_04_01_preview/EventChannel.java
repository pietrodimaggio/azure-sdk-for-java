/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.implementation.EventChannelInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.implementation.EventGridManager;
import org.joda.time.DateTime;

/**
 * Type representing EventChannel.
 */
public interface EventChannel extends HasInner<EventChannelInner>, Indexable, Refreshable<EventChannel>, Updatable<EventChannel.Update>, HasManager<EventGridManager> {
    /**
     * @return the destination value.
     */
    EventChannelDestination destination();

    /**
     * @return the expirationTimeIfNotActivatedUtc value.
     */
    DateTime expirationTimeIfNotActivatedUtc();

    /**
     * @return the filter value.
     */
    EventChannelFilter filter();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the partnerTopicFriendlyDescription value.
     */
    String partnerTopicFriendlyDescription();

    /**
     * @return the partnerTopicReadinessState value.
     */
    PartnerTopicReadinessState partnerTopicReadinessState();

    /**
     * @return the provisioningState value.
     */
    EventChannelProvisioningState provisioningState();

    /**
     * @return the source value.
     */
    EventChannelSource source();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the EventChannel definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithPartnerNamespace, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of EventChannel definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a EventChannel definition.
         */
        interface Blank extends WithPartnerNamespace {
        }

        /**
         * The stage of the eventchannel definition allowing to specify PartnerNamespace.
         */
        interface WithPartnerNamespace {
           /**
            * Specifies resourceGroupName, partnerNamespaceName.
            * @param resourceGroupName The name of the resource group within the user's subscription
            * @param partnerNamespaceName Name of the partner namespace
            * @return the next definition stage
            */
            WithCreate withExistingPartnerNamespace(String resourceGroupName, String partnerNamespaceName);
        }

        /**
         * The stage of the eventchannel definition allowing to specify Destination.
         */
        interface WithDestination {
            /**
             * Specifies destination.
             * @param destination Represents the destination of an event channel
             * @return the next definition stage
             */
            WithCreate withDestination(EventChannelDestination destination);
        }

        /**
         * The stage of the eventchannel definition allowing to specify ExpirationTimeIfNotActivatedUtc.
         */
        interface WithExpirationTimeIfNotActivatedUtc {
            /**
             * Specifies expirationTimeIfNotActivatedUtc.
             * @param expirationTimeIfNotActivatedUtc Expiration time of the event channel. If this timer expires while the corresponding partner topic is never activated,
 the event channel and corresponding partner topic are deleted
             * @return the next definition stage
             */
            WithCreate withExpirationTimeIfNotActivatedUtc(DateTime expirationTimeIfNotActivatedUtc);
        }

        /**
         * The stage of the eventchannel definition allowing to specify Filter.
         */
        interface WithFilter {
            /**
             * Specifies filter.
             * @param filter Information about the filter for the event channel
             * @return the next definition stage
             */
            WithCreate withFilter(EventChannelFilter filter);
        }

        /**
         * The stage of the eventchannel definition allowing to specify PartnerTopicFriendlyDescription.
         */
        interface WithPartnerTopicFriendlyDescription {
            /**
             * Specifies partnerTopicFriendlyDescription.
             * @param partnerTopicFriendlyDescription Friendly description about the topic. This can be set by the publisher/partner to show custom description for the customer partner topic.
 This will be helpful to remove any ambiguity of the origin of creation of the partner topic for the customer
             * @return the next definition stage
             */
            WithCreate withPartnerTopicFriendlyDescription(String partnerTopicFriendlyDescription);
        }

        /**
         * The stage of the eventchannel definition allowing to specify Source.
         */
        interface WithSource {
            /**
             * Specifies source.
             * @param source Source of the event channel. This represents a unique resource in the partner's resource model
             * @return the next definition stage
             */
            WithCreate withSource(EventChannelSource source);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<EventChannel>, DefinitionStages.WithDestination, DefinitionStages.WithExpirationTimeIfNotActivatedUtc, DefinitionStages.WithFilter, DefinitionStages.WithPartnerTopicFriendlyDescription, DefinitionStages.WithSource {
        }
    }
    /**
     * The template for a EventChannel update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<EventChannel>, UpdateStages.WithDestination, UpdateStages.WithExpirationTimeIfNotActivatedUtc, UpdateStages.WithFilter, UpdateStages.WithPartnerTopicFriendlyDescription, UpdateStages.WithSource {
    }

    /**
     * Grouping of EventChannel update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the eventchannel update allowing to specify Destination.
         */
        interface WithDestination {
            /**
             * Specifies destination.
             * @param destination Represents the destination of an event channel
             * @return the next update stage
             */
            Update withDestination(EventChannelDestination destination);
        }

        /**
         * The stage of the eventchannel update allowing to specify ExpirationTimeIfNotActivatedUtc.
         */
        interface WithExpirationTimeIfNotActivatedUtc {
            /**
             * Specifies expirationTimeIfNotActivatedUtc.
             * @param expirationTimeIfNotActivatedUtc Expiration time of the event channel. If this timer expires while the corresponding partner topic is never activated,
 the event channel and corresponding partner topic are deleted
             * @return the next update stage
             */
            Update withExpirationTimeIfNotActivatedUtc(DateTime expirationTimeIfNotActivatedUtc);
        }

        /**
         * The stage of the eventchannel update allowing to specify Filter.
         */
        interface WithFilter {
            /**
             * Specifies filter.
             * @param filter Information about the filter for the event channel
             * @return the next update stage
             */
            Update withFilter(EventChannelFilter filter);
        }

        /**
         * The stage of the eventchannel update allowing to specify PartnerTopicFriendlyDescription.
         */
        interface WithPartnerTopicFriendlyDescription {
            /**
             * Specifies partnerTopicFriendlyDescription.
             * @param partnerTopicFriendlyDescription Friendly description about the topic. This can be set by the publisher/partner to show custom description for the customer partner topic.
 This will be helpful to remove any ambiguity of the origin of creation of the partner topic for the customer
             * @return the next update stage
             */
            Update withPartnerTopicFriendlyDescription(String partnerTopicFriendlyDescription);
        }

        /**
         * The stage of the eventchannel update allowing to specify Source.
         */
        interface WithSource {
            /**
             * Specifies source.
             * @param source Source of the event channel. This represents a unique resource in the partner's resource model
             * @return the next update stage
             */
            Update withSource(EventChannelSource source);
        }

    }
}