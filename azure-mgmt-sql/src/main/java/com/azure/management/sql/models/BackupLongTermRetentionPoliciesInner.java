// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.polling.AsyncPollResponse;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * BackupLongTermRetentionPolicies.
 */
public final class BackupLongTermRetentionPoliciesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private BackupLongTermRetentionPoliciesService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of BackupLongTermRetentionPoliciesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public BackupLongTermRetentionPoliciesInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(BackupLongTermRetentionPoliciesService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientBackupLongTermRetentionPolicies to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientBackupLongTermRetentionPolicies")
    private interface BackupLongTermRetentionPoliciesService {
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/backupLongTermRetentionPolicies/{policyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<BackupLongTermRetentionPolicyInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @PathParam("policyName") String policyName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/backupLongTermRetentionPolicies/{policyName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @PathParam("policyName") String policyName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") BackupLongTermRetentionPolicyInner parameters, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/backupLongTermRetentionPolicies")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<BackupLongTermRetentionPolicyInner>> listByDatabase(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/backupLongTermRetentionPolicies/{policyName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<BackupLongTermRetentionPolicyInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @PathParam("policyName") String policyName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") BackupLongTermRetentionPolicyInner parameters, @QueryParam("api-version") String apiVersion);
    }

    /**
     * Gets a database's long term retention policy.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<BackupLongTermRetentionPolicyInner>> getWithResponseAsync(String resourceGroupName, String serverName, String databaseName) {
        final String policyName = "default";
        final String apiVersion = "2017-03-01-preview";
        return service.get(this.client.getHost(), resourceGroupName, serverName, databaseName, policyName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets a database's long term retention policy.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BackupLongTermRetentionPolicyInner> getAsync(String resourceGroupName, String serverName, String databaseName) {
        return getWithResponseAsync(resourceGroupName, serverName, databaseName)
            .flatMap((SimpleResponse<BackupLongTermRetentionPolicyInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a database's long term retention policy.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BackupLongTermRetentionPolicyInner get(String resourceGroupName, String serverName, String databaseName) {
        return getAsync(resourceGroupName, serverName, databaseName).block();
    }

    /**
     * Sets a database's long term retention policy.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param parameters A long term retention policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String databaseName, BackupLongTermRetentionPolicyInner parameters) {
        final String policyName = "default";
        final String apiVersion = "2017-03-01-preview";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, serverName, databaseName, policyName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Sets a database's long term retention policy.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param parameters A long term retention policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BackupLongTermRetentionPolicyInner> createOrUpdateAsync(String resourceGroupName, String serverName, String databaseName, BackupLongTermRetentionPolicyInner parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, serverName, databaseName, parameters);
        return client.<BackupLongTermRetentionPolicyInner, BackupLongTermRetentionPolicyInner>getLroResultAsync(response, client.getHttpPipeline(), BackupLongTermRetentionPolicyInner.class, BackupLongTermRetentionPolicyInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Sets a database's long term retention policy.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param parameters A long term retention policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BackupLongTermRetentionPolicyInner createOrUpdate(String resourceGroupName, String serverName, String databaseName, BackupLongTermRetentionPolicyInner parameters) {
        return createOrUpdateAsync(resourceGroupName, serverName, databaseName, parameters).block();
    }

    /**
     * Gets a database's long term retention policy.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<BackupLongTermRetentionPolicyInner>> listByDatabaseWithResponseAsync(String resourceGroupName, String serverName, String databaseName) {
        final String apiVersion = "2017-03-01-preview";
        return service.listByDatabase(this.client.getHost(), resourceGroupName, serverName, databaseName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets a database's long term retention policy.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BackupLongTermRetentionPolicyInner> listByDatabaseAsync(String resourceGroupName, String serverName, String databaseName) {
        return listByDatabaseWithResponseAsync(resourceGroupName, serverName, databaseName)
            .flatMap((SimpleResponse<BackupLongTermRetentionPolicyInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a database's long term retention policy.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BackupLongTermRetentionPolicyInner listByDatabase(String resourceGroupName, String serverName, String databaseName) {
        return listByDatabaseAsync(resourceGroupName, serverName, databaseName).block();
    }

    /**
     * Sets a database's long term retention policy.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param parameters A long term retention policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<BackupLongTermRetentionPolicyInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String databaseName, BackupLongTermRetentionPolicyInner parameters) {
        final String policyName = "default";
        final String apiVersion = "2017-03-01-preview";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, serverName, databaseName, policyName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Sets a database's long term retention policy.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param parameters A long term retention policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BackupLongTermRetentionPolicyInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, String databaseName, BackupLongTermRetentionPolicyInner parameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, serverName, databaseName, parameters)
            .flatMap((SimpleResponse<BackupLongTermRetentionPolicyInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Sets a database's long term retention policy.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param parameters A long term retention policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BackupLongTermRetentionPolicyInner beginCreateOrUpdate(String resourceGroupName, String serverName, String databaseName, BackupLongTermRetentionPolicyInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, serverName, databaseName, parameters).block();
    }
}
