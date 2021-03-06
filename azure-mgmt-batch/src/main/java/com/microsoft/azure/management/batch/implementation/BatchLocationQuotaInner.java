/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Quotas associated with a Batch region for a particular subscription.
 */
public class BatchLocationQuotaInner {
    /**
     * The number of Batch accounts that may be created under the subscription
     * in the specified region.
     */
    @JsonProperty(value = "accountQuota", access = JsonProperty.Access.WRITE_ONLY)
    private Integer accountQuota;

    /**
     * Get the number of Batch accounts that may be created under the subscription in the specified region.
     *
     * @return the accountQuota value
     */
    public Integer accountQuota() {
        return this.accountQuota;
    }

}
