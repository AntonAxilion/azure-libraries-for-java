// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The ResourceGroupPatchable model.
 */
@Fluent
public final class ResourceGroupPatchable {
    /*
     * The name of the resource group.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The resource group properties.
     */
    @JsonProperty(value = "properties")
    private ResourceGroupProperties properties;

    /*
     * The ID of the resource that manages this resource group.
     */
    @JsonProperty(value = "managedBy")
    private String managedBy;

    /*
     * The tags attached to the resource group.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the name property: The name of the resource group.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource group.
     * 
     * @param name the name value to set.
     * @return the ResourceGroupPatchable object itself.
     */
    public ResourceGroupPatchable setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties property: The resource group properties.
     * 
     * @return the properties value.
     */
    public ResourceGroupProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: The resource group properties.
     * 
     * @param properties the properties value to set.
     * @return the ResourceGroupPatchable object itself.
     */
    public ResourceGroupPatchable setProperties(ResourceGroupProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the managedBy property: The ID of the resource that manages this
     * resource group.
     * 
     * @return the managedBy value.
     */
    public String getManagedBy() {
        return this.managedBy;
    }

    /**
     * Set the managedBy property: The ID of the resource that manages this
     * resource group.
     * 
     * @param managedBy the managedBy value to set.
     * @return the ResourceGroupPatchable object itself.
     */
    public ResourceGroupPatchable setManagedBy(String managedBy) {
        this.managedBy = managedBy;
        return this;
    }

    /**
     * Get the tags property: The tags attached to the resource group.
     * 
     * @return the tags value.
     */
    public Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags attached to the resource group.
     * 
     * @param tags the tags value to set.
     * @return the ResourceGroupPatchable object itself.
     */
    public ResourceGroupPatchable setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
}