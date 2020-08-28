/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.storage.implementation;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.resources.fluentcore.model.implementation.WrapperImpl;
import com.microsoft.azure.management.storage.ManagementPolicies;
import com.microsoft.azure.management.storage.ManagementPolicy;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;

@LangDefinition
class ManagementPoliciesImpl extends WrapperImpl<ManagementPoliciesInner> implements ManagementPolicies {
    private final StorageManager manager;

    ManagementPoliciesImpl(StorageManager manager) {
        super(manager.inner().managementPolicies());
        this.manager = manager;
    }

    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public ManagementPolicyImpl define(String name) {
        return wrapModel(name);
    }

    private ManagementPolicyImpl wrapModel(ManagementPolicyInner inner) {
        return new ManagementPolicyImpl(inner, manager());
    }

    private ManagementPolicyImpl wrapModel(String name) {
        return new ManagementPolicyImpl(name, this.manager());
    }

    @Override
    public Observable<ManagementPolicy> getAsync(String resourceGroupName, String accountName) {
        ManagementPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName)
                .map(new Func1<ManagementPolicyInner, ManagementPolicy>() {
                    @Override
                    public ManagementPolicy call(ManagementPolicyInner inner) {
                        return wrapModel(inner);
                    }
                });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName) {
        ManagementPoliciesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName).toCompletable();
    }

}
