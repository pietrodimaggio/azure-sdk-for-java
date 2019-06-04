/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.apimanagement.v2019_01_01.implementation.AuthorizationServerContractInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2019_01_01.implementation.ApiManagementManager;
import java.util.List;

/**
 * Type representing AuthorizationServerContract.
 */
public interface AuthorizationServerContract extends HasInner<AuthorizationServerContractInner>, Indexable, Updatable<AuthorizationServerContract.Update>, HasManager<ApiManagementManager> {
    /**
     * @return the authorizationEndpoint value.
     */
    String authorizationEndpoint();

    /**
     * @return the authorizationMethods value.
     */
    List<AuthorizationMethod> authorizationMethods();

    /**
     * @return the bearerTokenSendingMethods value.
     */
    List<BearerTokenSendingMethod> bearerTokenSendingMethods();

    /**
     * @return the clientAuthenticationMethod value.
     */
    List<ClientAuthenticationMethod> clientAuthenticationMethod();

    /**
     * @return the clientId value.
     */
    String clientId();

    /**
     * @return the clientRegistrationEndpoint value.
     */
    String clientRegistrationEndpoint();

    /**
     * @return the clientSecret value.
     */
    String clientSecret();

    /**
     * @return the defaultScope value.
     */
    String defaultScope();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the grantTypes value.
     */
    List<GrantType> grantTypes();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the resourceOwnerPassword value.
     */
    String resourceOwnerPassword();

    /**
     * @return the resourceOwnerUsername value.
     */
    String resourceOwnerUsername();

    /**
     * @return the supportState value.
     */
    Boolean supportState();

    /**
     * @return the tokenBodyParameters value.
     */
    List<TokenBodyParameterContract> tokenBodyParameters();

    /**
     * @return the tokenEndpoint value.
     */
    String tokenEndpoint();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the AuthorizationServerContract definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithResourceGroupName, DefinitionStages.WithServiceName, DefinitionStages.WithIfMatch, DefinitionStages.WithAuthorizationEndpoint, DefinitionStages.WithClientId, DefinitionStages.WithClientRegistrationEndpoint, DefinitionStages.WithDisplayName, DefinitionStages.WithGrantTypes, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of AuthorizationServerContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a AuthorizationServerContract definition.
         */
        interface Blank extends WithResourceGroupName {
        }

        /**
         * The stage of the authorizationservercontract definition allowing to specify ResourceGroupName.
         */
        interface WithResourceGroupName {
           /**
            * Specifies resourceGroupName.
            * @param resourceGroupName The name of the resource group
            * @return the next definition stage
            */
            WithServiceName withResourceGroupName(String resourceGroupName);
        }

        /**
         * The stage of the authorizationservercontract definition allowing to specify ServiceName.
         */
        interface WithServiceName {
           /**
            * Specifies serviceName.
            * @param serviceName The name of the API Management service
            * @return the next definition stage
            */
            WithIfMatch withServiceName(String serviceName);
        }

