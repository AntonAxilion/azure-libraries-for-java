// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.management.sql.SecurityAlertPolicyEmailAccountAdmins;
import com.azure.management.sql.SecurityAlertPolicyState;
import com.azure.management.sql.SecurityAlertPolicyUseServerDefault;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DatabaseSecurityAlertPolicy model.
 */
@JsonFlatten
@Fluent
public class DatabaseSecurityAlertPolicyInner extends ProxyResource {
    /*
     * The geo-location where the resource lives
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Resource kind.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * Specifies the state of the policy. If state is Enabled, storageEndpoint
     * and storageAccountAccessKey are required.
     */
    @JsonProperty(value = "properties.state")
    private SecurityAlertPolicyState state;

    /*
     * Specifies the semicolon-separated list of alerts that are disabled, or
     * empty string to disable no alerts. Possible values: Sql_Injection;
     * Sql_Injection_Vulnerability; Access_Anomaly; Data_Exfiltration;
     * Unsafe_Action.
     */
    @JsonProperty(value = "properties.disabledAlerts")
    private String disabledAlerts;

    /*
     * Specifies the semicolon-separated list of e-mail addresses to which the
     * alert is sent.
     */
    @JsonProperty(value = "properties.emailAddresses")
    private String emailAddresses;

    /*
     * Specifies that the alert is sent to the account administrators.
     */
    @JsonProperty(value = "properties.emailAccountAdmins")
    private SecurityAlertPolicyEmailAccountAdmins emailAccountAdmins;

    /*
     * Specifies the blob storage endpoint (e.g.
     * https://MyAccount.blob.core.windows.net). This blob storage will hold
     * all Threat Detection audit logs. If state is Enabled, storageEndpoint is
     * required.
     */
    @JsonProperty(value = "properties.storageEndpoint")
    private String storageEndpoint;

    /*
     * Specifies the identifier key of the Threat Detection audit storage
     * account. If state is Enabled, storageAccountAccessKey is required.
     */
    @JsonProperty(value = "properties.storageAccountAccessKey")
    private String storageAccountAccessKey;

    /*
     * Specifies the number of days to keep in the Threat Detection audit logs.
     */
    @JsonProperty(value = "properties.retentionDays")
    private Integer retentionDays;

    /*
     * Specifies whether to use the default server policy.
     */
    @JsonProperty(value = "properties.useServerDefault")
    private SecurityAlertPolicyUseServerDefault useServerDefault;

    /**
     * Get the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The geo-location where the resource lives.
     * 
     * @param location the location value to set.
     * @return the DatabaseSecurityAlertPolicyInner object itself.
     */
    public DatabaseSecurityAlertPolicyInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the kind property: Resource kind.
     * 
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the state property: Specifies the state of the policy. If state is
     * Enabled, storageEndpoint and storageAccountAccessKey are required.
     * 
     * @return the state value.
     */
    public SecurityAlertPolicyState state() {
        return this.state;
    }

