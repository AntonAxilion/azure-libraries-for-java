// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

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
 * VpnConnections.
 */
public final class VpnConnectionsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private VpnConnectionsService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of VpnConnectionsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public VpnConnectionsInner(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(VpnConnectionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientVpnConnections to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementClientVpnConnections")
    private interface VpnConnectionsService {
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnGateways/{gatewayName}/vpnConnections/{connectionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VpnConnectionInner>> get(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("gatewayName") String gatewayName, @PathParam("connectionName") String connectionName, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnGateways/{gatewayName}/vpnConnections/{connectionName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("gatewayName") String gatewayName, @PathParam("connectionName") String connectionName, @BodyParam("application/json") VpnConnectionInner vpnConnectionParameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnGateways/{gatewayName}/vpnConnections/{connectionName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("gatewayName") String gatewayName, @PathParam("connectionName") String connectionName, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnGateways/{gatewayName}/vpnConnections")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ListVpnConnectionsResultInner>> listByVpnGateway(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("gatewayName") String gatewayName, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnGateways/{gatewayName}/vpnConnections/{connectionName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VpnConnectionInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("gatewayName") String gatewayName, @PathParam("connectionName") String connectionName, @BodyParam("application/json") VpnConnectionInner vpnConnectionParameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnGateways/{gatewayName}/vpnConnections/{connectionName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("gatewayName") String gatewayName, @PathParam("connectionName") String connectionName, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ListVpnConnectionsResultInner>> listByVpnGatewayNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Retrieves the details of a vpn connection.
     * 
     * @param resourceGroupName 
     * @param gatewayName 
     * @param connectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VpnConnectionInner>> getWithResponseAsync(String resourceGroupName, String gatewayName, String connectionName) {
        final String apiVersion = "2019-11-01";
        return service.get(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, gatewayName, connectionName, apiVersion);
    }

    /**
     * Retrieves the details of a vpn connection.
     * 
     * @param resourceGroupName 
     * @param gatewayName 
     * @param connectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpnConnectionInner> getAsync(String resourceGroupName, String gatewayName, String connectionName) {
        return getWithResponseAsync(resourceGroupName, gatewayName, connectionName)
            .flatMap((SimpleResponse<VpnConnectionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Retrieves the details of a vpn connection.
     * 
     * @param resourceGroupName 
     * @param gatewayName 
     * @param connectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VpnConnectionInner get(String resourceGroupName, String gatewayName, String connectionName) {
        return getAsync(resourceGroupName, gatewayName, connectionName).block();
    }

    /**
     * Creates a vpn connection to a scalable vpn gateway if it doesn't exist else updates the existing connection.
     * 
     * @param resourceGroupName 
     * @param gatewayName 
     * @param connectionName 
     * @param vpnConnectionParameters VpnConnection Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String gatewayName, String connectionName, VpnConnectionInner vpnConnectionParameters) {
        final String apiVersion = "2019-11-01";
        return service.createOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, gatewayName, connectionName, vpnConnectionParameters, apiVersion);
    }

    /**
     * Creates a vpn connection to a scalable vpn gateway if it doesn't exist else updates the existing connection.
     * 
     * @param resourceGroupName 
     * @param gatewayName 
     * @param connectionName 
     * @param vpnConnectionParameters VpnConnection Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpnConnectionInner> createOrUpdateAsync(String resourceGroupName, String gatewayName, String connectionName, VpnConnectionInner vpnConnectionParameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, gatewayName, connectionName, vpnConnectionParameters);
        return client.<VpnConnectionInner, VpnConnectionInner>getLroResultAsync(response, client.getHttpPipeline(), VpnConnectionInner.class, VpnConnectionInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates a vpn connection to a scalable vpn gateway if it doesn't exist else updates the existing connection.
     * 
     * @param resourceGroupName 
     * @param gatewayName 
     * @param connectionName 
     * @param vpnConnectionParameters VpnConnection Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VpnConnectionInner createOrUpdate(String resourceGroupName, String gatewayName, String connectionName, VpnConnectionInner vpnConnectionParameters) {
        return createOrUpdateAsync(resourceGroupName, gatewayName, connectionName, vpnConnectionParameters).block();
    }

    /**
     * Deletes a vpn connection.
     * 
     * @param resourceGroupName 
     * @param gatewayName 
     * @param connectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String gatewayName, String connectionName) {
        final String apiVersion = "2019-11-01";
        return service.delete(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, gatewayName, connectionName, apiVersion);
    }

    /**
     * Deletes a vpn connection.
     * 
     * @param resourceGroupName 
     * @param gatewayName 
     * @param connectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String gatewayName, String connectionName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, gatewayName, connectionName);
        return client.<Void, Void>getLroResultAsync(response, client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes a vpn connection.
     * 
     * @param resourceGroupName 
     * @param gatewayName 
     * @param connectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String gatewayName, String connectionName) {
        deleteAsync(resourceGroupName, gatewayName, connectionName).block();
    }

    /**
     * Retrieves all vpn connections for a particular virtual wan vpn gateway.
     * 
     * @param resourceGroupName 
     * @param gatewayName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VpnConnectionInner>> listByVpnGatewaySinglePageAsync(String resourceGroupName, String gatewayName) {
        final String apiVersion = "2019-11-01";
        return service.listByVpnGateway(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, gatewayName, apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Retrieves all vpn connections for a particular virtual wan vpn gateway.
     * 
     * @param resourceGroupName 
     * @param gatewayName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<VpnConnectionInner> listByVpnGatewayAsync(String resourceGroupName, String gatewayName) {
        return new PagedFlux<>(
            () -> listByVpnGatewaySinglePageAsync(resourceGroupName, gatewayName),
            nextLink -> listByVpnGatewayNextSinglePageAsync(nextLink));
    }

    /**
     * Retrieves all vpn connections for a particular virtual wan vpn gateway.
     * 
     * @param resourceGroupName 
     * @param gatewayName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VpnConnectionInner> listByVpnGateway(String resourceGroupName, String gatewayName) {
        return new PagedIterable<>(listByVpnGatewayAsync(resourceGroupName, gatewayName));
    }

    /**
     * Creates a vpn connection to a scalable vpn gateway if it doesn't exist else updates the existing connection.
     * 
     * @param resourceGroupName 
     * @param gatewayName 
     * @param connectionName 
     * @param vpnConnectionParameters VpnConnection Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VpnConnectionInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String gatewayName, String connectionName, VpnConnectionInner vpnConnectionParameters) {
        final String apiVersion = "2019-11-01";
        return service.beginCreateOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, gatewayName, connectionName, vpnConnectionParameters, apiVersion);
    }

    /**
     * Creates a vpn connection to a scalable vpn gateway if it doesn't exist else updates the existing connection.
     * 
     * @param resourceGroupName 
     * @param gatewayName 
     * @param connectionName 
     * @param vpnConnectionParameters VpnConnection Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpnConnectionInner> beginCreateOrUpdateAsync(String resourceGroupName, String gatewayName, String connectionName, VpnConnectionInner vpnConnectionParameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, gatewayName, connectionName, vpnConnectionParameters)
            .flatMap((SimpleResponse<VpnConnectionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates a vpn connection to a scalable vpn gateway if it doesn't exist else updates the existing connection.
     * 
     * @param resourceGroupName 
     * @param gatewayName 
     * @param connectionName 
     * @param vpnConnectionParameters VpnConnection Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VpnConnectionInner beginCreateOrUpdate(String resourceGroupName, String gatewayName, String connectionName, VpnConnectionInner vpnConnectionParameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, gatewayName, connectionName, vpnConnectionParameters).block();
    }

    /**
     * Deletes a vpn connection.
     * 
     * @param resourceGroupName 
     * @param gatewayName 
     * @param connectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String gatewayName, String connectionName) {
        final String apiVersion = "2019-11-01";
        return service.beginDelete(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, gatewayName, connectionName, apiVersion);
    }

    /**
     * Deletes a vpn connection.
     * 
     * @param resourceGroupName 
     * @param gatewayName 
     * @param connectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String gatewayName, String connectionName) {
        return beginDeleteWithResponseAsync(resourceGroupName, gatewayName, connectionName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes a vpn connection.
     * 
     * @param resourceGroupName 
     * @param gatewayName 
     * @param connectionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String gatewayName, String connectionName) {
        beginDeleteAsync(resourceGroupName, gatewayName, connectionName).block();
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
    public Mono<PagedResponse<VpnConnectionInner>> listByVpnGatewayNextSinglePageAsync(String nextLink) {
        return service.listByVpnGatewayNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