        /**
         * The stage of the authorizationservercontract definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
            * @return the next definition stage
            */
            WithAuthorizationEndpoint withIfMatch(String ifMatch);
        }

        /**
         * The stage of the authorizationservercontract definition allowing to specify AuthorizationEndpoint.
         */
        interface WithAuthorizationEndpoint {
           /**
            * Specifies authorizationEndpoint.
            * @param authorizationEndpoint OAuth authorization endpoint. See http://tools.ietf.org/html/rfc6749#section-3.2
            * @return the next definition stage
            */
            WithClientId withAuthorizationEndpoint(String authorizationEndpoint);
        }

        /**
         * The stage of the authorizationservercontract definition allowing to specify ClientId.
         */
        interface WithClientId {
           /**
            * Specifies clientId.
            * @param clientId Client or app id registered with this authorization server
            * @return the next definition stage
            */
            WithClientRegistrationEndpoint withClientId(String clientId);
        }

        /**
         * The stage of the authorizationservercontract definition allowing to specify ClientRegistrationEndpoint.
         */
        interface WithClientRegistrationEndpoint {
           /**
            * Specifies clientRegistrationEndpoint.
            * @param clientRegistrationEndpoint Optional reference to a page where client or app registration for this authorization server is performed. Contains absolute URL to entity being referenced
            * @return the next definition stage
            */
            WithDisplayName withClientRegistrationEndpoint(String clientRegistrationEndpoint);
        }

        /**
         * The stage of the authorizationservercontract definition allowing to specify DisplayName.
         */
        interface WithDisplayName {
           /**
            * Specifies displayName.
            * @param displayName User-friendly authorization server name
            * @return the next definition stage
            */
            WithGrantTypes withDisplayName(String displayName);
        }

        /**
         * The stage of the authorizationservercontract definition allowing to specify GrantTypes.
         */
        interface WithGrantTypes {
           /**
            * Specifies grantTypes.
            * @param grantTypes Form of an authorization grant, which the client uses to request the access token
            * @return the next definition stage
            */
            WithCreate withGrantTypes(List<GrantType> grantTypes);
        }

        /**
         * The stage of the authorizationservercontract definition allowing to specify AuthorizationMethods.
         */
        interface WithAuthorizationMethods {
            /**
             * Specifies authorizationMethods.
             * @param authorizationMethods HTTP verbs supported by the authorization endpoint. GET must be always present. POST is optional
             * @return the next definition stage
             */
            WithCreate withAuthorizationMethods(List<AuthorizationMethod> authorizationMethods);
        }

        /**
         * The stage of the authorizationservercontract definition allowing to specify BearerTokenSendingMethods.
         */
        interface WithBearerTokenSendingMethods {
            /**
             * Specifies bearerTokenSendingMethods.
             * @param bearerTokenSendingMethods Specifies the mechanism by which access token is passed to the API
             * @return the next definition stage
             */
            WithCreate withBearerTokenSendingMethods(List<BearerTokenSendingMethod> bearerTokenSendingMethods);
        }

        /**
         * The stage of the authorizationservercontract definition allowing to specify ClientAuthenticationMethod.
         */
        interface WithClientAuthenticationMethod {
            /**
             * Specifies clientAuthenticationMethod.
             * @param clientAuthenticationMethod Method of authentication supported by the token endpoint of this authorization server. Possible values are Basic and/or Body. When Body is specified, client credentials and other parameters are passed within the request body in the application/x-www-form-urlencoded format
             * @return the next definition stage
             */
            WithCreate withClientAuthenticationMethod(List<ClientAuthenticationMethod> clientAuthenticationMethod);
        }

        /**
         * The stage of the authorizationservercontract definition allowing to specify ClientSecret.
         */
        interface WithClientSecret {
            /**
             * Specifies clientSecret.
             * @param clientSecret Client or app secret registered with this authorization server
             * @return the next definition stage
             */
            WithCreate withClientSecret(String clientSecret);
        }

        /**
         * The stage of the authorizationservercontract definition allowing to specify DefaultScope.
         */
        interface WithDefaultScope {
            /**
             * Specifies defaultScope.
             * @param defaultScope Access token scope that is going to be requested by default. Can be overridden at the API level. Should be provided in the form of a string containing space-delimited values
             * @return the next definition stage
             */
            WithCreate withDefaultScope(String defaultScope);
        }

        /**
         * The stage of the authorizationservercontract definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description Description of the authorization server. Can contain HTML formatting tags
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the authorizationservercontract definition allowing to specify ResourceOwnerPassword.
         */
        interface WithResourceOwnerPassword {
            /**
             * Specifies resourceOwnerPassword.
             * @param resourceOwnerPassword Can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner password
             * @return the next definition stage
             */
            WithCreate withResourceOwnerPassword(String resourceOwnerPassword);
        }

        /**
         * The stage of the authorizationservercontract definition allowing to specify ResourceOwnerUsername.
         */
        interface WithResourceOwnerUsername {
            /**
             * Specifies resourceOwnerUsername.
             * @param resourceOwnerUsername Can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner username
             * @return the next definition stage
             */
            WithCreate withResourceOwnerUsername(String resourceOwnerUsername);
        }

        /**
         * The stage of the authorizationservercontract definition allowing to specify SupportState.
         */
        interface WithSupportState {
            /**
             * Specifies supportState.
             * @param supportState If true, authorization server will include state parameter from the authorization request to its response. Client may use state parameter to raise protocol security
             * @return the next definition stage
             */
            WithCreate withSupportState(Boolean supportState);
        }

        /**
         * The stage of the authorizationservercontract definition allowing to specify TokenBodyParameters.
         */
        interface WithTokenBodyParameters {
            /**
             * Specifies tokenBodyParameters.
             * @param tokenBodyParameters Additional parameters required by the token endpoint of this authorization server represented as an array of JSON objects with name and value string properties, i.e. {"name" : "name value", "value": "a value"}
             * @return the next definition stage
             */
            WithCreate withTokenBodyParameters(List<TokenBodyParameterContract> tokenBodyParameters);
        }

        /**
         * The stage of the authorizationservercontract definition allowing to specify TokenEndpoint.
         */
        interface WithTokenEndpoint {
            /**
             * Specifies tokenEndpoint.
             * @param tokenEndpoint OAuth token endpoint. Contains absolute URI to entity being referenced
             * @return the next definition stage
             */
            WithCreate withTokenEndpoint(String tokenEndpoint);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<AuthorizationServerContract>, DefinitionStages.WithAuthorizationMethods, DefinitionStages.WithBearerTokenSendingMethods, DefinitionStages.WithClientAuthenticationMethod, DefinitionStages.WithClientSecret, DefinitionStages.WithDefaultScope, DefinitionStages.WithDescription, DefinitionStages.WithResourceOwnerPassword, DefinitionStages.WithResourceOwnerUsername, DefinitionStages.WithSupportState, DefinitionStages.WithTokenBodyParameters, DefinitionStages.WithTokenEndpoint {
        }
    }
    /**
     * The template for a AuthorizationServerContract update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<AuthorizationServerContract>, UpdateStages.WithIfMatch, UpdateStages.WithAuthorizationMethods, UpdateStages.WithBearerTokenSendingMethods, UpdateStages.WithClientAuthenticationMethod, UpdateStages.WithClientSecret, UpdateStages.WithDefaultScope, UpdateStages.WithDescription, UpdateStages.WithResourceOwnerPassword, UpdateStages.WithResourceOwnerUsername, UpdateStages.WithSupportState, UpdateStages.WithTokenBodyParameters, UpdateStages.WithTokenEndpoint {
    }

    /**
     * Grouping of AuthorizationServerContract update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the authorizationservercontract update allowing to specify IfMatch.
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
         * The stage of the authorizationservercontract update allowing to specify AuthorizationMethods.
         */
        interface WithAuthorizationMethods {
            /**
             * Specifies authorizationMethods.
             * @param authorizationMethods HTTP verbs supported by the authorization endpoint. GET must be always present. POST is optional
             * @return the next update stage
             */
            Update withAuthorizationMethods(List<AuthorizationMethod> authorizationMethods);
        }

        /**
         * The stage of the authorizationservercontract update allowing to specify BearerTokenSendingMethods.
         */
        interface WithBearerTokenSendingMethods {
            /**
             * Specifies bearerTokenSendingMethods.
             * @param bearerTokenSendingMethods Specifies the mechanism by which access token is passed to the API
             * @return the next update stage
             */
            Update withBearerTokenSendingMethods(List<BearerTokenSendingMethod> bearerTokenSendingMethods);
        }

        /**
         * The stage of the authorizationservercontract update allowing to specify ClientAuthenticationMethod.
         */
        interface WithClientAuthenticationMethod {
            /**
             * Specifies clientAuthenticationMethod.
             * @param clientAuthenticationMethod Method of authentication supported by the token endpoint of this authorization server. Possible values are Basic and/or Body. When Body is specified, client credentials and other parameters are passed within the request body in the application/x-www-form-urlencoded format
             * @return the next update stage
             */
            Update withClientAuthenticationMethod(List<ClientAuthenticationMethod> clientAuthenticationMethod);
        }

        /**
         * The stage of the authorizationservercontract update allowing to specify ClientSecret.
         */
        interface WithClientSecret {
            /**
             * Specifies clientSecret.
             * @param clientSecret Client or app secret registered with this authorization server
             * @return the next update stage
             */
            Update withClientSecret(String clientSecret);
        }

        /**
         * The stage of the authorizationservercontract update allowing to specify DefaultScope.
         */
        interface WithDefaultScope {
            /**
             * Specifies defaultScope.
             * @param defaultScope Access token scope that is going to be requested by default. Can be overridden at the API level. Should be provided in the form of a string containing space-delimited values
             * @return the next update stage
             */
            Update withDefaultScope(String defaultScope);
        }

        /**
         * The stage of the authorizationservercontract update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description Description of the authorization server. Can contain HTML formatting tags
             * @return the next update stage
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the authorizationservercontract update allowing to specify ResourceOwnerPassword.
         */
        interface WithResourceOwnerPassword {
            /**
             * Specifies resourceOwnerPassword.
             * @param resourceOwnerPassword Can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner password
             * @return the next update stage
             */
            Update withResourceOwnerPassword(String resourceOwnerPassword);
        }

        /**
         * The stage of the authorizationservercontract update allowing to specify ResourceOwnerUsername.
         */
        interface WithResourceOwnerUsername {
            /**
             * Specifies resourceOwnerUsername.
             * @param resourceOwnerUsername Can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner username
             * @return the next update stage
             */
            Update withResourceOwnerUsername(String resourceOwnerUsername);
        }

        /**
         * The stage of the authorizationservercontract update allowing to specify SupportState.
         */
        interface WithSupportState {
            /**
             * Specifies supportState.
             * @param supportState If true, authorization server will include state parameter from the authorization request to its response. Client may use state parameter to raise protocol security
             * @return the next update stage
             */
            Update withSupportState(Boolean supportState);
        }

        /**
         * The stage of the authorizationservercontract update allowing to specify TokenBodyParameters.
         */
        interface WithTokenBodyParameters {
            /**
             * Specifies tokenBodyParameters.
             * @param tokenBodyParameters Additional parameters required by the token endpoint of this authorization server represented as an array of JSON objects with name and value string properties, i.e. {"name" : "name value", "value": "a value"}
             * @return the next update stage
             */
            Update withTokenBodyParameters(List<TokenBodyParameterContract> tokenBodyParameters);
        }

        /**
         * The stage of the authorizationservercontract update allowing to specify TokenEndpoint.
         */
        interface WithTokenEndpoint {
            /**
             * Specifies tokenEndpoint.
             * @param tokenEndpoint OAuth token endpoint. Contains absolute URI to entity being referenced
             * @return the next update stage
             */
            Update withTokenEndpoint(String tokenEndpoint);
        }

    }
}
