// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
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
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.polling.AsyncPollResponse;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * PrivateEndpointConnections.
 */
public final class PrivateEndpointConnectionsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private PrivateEndpointConnectionsService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of PrivateEndpointConnectionsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public PrivateEndpointConnectionsInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(PrivateEndpointConnectionsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientPrivateEndpointConnections to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientPrivateEndpointConnections")
    private interface PrivateEndpointConnectionsService {
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<PrivateEndpointConnectionInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") PrivateEndpointConnectionInner parameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/privateEndpointConnections")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<PrivateEndpointConnectionListResultInner>> listByServer(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<PrivateEndpointConnectionInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") PrivateEndpointConnectionInner parameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<PrivateEndpointConnectionListResultInner>> listByServerNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Gets a private endpoint connection.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param privateEndpointConnectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<PrivateEndpointConnectionInner>> getWithResponseAsync(String resourceGroupName, String serverName, String privateEndpointConnectionName) {
        final String apiVersion = "2018-06-01-preview";
        return service.get(this.client.getHost(), resourceGroupName, serverName, privateEndpointConnectionName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets a private endpoint connection.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param privateEndpointConnectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PrivateEndpointConnectionInner> getAsync(String resourceGroupName, String serverName, String privateEndpointConnectionName) {
        return getWithResponseAsync(resourceGroupName, serverName, privateEndpointConnectionName)
            .flatMap((SimpleResponse<PrivateEndpointConnectionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a private endpoint connection.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param privateEndpointConnectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnectionInner get(String resourceGroupName, String serverName, String privateEndpointConnectionName) {
        return getAsync(resourceGroupName, serverName, privateEndpointConnectionName).block();
    }

    /**
     * Approve or reject a private endpoint connection with a given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param privateEndpointConnectionName 
     * @param parameters A private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String privateEndpointConnectionName, PrivateEndpointConnectionInner parameters) {
        final String apiVersion = "2018-06-01-preview";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, serverName, privateEndpointConnectionName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Approve or reject a private endpoint connection with a given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param privateEndpointConnectionName 
     * @param parameters A private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PrivateEndpointConnectionInner> createOrUpdateAsync(String resourceGroupName, String serverName, String privateEndpointConnectionName, PrivateEndpointConnectionInner parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, serverName, privateEndpointConnectionName, parameters);
        return client.<PrivateEndpointConnectionInner, PrivateEndpointConnectionInner>getLroResultAsync(response, client.getHttpPipeline(), PrivateEndpointConnectionInner.class, PrivateEndpointConnectionInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Approve or reject a private endpoint connection with a given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param privateEndpointConnectionName 
     * @param parameters A private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnectionInner createOrUpdate(String resourceGroupName, String serverName, String privateEndpointConnectionName, PrivateEndpointConnectionInner parameters) {
        return createOrUpdateAsync(resourceGroupName, serverName, privateEndpointConnectionName, parameters).block();
    }

    /**
     * Deletes a private endpoint connection with a given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param privateEndpointConnectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String serverName, String privateEndpointConnectionName) {
        final String apiVersion = "2018-06-01-preview";
        return service.delete(this.client.getHost(), resourceGroupName, serverName, privateEndpointConnectionName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes a private endpoint connection with a given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param privateEndpointConnectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String serverName, String privateEndpointConnectionName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, serverName, privateEndpointConnectionName);
        return client.<Void, Void>getLroResultAsync(response, client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes a private endpoint connection with a given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param privateEndpointConnectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String serverName, String privateEndpointConnectionName) {
        deleteAsync(resourceGroupName, serverName, privateEndpointConnectionName).block();
    }

    /**
     * Gets all private endpoint connections on a server.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<PrivateEndpointConnectionInner>> listByServerSinglePageAsync(String resourceGroupName, String serverName) {
        final String apiVersion = "2018-06-01-preview";
        return service.listByServer(this.client.getHost(), resourceGroupName, serverName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets all private endpoint connections on a server.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<PrivateEndpointConnectionInner> listByServerAsync(String resourceGroupName, String serverName) {
        return new PagedFlux<>(
            () -> listByServerSinglePageAsync(resourceGroupName, serverName),
            nextLink -> listByServerNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all private endpoint connections on a server.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PrivateEndpointConnectionInner> listByServer(String resourceGroupName, String serverName) {
        return new PagedIterable<>(listByServerAsync(resourceGroupName, serverName));
    }

    /**
     * Approve or reject a private endpoint connection with a given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param privateEndpointConnectionName 
     * @param parameters A private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<PrivateEndpointConnectionInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String privateEndpointConnectionName, PrivateEndpointConnectionInner parameters) {
        final String apiVersion = "2018-06-01-preview";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, serverName, privateEndpointConnectionName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Approve or reject a private endpoint connection with a given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param privateEndpointConnectionName 
     * @param parameters A private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PrivateEndpointConnectionInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, String privateEndpointConnectionName, PrivateEndpointConnectionInner parameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, serverName, privateEndpointConnectionName, parameters)
            .flatMap((SimpleResponse<PrivateEndpointConnectionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Approve or reject a private endpoint connection with a given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param privateEndpointConnectionName 
     * @param parameters A private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnectionInner beginCreateOrUpdate(String resourceGroupName, String serverName, String privateEndpointConnectionName, PrivateEndpointConnectionInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, serverName, privateEndpointConnectionName, parameters).block();
    }

    /**
     * Deletes a private endpoint connection with a given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param privateEndpointConnectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String serverName, String privateEndpointConnectionName) {
        final String apiVersion = "2018-06-01-preview";
        return service.beginDelete(this.client.getHost(), resourceGroupName, serverName, privateEndpointConnectionName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes a private endpoint connection with a given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param privateEndpointConnectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String serverName, String privateEndpointConnectionName) {
        return beginDeleteWithResponseAsync(resourceGroupName, serverName, privateEndpointConnectionName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes a private endpoint connection with a given name.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param privateEndpointConnectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String serverName, String privateEndpointConnectionName) {
        beginDeleteAsync(resourceGroupName, serverName, privateEndpointConnectionName).block();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<PrivateEndpointConnectionInner>> listByServerNextSinglePageAsync(String nextLink) {
        return service.listByServerNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
