/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2019_01_01.UserConfirmationPasswords;
import rx.Completable;

class UserConfirmationPasswordsImpl extends WrapperImpl<UserConfirmationPasswordsInner> implements UserConfirmationPasswords {
    private final ApiManagementManager manager;

    UserConfirmationPasswordsImpl(ApiManagementManager manager) {
        super(manager.inner().userConfirmationPasswords());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Completable sendAsync(String resourceGroupName, String serviceName, String userId) {
        UserConfirmationPasswordsInner client = this.inner();
        return client.sendAsync(resourceGroupName, serviceName, userId).toCompletable();
    }

}
