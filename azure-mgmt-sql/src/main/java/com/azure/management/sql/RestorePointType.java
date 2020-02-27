// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for RestorePointType.
 */
public enum RestorePointType {
    /**
     * Enum value CONTINUOUS.
     */
    CONTINUOUS("CONTINUOUS"),

    /**
     * Enum value DISCRETE.
     */
    DISCRETE("DISCRETE");

    /**
     * The actual serialized value for a RestorePointType instance.
     */
    private final String value;

    RestorePointType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RestorePointType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed RestorePointType object, or null if unable to parse.
     */
    @JsonCreator
    public static RestorePointType fromString(String value) {
        RestorePointType[] items = RestorePointType.values();
        for (RestorePointType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