    /**
     * Set the state property: Specifies the state of the policy. If state is
     * Enabled, storageEndpoint and storageAccountAccessKey are required.
     * 
     * @param state the state value to set.
     * @return the DatabaseSecurityAlertPolicyInner object itself.
     */
    public DatabaseSecurityAlertPolicyInner withState(SecurityAlertPolicyState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the disabledAlerts property: Specifies the semicolon-separated list
     * of alerts that are disabled, or empty string to disable no alerts.
     * Possible values: Sql_Injection; Sql_Injection_Vulnerability;
     * Access_Anomaly; Data_Exfiltration; Unsafe_Action.
     * 
     * @return the disabledAlerts value.
     */
    public String disabledAlerts() {
        return this.disabledAlerts;
    }

    /**
     * Set the disabledAlerts property: Specifies the semicolon-separated list
     * of alerts that are disabled, or empty string to disable no alerts.
     * Possible values: Sql_Injection; Sql_Injection_Vulnerability;
     * Access_Anomaly; Data_Exfiltration; Unsafe_Action.
     * 
     * @param disabledAlerts the disabledAlerts value to set.
     * @return the DatabaseSecurityAlertPolicyInner object itself.
     */
    public DatabaseSecurityAlertPolicyInner withDisabledAlerts(String disabledAlerts) {
        this.disabledAlerts = disabledAlerts;
        return this;
    }

    /**
     * Get the emailAddresses property: Specifies the semicolon-separated list
     * of e-mail addresses to which the alert is sent.
     * 
     * @return the emailAddresses value.
     */
    public String emailAddresses() {
        return this.emailAddresses;
    }

    /**
     * Set the emailAddresses property: Specifies the semicolon-separated list
     * of e-mail addresses to which the alert is sent.
     * 
     * @param emailAddresses the emailAddresses value to set.
     * @return the DatabaseSecurityAlertPolicyInner object itself.
     */
    public DatabaseSecurityAlertPolicyInner withEmailAddresses(String emailAddresses) {
        this.emailAddresses = emailAddresses;
        return this;
    }

    /**
     * Get the emailAccountAdmins property: Specifies that the alert is sent to
     * the account administrators.
     * 
     * @return the emailAccountAdmins value.
     */
    public SecurityAlertPolicyEmailAccountAdmins emailAccountAdmins() {
        return this.emailAccountAdmins;
    }

    /**
     * Set the emailAccountAdmins property: Specifies that the alert is sent to
     * the account administrators.
     * 
     * @param emailAccountAdmins the emailAccountAdmins value to set.
     * @return the DatabaseSecurityAlertPolicyInner object itself.
     */
    public DatabaseSecurityAlertPolicyInner withEmailAccountAdmins(SecurityAlertPolicyEmailAccountAdmins emailAccountAdmins) {
        this.emailAccountAdmins = emailAccountAdmins;
        return this;
    }

    /**
     * Get the storageEndpoint property: Specifies the blob storage endpoint
     * (e.g. https://MyAccount.blob.core.windows.net). This blob storage will
     * hold all Threat Detection audit logs. If state is Enabled,
     * storageEndpoint is required.
     * 
     * @return the storageEndpoint value.
     */
    public String storageEndpoint() {
        return this.storageEndpoint;
    }

    /**
     * Set the storageEndpoint property: Specifies the blob storage endpoint
     * (e.g. https://MyAccount.blob.core.windows.net). This blob storage will
     * hold all Threat Detection audit logs. If state is Enabled,
     * storageEndpoint is required.
     * 
     * @param storageEndpoint the storageEndpoint value to set.
     * @return the DatabaseSecurityAlertPolicyInner object itself.
     */
    public DatabaseSecurityAlertPolicyInner withStorageEndpoint(String storageEndpoint) {
        this.storageEndpoint = storageEndpoint;
        return this;
    }

    /**
     * Get the storageAccountAccessKey property: Specifies the identifier key
     * of the Threat Detection audit storage account. If state is Enabled,
     * storageAccountAccessKey is required.
     * 
     * @return the storageAccountAccessKey value.
     */
    public String storageAccountAccessKey() {
        return this.storageAccountAccessKey;
    }

    /**
     * Set the storageAccountAccessKey property: Specifies the identifier key
     * of the Threat Detection audit storage account. If state is Enabled,
     * storageAccountAccessKey is required.
     * 
     * @param storageAccountAccessKey the storageAccountAccessKey value to set.
     * @return the DatabaseSecurityAlertPolicyInner object itself.
     */
    public DatabaseSecurityAlertPolicyInner withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.storageAccountAccessKey = storageAccountAccessKey;
        return this;
    }

    /**
     * Get the retentionDays property: Specifies the number of days to keep in
     * the Threat Detection audit logs.
     * 
     * @return the retentionDays value.
     */
    public Integer retentionDays() {
        return this.retentionDays;
    }

    /**
     * Set the retentionDays property: Specifies the number of days to keep in
     * the Threat Detection audit logs.
     * 
     * @param retentionDays the retentionDays value to set.
     * @return the DatabaseSecurityAlertPolicyInner object itself.
     */
    public DatabaseSecurityAlertPolicyInner withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /**
     * Get the useServerDefault property: Specifies whether to use the default
     * server policy.
     * 
     * @return the useServerDefault value.
     */
    public SecurityAlertPolicyUseServerDefault useServerDefault() {
        return this.useServerDefault;
    }

    /**
     * Set the useServerDefault property: Specifies whether to use the default
     * server policy.
     * 
     * @param useServerDefault the useServerDefault value to set.
     * @return the DatabaseSecurityAlertPolicyInner object itself.
     */
    public DatabaseSecurityAlertPolicyInner withUseServerDefault(SecurityAlertPolicyUseServerDefault useServerDefault) {
        this.useServerDefault = useServerDefault;
        return this;
    }
}
