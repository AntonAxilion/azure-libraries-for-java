// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.management.network.ExpressRouteCircuitReference;
import com.azure.management.network.ProvisioningState;
import com.azure.management.network.ServiceProviderProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ExpressRouteCrossConnection model.
 */
@JsonFlatten
@Fluent
public class ExpressRouteCrossConnectionInner extends Resource {
    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The name of the primary port.
     */
    @JsonProperty(value = "properties.primaryAzurePort", access = JsonProperty.Access.WRITE_ONLY)
    private String primaryAzurePort;

    /*
     * The name of the secondary port.
     */
    @JsonProperty(value = "properties.secondaryAzurePort", access = JsonProperty.Access.WRITE_ONLY)
    private String secondaryAzurePort;

    /*
     * The identifier of the circuit traffic.
     */
    @JsonProperty(value = "properties.sTag", access = JsonProperty.Access.WRITE_ONLY)
    private Integer sTag;

    /*
     * The peering location of the ExpressRoute circuit.
     */
    @JsonProperty(value = "properties.peeringLocation")
    private String peeringLocation;

    /*
     * The circuit bandwidth In Mbps.
     */
    @JsonProperty(value = "properties.bandwidthInMbps")
    private Integer bandwidthInMbps;

    /*
     * Reference to an express route circuit.
     */
    @JsonProperty(value = "properties.expressRouteCircuit")
    private ExpressRouteCircuitReference expressRouteCircuit;

    /*
     * The ServiceProviderProvisioningState state of the resource.
     */
    @JsonProperty(value = "properties.serviceProviderProvisioningState")
    private ServiceProviderProvisioningState serviceProviderProvisioningState;

    /*
     * Additional read only notes set by the connectivity provider.
     */
    @JsonProperty(value = "properties.serviceProviderNotes")
    private String serviceProviderNotes;

    /*
     * The current provisioning state.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The list of peerings.
     */
    @JsonProperty(value = "properties.peerings")
    private List<ExpressRouteCrossConnectionPeeringInner> peerings;

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
     * Get the primaryAzurePort property: The name of the primary port.
     * 
     * @return the primaryAzurePort value.
     */
    public String primaryAzurePort() {
        return this.primaryAzurePort;
    }

    /**
     * Get the secondaryAzurePort property: The name of the secondary port.
     * 
     * @return the secondaryAzurePort value.
     */
    public String secondaryAzurePort() {
        return this.secondaryAzurePort;
    }

    /**
     * Get the sTag property: The identifier of the circuit traffic.
     * 
     * @return the sTag value.
     */
    public Integer sTag() {
        return this.sTag;
    }

    /**
     * Get the peeringLocation property: The peering location of the
     * ExpressRoute circuit.
     * 
     * @return the peeringLocation value.
     */
    public String peeringLocation() {
        return this.peeringLocation;
    }

    /**
     * Set the peeringLocation property: The peering location of the
     * ExpressRoute circuit.
     * 
     * @param peeringLocation the peeringLocation value to set.
     * @return the ExpressRouteCrossConnectionInner object itself.
     */
    public ExpressRouteCrossConnectionInner withPeeringLocation(String peeringLocation) {
        this.peeringLocation = peeringLocation;
        return this;
    }

    /**
     * Get the bandwidthInMbps property: The circuit bandwidth In Mbps.
     * 
     * @return the bandwidthInMbps value.
     */
    public Integer bandwidthInMbps() {
        return this.bandwidthInMbps;
    }

    /**
     * Set the bandwidthInMbps property: The circuit bandwidth In Mbps.
     * 
     * @param bandwidthInMbps the bandwidthInMbps value to set.
     * @return the ExpressRouteCrossConnectionInner object itself.
     */
    public ExpressRouteCrossConnectionInner withBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    /**
     * Get the expressRouteCircuit property: Reference to an express route
     * circuit.
     * 
     * @return the expressRouteCircuit value.
     */
    public ExpressRouteCircuitReference expressRouteCircuit() {
        return this.expressRouteCircuit;
    }

    /**
     * Set the expressRouteCircuit property: Reference to an express route
     * circuit.
     * 
     * @param expressRouteCircuit the expressRouteCircuit value to set.
     * @return the ExpressRouteCrossConnectionInner object itself.
     */
    public ExpressRouteCrossConnectionInner withExpressRouteCircuit(ExpressRouteCircuitReference expressRouteCircuit) {
        this.expressRouteCircuit = expressRouteCircuit;
        return this;
    }

    /**
     * Get the serviceProviderProvisioningState property: The
     * ServiceProviderProvisioningState state of the resource.
     * 
     * @return the serviceProviderProvisioningState value.
     */
    public ServiceProviderProvisioningState serviceProviderProvisioningState() {
        return this.serviceProviderProvisioningState;
    }

    /**
     * Set the serviceProviderProvisioningState property: The
     * ServiceProviderProvisioningState state of the resource.
     * 
     * @param serviceProviderProvisioningState the
     * serviceProviderProvisioningState value to set.
     * @return the ExpressRouteCrossConnectionInner object itself.
     */
    public ExpressRouteCrossConnectionInner withServiceProviderProvisioningState(ServiceProviderProvisioningState serviceProviderProvisioningState) {
        this.serviceProviderProvisioningState = serviceProviderProvisioningState;
        return this;
    }

    /**
     * Get the serviceProviderNotes property: Additional read only notes set by
     * the connectivity provider.
     * 
     * @return the serviceProviderNotes value.
     */
    public String serviceProviderNotes() {
        return this.serviceProviderNotes;
    }

    /**
     * Set the serviceProviderNotes property: Additional read only notes set by
     * the connectivity provider.
     * 
     * @param serviceProviderNotes the serviceProviderNotes value to set.
     * @return the ExpressRouteCrossConnectionInner object itself.
     */
    public ExpressRouteCrossConnectionInner withServiceProviderNotes(String serviceProviderNotes) {
        this.serviceProviderNotes = serviceProviderNotes;
        return this;
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
     * Get the peerings property: The list of peerings.
     * 
     * @return the peerings value.
     */
    public List<ExpressRouteCrossConnectionPeeringInner> peerings() {
        return this.peerings;
    }

    /**
     * Set the peerings property: The list of peerings.
     * 
     * @param peerings the peerings value to set.
     * @return the ExpressRouteCrossConnectionInner object itself.
     */
    public ExpressRouteCrossConnectionInner withPeerings(List<ExpressRouteCrossConnectionPeeringInner> peerings) {
        this.peerings = peerings;
        return this;
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
     * @return the ExpressRouteCrossConnectionInner object itself.
     */
    public ExpressRouteCrossConnectionInner withId(String id) {
        this.id = id;
        return this;
    }
}
