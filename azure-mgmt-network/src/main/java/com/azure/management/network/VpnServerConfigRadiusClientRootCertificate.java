// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The VpnServerConfigRadiusClientRootCertificate model.
 */
@Fluent
public final class VpnServerConfigRadiusClientRootCertificate {
    /*
     * The certificate name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The Radius client root certificate thumbprint.
     */
    @JsonProperty(value = "thumbprint")
    private String thumbprint;

    /**
     * Get the name property: The certificate name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The certificate name.
     * 
     * @param name the name value to set.
     * @return the VpnServerConfigRadiusClientRootCertificate object itself.
     */
    public VpnServerConfigRadiusClientRootCertificate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the thumbprint property: The Radius client root certificate
     * thumbprint.
     * 
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: The Radius client root certificate
     * thumbprint.
     * 
     * @param thumbprint the thumbprint value to set.
     * @return the VpnServerConfigRadiusClientRootCertificate object itself.
     */
    public VpnServerConfigRadiusClientRootCertificate withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }
}
