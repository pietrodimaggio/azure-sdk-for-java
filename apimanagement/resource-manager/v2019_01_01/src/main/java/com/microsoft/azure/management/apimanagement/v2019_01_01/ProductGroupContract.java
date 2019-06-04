/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.apimanagement.v2019_01_01.implementation.GroupContractInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2019_01_01.implementation.ApiManagementManager;

/**
 * Type representing ProductGroupContract.
 */
public interface ProductGroupContract extends HasInner<GroupContractInner>, Indexable, Updatable<ProductGroupContract.Update>, HasManager<ApiManagementManager> {
    /**
     * @return the builtIn value.
     */
    Boolean builtIn();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the externalId value.
     */
    String externalId();

    /**
     * @return the groupContractType value.
     */
    GroupType groupContractType();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ProductGroupContract definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithProduct, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ProductGroupContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ProductGroupContract definition.
         */
        interface Blank extends WithProduct {
        }

        /**
         * The stage of the productgroupcontract definition allowing to specify Product.
         */
        interface WithProduct {
           /**
            * Specifies resourceGroupName, serviceName, productId.
            * @param resourceGroupName The name of the resource group
            * @param serviceName The name of the API Management service
            * @param productId Product identifier. Must be unique in the current API Management service instance
            * @return the next definition stage
            */
            WithCreate withExistingProduct(String resourceGroupName, String serviceName, String productId);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ProductGroupContract> {
        }
    }
    /**
     * The template for a ProductGroupContract update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ProductGroupContract> {
    }

    /**
     * Grouping of ProductGroupContract update stages.
     */
    interface UpdateStages {
    }
}
