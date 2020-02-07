/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Data Lake Analytics catalog U-SQL credential item.
 */
public class USqlCredential extends CatalogItem {
    /**
     * the name of the credential.
     */
    @JsonProperty(value = "credentialName")
    private String name;

    /**
     * Get the name of the credential.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the credential.
     *
     * @param name the name value to set
     * @return the USqlCredential object itself.
     */
    public USqlCredential withName(String name) {
        this.name = name;
        return this;
    }

}