/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Operation status message object.
 */
public class StatusMessage {
    /**
     * Status of the deployment operation.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * The error reported by the operation.
     */
    @JsonProperty(value = "error")
    private ErrorResponse error;

    /**
     * Get status of the deployment operation.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set status of the deployment operation.
     *
     * @param status the status value to set
     * @return the StatusMessage object itself.
     */
    public StatusMessage withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the error reported by the operation.
     *
     * @return the error value
     */
    public ErrorResponse error() {
        return this.error;
    }

    /**
     * Set the error reported by the operation.
     *
     * @param error the error value to set
     * @return the StatusMessage object itself.
     */
    public StatusMessage withError(ErrorResponse error) {
        this.error = error;
        return this;
    }

}
