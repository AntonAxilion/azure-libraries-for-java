// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ElasticPoolPerDatabaseSettings model.
 */
@Fluent
public final class ElasticPoolPerDatabaseSettings {
    /*
     * The minimum capacity all databases are guaranteed.
     */
    @JsonProperty(value = "minCapacity")
    private Double minCapacity;

    /*
     * The maximum capacity any one database can consume.
     */
    @JsonProperty(value = "maxCapacity")
    private Double maxCapacity;

    /**
     * Get the minCapacity property: The minimum capacity all databases are
     * guaranteed.
     * 
     * @return the minCapacity value.
     */
    public Double minCapacity() {
        return this.minCapacity;
    }

    /**
     * Set the minCapacity property: The minimum capacity all databases are
     * guaranteed.
     * 
     * @param minCapacity the minCapacity value to set.
     * @return the ElasticPoolPerDatabaseSettings object itself.
     */
    public ElasticPoolPerDatabaseSettings withMinCapacity(Double minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }

    /**
     * Get the maxCapacity property: The maximum capacity any one database can
     * consume.
     * 
     * @return the maxCapacity value.
     */
    public Double maxCapacity() {
        return this.maxCapacity;
    }

    /**
     * Set the maxCapacity property: The maximum capacity any one database can
     * consume.
     * 
     * @param maxCapacity the maxCapacity value to set.
     * @return the ElasticPoolPerDatabaseSettings object itself.
     */
    public ElasticPoolPerDatabaseSettings withMaxCapacity(Double maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }
}
