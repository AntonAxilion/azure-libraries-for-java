// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.management.network.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The VirtualRouter model.
 */
@JsonFlatten
@Fluent
public class VirtualRouterInner extends Resource {
    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * VirtualRouter ASN.
     */
    @JsonProperty(value = "properties.virtualRouterAsn")
    private Long virtualRouterAsn;

    /*
     * VirtualRouter IPs.
     */
    @JsonProperty(value = "properties.virtualRouterIps")
    private List<String> virtualRouterIps;

    /*
     * Reference to another subresource.
     */
    @JsonProperty(value = "properties.hostedSubnet")
    private SubResource hostedSubnet;

    /*
     * Reference to another subresource.
     */
    @JsonProperty(value = "properties.hostedGateway")
    private SubResource hostedGateway;

    /*
     * List of references to VirtualRouterPeerings.
     */
    @JsonProperty(value = "properties.peerings", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> peerings;

    /*
     * The current provisioning state.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

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
     * Get the virtualRouterAsn property: VirtualRouter ASN.
     * 
     * @return the virtualRouterAsn value.
     */
    public Long virtualRouterAsn() {
        return this.virtualRouterAsn;
    }

    /**
     * Set the virtualRouterAsn property: VirtualRouter ASN.
     * 
     * @param virtualRouterAsn the virtualRouterAsn value to set.
     * @return the VirtualRouterInner object itself.
     */
    public VirtualRouterInner withVirtualRouterAsn(Long virtualRouterAsn) {
        this.virtualRouterAsn = virtualRouterAsn;
        return this;
    }

    /**
     * Get the virtualRouterIps property: VirtualRouter IPs.
     * 
     * @return the virtualRouterIps value.
     */
    public List<String> virtualRouterIps() {
        return this.virtualRouterIps;
    }

    /**
     * Set the virtualRouterIps property: VirtualRouter IPs.
     * 
     * @param virtualRouterIps the virtualRouterIps value to set.
     * @return the VirtualRouterInner object itself.
     */
    public VirtualRouterInner withVirtualRouterIps(List<String> virtualRouterIps) {
        this.virtualRouterIps = virtualRouterIps;
        return this;
    }

    /**
     * Get the hostedSubnet property: Reference to another subresource.
     * 
     * @return the hostedSubnet value.
     */
    public SubResource hostedSubnet() {
        return this.hostedSubnet;
    }

    /**
     * Set the hostedSubnet property: Reference to another subresource.
     * 
     * @param hostedSubnet the hostedSubnet value to set.
     * @return the VirtualRouterInner object itself.
     */
    public VirtualRouterInner withHostedSubnet(SubResource hostedSubnet) {
        this.hostedSubnet = hostedSubnet;
        return this;
    }

    /**
     * Get the hostedGateway property: Reference to another subresource.
     * 
     * @return the hostedGateway value.
     */
    public SubResource hostedGateway() {
        return this.hostedGateway;
    }

    /**
     * Set the hostedGateway property: Reference to another subresource.
     * 
     * @param hostedGateway the hostedGateway value to set.
     * @return the VirtualRouterInner object itself.
     */
    public VirtualRouterInner withHostedGateway(SubResource hostedGateway) {
        this.hostedGateway = hostedGateway;
        return this;
    }

    /**
     * Get the peerings property: List of references to VirtualRouterPeerings.
     * 
     * @return the peerings value.
     */
    public List<SubResource> peerings() {
        return this.peerings;
    }

    /**
     * Get the provisioningState property: The current provisioning state.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the VirtualRouterInner object itself.
     */
    public VirtualRouterInner withId(String id) {
        this.id = id;
        return this;
    }
}
