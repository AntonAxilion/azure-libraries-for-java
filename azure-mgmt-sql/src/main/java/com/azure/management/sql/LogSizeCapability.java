// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LogSizeCapability model.
 */
@Immutable
public final class LogSizeCapability {
    /*
     * The log size limit (see 'unit' for the units).
     */
    @JsonProperty(value = "limit", access = JsonProperty.Access.WRITE_ONLY)
    private Integer limit;

    /*
     * The units that the limit is expressed in.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private LogSizeUnit unit;

    /**
     * Get the limit property: The log size limit (see 'unit' for the units).
     * 
     * @return the limit value.
     */
    public Integer limit() {
        return this.limit;
    }

    /**
     * Get the unit property: The units that the limit is expressed in.
     * 
     * @return the unit value.
     */
    public LogSizeUnit unit() {
        return this.unit;
    }
}
