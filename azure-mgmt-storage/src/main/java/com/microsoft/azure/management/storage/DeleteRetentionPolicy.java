/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The service properties for soft delete.
 */
public class DeleteRetentionPolicy {
    /**
     * Indicates whether DeleteRetentionPolicy is enabled.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Indicates the number of days that the deleted item should be retained.
     * The minimum specified value can be 1 and the maximum value can be 365.
     */
    @JsonProperty(value = "days")
    private Integer days;

    /**
     * Get indicates whether DeleteRetentionPolicy is enabled.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set indicates whether DeleteRetentionPolicy is enabled.
     *
     * @param enabled the enabled value to set
     * @return the DeleteRetentionPolicy object itself.
     */
    public DeleteRetentionPolicy withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get indicates the number of days that the deleted item should be retained. The minimum specified value can be 1 and the maximum value can be 365.
     *
     * @return the days value
     */
    public Integer days() {
        return this.days;
    }

    /**
     * Set indicates the number of days that the deleted item should be retained. The minimum specified value can be 1 and the maximum value can be 365.
     *
     * @param days the days value to set
     * @return the DeleteRetentionPolicy object itself.
     */
    public DeleteRetentionPolicy withDays(Integer days) {
        this.days = days;
        return this;
    }

}