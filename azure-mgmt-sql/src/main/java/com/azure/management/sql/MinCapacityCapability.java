// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The MinCapacityCapability model.
 */
@Fluent
public final class MinCapacityCapability {
    /*
     * Min capacity value
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private Double value;

    /*
     * The status of the capability.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CapabilityStatus status;

    /*
     * The reason for the capability not being available.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * Get the value property: Min capacity value.
     * 
     * @return the value value.
     */
    public Double value() {
        return this.value;
    }

    /**
     * Get the status property: The status of the capability.
     * 
     * @return the status value.
     */
    public CapabilityStatus status() {
        return this.status;
    }

    /**
     * Get the reason property: The reason for the capability not being
     * available.
     * 
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: The reason for the capability not being
     * available.
     * 
     * @param reason the reason value to set.
     * @return the MinCapacityCapability object itself.
     */
    public MinCapacityCapability withReason(String reason) {
        this.reason = reason;
        return this;
    }
}
