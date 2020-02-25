// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Definition of ExpressRouteLink Mac Security configuration.null.
 */
@Fluent
public final class ExpressRouteLinkMacSecConfig {
    /*
     * Keyvault Secret Identifier URL containing Mac security CKN key.
     */
    @JsonProperty(value = "cknSecretIdentifier")
    private String cknSecretIdentifier;

    /*
     * Keyvault Secret Identifier URL containing Mac security CAK key.
     */
    @JsonProperty(value = "cakSecretIdentifier")
    private String cakSecretIdentifier;

    /*
     * Mac security cipher.
     */
    @JsonProperty(value = "cipher")
    private ExpressRouteLinkMacSecCipher cipher;

    /**
     * Get the cknSecretIdentifier property: Keyvault Secret Identifier URL
     * containing Mac security CKN key.
     * 
     * @return the cknSecretIdentifier value.
     */
    public String cknSecretIdentifier() {
        return this.cknSecretIdentifier;
    }

    /**
     * Set the cknSecretIdentifier property: Keyvault Secret Identifier URL
     * containing Mac security CKN key.
     * 
     * @param cknSecretIdentifier the cknSecretIdentifier value to set.
     * @return the ExpressRouteLinkMacSecConfig object itself.
     */
    public ExpressRouteLinkMacSecConfig withCknSecretIdentifier(String cknSecretIdentifier) {
        this.cknSecretIdentifier = cknSecretIdentifier;
        return this;
    }

    /**
     * Get the cakSecretIdentifier property: Keyvault Secret Identifier URL
     * containing Mac security CAK key.
     * 
     * @return the cakSecretIdentifier value.
     */
    public String cakSecretIdentifier() {
        return this.cakSecretIdentifier;
    }

    /**
     * Set the cakSecretIdentifier property: Keyvault Secret Identifier URL
     * containing Mac security CAK key.
     * 
     * @param cakSecretIdentifier the cakSecretIdentifier value to set.
     * @return the ExpressRouteLinkMacSecConfig object itself.
     */
    public ExpressRouteLinkMacSecConfig withCakSecretIdentifier(String cakSecretIdentifier) {
        this.cakSecretIdentifier = cakSecretIdentifier;
        return this;
    }

    /**
     * Get the cipher property: Mac security cipher.
     * 
     * @return the cipher value.
     */
    public ExpressRouteLinkMacSecCipher cipher() {
        return this.cipher;
    }

    /**
     * Set the cipher property: Mac security cipher.
     * 
     * @param cipher the cipher value to set.
     * @return the ExpressRouteLinkMacSecConfig object itself.
     */
    public ExpressRouteLinkMacSecConfig withCipher(ExpressRouteLinkMacSecCipher cipher) {
        this.cipher = cipher;
        return this;
    }
}
