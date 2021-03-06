/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure Active Directory Application.
 */
public class AzureActiveDirectoryApp {
    /**
     * Application ID of the Azure Active Directory Application.
     */
    @JsonProperty(value = "applicationId", required = true)
    private String applicationId;

    /**
     * Key used to authenticate to the Azure Active Directory Application.
     */
    @JsonProperty(value = "appKey", required = true)
    private String appKey;

    /**
     * Tenant id of the customer.
     */
    @JsonProperty(value = "tenantId", required = true)
    private String tenantId;

    /**
     * Get application ID of the Azure Active Directory Application.
     *
     * @return the applicationId value
     */
    public String applicationId() {
        return this.applicationId;
    }

    /**
     * Set application ID of the Azure Active Directory Application.
     *
     * @param applicationId the applicationId value to set
     * @return the AzureActiveDirectoryApp object itself.
     */
    public AzureActiveDirectoryApp withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get key used to authenticate to the Azure Active Directory Application.
     *
     * @return the appKey value
     */
    public String appKey() {
        return this.appKey;
    }

    /**
     * Set key used to authenticate to the Azure Active Directory Application.
     *
     * @param appKey the appKey value to set
     * @return the AzureActiveDirectoryApp object itself.
     */
    public AzureActiveDirectoryApp withAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    /**
     * Get tenant id of the customer.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set tenant id of the customer.
     *
     * @param tenantId the tenantId value to set
     * @return the AzureActiveDirectoryApp object itself.
     */
    public AzureActiveDirectoryApp withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

}
