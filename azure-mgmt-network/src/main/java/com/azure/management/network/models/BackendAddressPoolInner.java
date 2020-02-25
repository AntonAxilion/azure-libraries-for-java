// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.management.network.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The BackendAddressPool model.
 */
@JsonFlatten
@Fluent
public class BackendAddressPoolInner extends SubResource {
    /*
     * The name of the resource that is unique within the set of backend
     * address pools used by the load balancer. This name can be used to access
     * the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * An array of references to IP addresses defined in network interfaces.
     */
    @JsonProperty(value = "properties.backendIPConfigurations", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkInterfaceIPConfigurationInner> backendIPConfigurations;

    /*
     * An array of references to load balancing rules that use this backend
     * address pool.
     */
    @JsonProperty(value = "properties.loadBalancingRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> loadBalancingRules;

    /*
     * Reference to another subresource.
     */
    @JsonProperty(value = "properties.outboundRule", access = JsonProperty.Access.WRITE_ONLY)
    private SubResource outboundRule;

    /*
     * An array of references to outbound rules that use this backend address
     * pool.
     */
    @JsonProperty(value = "properties.outboundRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> outboundRules;

    /*
     * The current provisioning state.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: The name of the resource that is unique within
     * the set of backend address pools used by the load balancer. This name
     * can be used to access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within
     * the set of backend address pools used by the load balancer. This name
     * can be used to access the resource.
     * 
     * @param name the name value to set.
     * @return the BackendAddressPoolInner object itself.
     */
    public BackendAddressPoolInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever
     * the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the backendIPConfigurations property: An array of references to IP
     * addresses defined in network interfaces.
     * 
     * @return the backendIPConfigurations value.
     */
    public List<NetworkInterfaceIPConfigurationInner> backendIPConfigurations() {
        return this.backendIPConfigurations;
    }

    /**
     * Get the loadBalancingRules property: An array of references to load
     * balancing rules that use this backend address pool.
     * 
     * @return the loadBalancingRules value.
     */
    public List<SubResource> loadBalancingRules() {
        return this.loadBalancingRules;
    }

    /**
     * Get the outboundRule property: Reference to another subresource.
     * 
     * @return the outboundRule value.
     */
    public SubResource outboundRule() {
        return this.outboundRule;
    }

    /**
     * Get the outboundRules property: An array of references to outbound rules
     * that use this backend address pool.
     * 
     * @return the outboundRules value.
     */
    public List<SubResource> outboundRules() {
        return this.outboundRules;
    }

    /**
     * Get the provisioningState property: The current provisioning state.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }
}
