// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ConnectionMonitorOutput model.
 */
@Fluent
public final class ConnectionMonitorOutput {
    /*
     * Connection monitor output destination type. Currently, only "Workspace"
     * is supported.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Describes the settings for producing output into a log analytics
     * workspace.
     */
    @JsonProperty(value = "workspaceSettings")
    private ConnectionMonitorWorkspaceSettings workspaceSettings;

    /**
     * Creates an instance of ConnectionMonitorOutput class.
     */
    public ConnectionMonitorOutput() {
        type = "Workspace";
    }

    /**
     * Get the type property: Connection monitor output destination type.
     * Currently, only "Workspace" is supported.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Connection monitor output destination type.
     * Currently, only "Workspace" is supported.
     * 
     * @param type the type value to set.
     * @return the ConnectionMonitorOutput object itself.
     */
    public ConnectionMonitorOutput withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the workspaceSettings property: Describes the settings for producing
     * output into a log analytics workspace.
     * 
     * @return the workspaceSettings value.
     */
    public ConnectionMonitorWorkspaceSettings workspaceSettings() {
        return this.workspaceSettings;
    }

    /**
     * Set the workspaceSettings property: Describes the settings for producing
     * output into a log analytics workspace.
     * 
     * @param workspaceSettings the workspaceSettings value to set.
     * @return the ConnectionMonitorOutput object itself.
     */
    public ConnectionMonitorOutput withWorkspaceSettings(ConnectionMonitorWorkspaceSettings workspaceSettings) {
        this.workspaceSettings = workspaceSettings;
        return this;
    }
}
