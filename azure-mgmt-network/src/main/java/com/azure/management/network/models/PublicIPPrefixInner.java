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
import com.azure.management.network.IpTag;
import com.azure.management.network.IPVersion;
import com.azure.management.network.ProvisioningState;
import com.azure.management.network.PublicIPPrefixSku;
import com.azure.management.network.ReferencedPublicIpAddress;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The PublicIPPrefix model.
 */
@JsonFlatten
@Fluent
public class PublicIPPrefixInner extends Resource {
    /*
     * SKU of a public IP prefix.
     */
    @JsonProperty(value = "sku")
    private PublicIPPrefixSku sku;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * A list of availability zones denoting the IP allocated for the resource
     * needs to come from.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * IP address version.
     */
    @JsonProperty(value = "properties.publicIPAddressVersion")
    private IPVersion publicIPAddressVersion;

    /*
     * The list of tags associated with the public IP prefix.
     */
    @JsonProperty(value = "properties.ipTags")
    private List<IpTag> ipTags;

    /*
     * The Length of the Public IP Prefix.
     */
    @JsonProperty(value = "properties.prefixLength")
    private Integer prefixLength;

    /*
     * The allocated Prefix.
     */
    @JsonProperty(value = "properties.ipPrefix", access = JsonProperty.Access.WRITE_ONLY)
    private String ipPrefix;

    /*
     * The list of all referenced PublicIPAddresses.
     */
    @JsonProperty(value = "properties.publicIPAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReferencedPublicIpAddress> publicIPAddresses;

    /*
     * Reference to another subresource.
     */
    @JsonProperty(value = "properties.loadBalancerFrontendIpConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private SubResource loadBalancerFrontendIpConfiguration;

    /*
     * The resource GUID property of the public IP prefix resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

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
     * Get the sku property: SKU of a public IP prefix.
     * 
     * @return the sku value.
     */
    public PublicIPPrefixSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: SKU of a public IP prefix.
     * 
     * @param sku the sku value to set.
     * @return the PublicIPPrefixInner object itself.
     */
    public PublicIPPrefixInner withSku(PublicIPPrefixSku sku) {
        this.sku = sku;
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
     * Get the zones property: A list of availability zones denoting the IP
     * allocated for the resource needs to come from.
     * 
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: A list of availability zones denoting the IP
     * allocated for the resource needs to come from.
     * 
     * @param zones the zones value to set.
     * @return the PublicIPPrefixInner object itself.
     */
    public PublicIPPrefixInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the publicIPAddressVersion property: IP address version.
     * 
     * @return the publicIPAddressVersion value.
     */
    public IPVersion publicIPAddressVersion() {
        return this.publicIPAddressVersion;
    }

    /**
     * Set the publicIPAddressVersion property: IP address version.
     * 
     * @param publicIPAddressVersion the publicIPAddressVersion value to set.
     * @return the PublicIPPrefixInner object itself.
     */
    public PublicIPPrefixInner withPublicIPAddressVersion(IPVersion publicIPAddressVersion) {
        this.publicIPAddressVersion = publicIPAddressVersion;
        return this;
    }

    /**
     * Get the ipTags property: The list of tags associated with the public IP
     * prefix.
     * 
     * @return the ipTags value.
     */
    public List<IpTag> ipTags() {
        return this.ipTags;
    }

    /**
     * Set the ipTags property: The list of tags associated with the public IP
     * prefix.
     * 
     * @param ipTags the ipTags value to set.
     * @return the PublicIPPrefixInner object itself.
     */
    public PublicIPPrefixInner withIpTags(List<IpTag> ipTags) {
        this.ipTags = ipTags;
        return this;
    }

    /**
     * Get the prefixLength property: The Length of the Public IP Prefix.
     * 
     * @return the prefixLength value.
     */
    public Integer prefixLength() {
        return this.prefixLength;
    }

    /**
     * Set the prefixLength property: The Length of the Public IP Prefix.
     * 
     * @param prefixLength the prefixLength value to set.
     * @return the PublicIPPrefixInner object itself.
     */
    public PublicIPPrefixInner withPrefixLength(Integer prefixLength) {
        this.prefixLength = prefixLength;
        return this;
    }

    /**
     * Get the ipPrefix property: The allocated Prefix.
     * 
     * @return the ipPrefix value.
     */
    public String ipPrefix() {
        return this.ipPrefix;
    }

    /**
     * Get the publicIPAddresses property: The list of all referenced
     * PublicIPAddresses.
     * 
     * @return the publicIPAddresses value.
     */
    public List<ReferencedPublicIpAddress> publicIPAddresses() {
        return this.publicIPAddresses;
    }

    /**
     * Get the loadBalancerFrontendIpConfiguration property: Reference to
     * another subresource.
     * 
     * @return the loadBalancerFrontendIpConfiguration value.
     */
    public SubResource loadBalancerFrontendIpConfiguration() {
        return this.loadBalancerFrontendIpConfiguration;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the public
     * IP prefix resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
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
     * @return the PublicIPPrefixInner object itself.
     */
    public PublicIPPrefixInner withId(String id) {
        this.id = id;
        return this;
    }
}
