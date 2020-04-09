// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cdn;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CacheExpirationActionParameters model.
 */
@Fluent
public final class CacheExpirationActionParameters {
    /*
     * The @odata.type property.
     */
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType;

    /*
     * Caching behavior for the requests that include query strings.
     */
    @JsonProperty(value = "cacheBehavior", required = true)
    private CacheExpirationActionParametersCacheBehavior cacheBehavior;

    /*
     * The level at which the content needs to be cached.
     */
    @JsonProperty(value = "cacheType", required = true)
    private String cacheType;

    /*
     * The duration for which the content needs to be cached. Allowed format is
     * [d.]hh:mm:ss
     */
    @JsonProperty(value = "cacheDuration")
    private String cacheDuration;

    /**
     * Creates an instance of CacheExpirationActionParameters class.
     */
    public CacheExpirationActionParameters() {
        odataType = "Microsoft.Azure.Cdn.Models.DeliveryRuleCacheExpirationActionParameters";
        cacheType = "All";
    }

    /**
     * Get the odataType property: The @odata.type property.
     * 
     * @return the odataType value.
     */
    public String odataType() {
        return this.odataType;
    }

    /**
     * Set the odataType property: The @odata.type property.
     * 
     * @param odataType the odataType value to set.
     * @return the CacheExpirationActionParameters object itself.
     */
    public CacheExpirationActionParameters withOdataType(String odataType) {
        this.odataType = odataType;
        return this;
    }

    /**
     * Get the cacheBehavior property: Caching behavior for the requests that
     * include query strings.
     * 
     * @return the cacheBehavior value.
     */
    public CacheExpirationActionParametersCacheBehavior cacheBehavior() {
        return this.cacheBehavior;
    }

    /**
     * Set the cacheBehavior property: Caching behavior for the requests that
     * include query strings.
     * 
     * @param cacheBehavior the cacheBehavior value to set.
     * @return the CacheExpirationActionParameters object itself.
     */
    public CacheExpirationActionParameters withCacheBehavior(CacheExpirationActionParametersCacheBehavior cacheBehavior) {
        this.cacheBehavior = cacheBehavior;
        return this;
    }

    /**
     * Get the cacheType property: The level at which the content needs to be
     * cached.
     * 
     * @return the cacheType value.
     */
    public String cacheType() {
        return this.cacheType;
    }

    /**
     * Set the cacheType property: The level at which the content needs to be
     * cached.
     * 
     * @param cacheType the cacheType value to set.
     * @return the CacheExpirationActionParameters object itself.
     */
    public CacheExpirationActionParameters withCacheType(String cacheType) {
        this.cacheType = cacheType;
        return this;
    }

    /**
     * Get the cacheDuration property: The duration for which the content needs
     * to be cached. Allowed format is [d.]hh:mm:ss.
     * 
     * @return the cacheDuration value.
     */
    public String cacheDuration() {
        return this.cacheDuration;
    }

    /**
     * Set the cacheDuration property: The duration for which the content needs
     * to be cached. Allowed format is [d.]hh:mm:ss.
     * 
     * @param cacheDuration the cacheDuration value to set.
     * @return the CacheExpirationActionParameters object itself.
     */
    public CacheExpirationActionParameters withCacheDuration(String cacheDuration) {
        this.cacheDuration = cacheDuration;
        return this;
    }
}