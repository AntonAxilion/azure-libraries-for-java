/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ListTableServicesInner model.
 */
public class ListTableServicesInner {
    /**
     * List of table services returned.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<TableServicePropertiesInner> value;

    /**
     * Get list of table services returned.
     *
     * @return the value value
     */
    public List<TableServicePropertiesInner> value() {
        return this.value;
    }

}
