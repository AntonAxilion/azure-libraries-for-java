// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cdn;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The DeliveryRuleCacheExpirationAction model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "name")
@JsonTypeName("CacheExpiration")
@Fluent
public final class DeliveryRuleCacheExpirationAction extends DeliveryRuleAction {
    /*
     * Defines the parameters for the action.
     */
    @JsonProperty(value = "parameters", required = true)
    private CacheExpirationActionParameters parameters;

    /**
     * Get the parameters property: Defines the parameters for the action.
     * 
     * @return the parameters value.
     */
    public CacheExpirationActionParameters parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Defines the parameters for the action.
     * 
     * @param parameters the parameters value to set.
     * @return the DeliveryRuleCacheExpirationAction object itself.
     */
    public DeliveryRuleCacheExpirationAction withParameters(CacheExpirationActionParameters parameters) {
        this.parameters = parameters;
        return this;
    }
}