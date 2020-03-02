// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DetectorInfo model.
 */
@Immutable
public final class DetectorInfo {
    /*
     * Short description of the detector and its purpose
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * Support Category
     */
    @JsonProperty(value = "category", access = JsonProperty.Access.WRITE_ONLY)
    private String category;

    /*
     * Support Sub Category
     */
    @JsonProperty(value = "subCategory", access = JsonProperty.Access.WRITE_ONLY)
    private String subCategory;

    /*
     * Support Topic Id
     */
    @JsonProperty(value = "supportTopicId", access = JsonProperty.Access.WRITE_ONLY)
    private String supportTopicId;

    /**
     * Get the description property: Short description of the detector and its
     * purpose.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the category property: Support Category.
     * 
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Get the subCategory property: Support Sub Category.
     * 
     * @return the subCategory value.
     */
    public String subCategory() {
        return this.subCategory;
    }

    /**
     * Get the supportTopicId property: Support Topic Id.
     * 
     * @return the supportTopicId value.
     */
    public String supportTopicId() {
        return this.supportTopicId;
    }
}