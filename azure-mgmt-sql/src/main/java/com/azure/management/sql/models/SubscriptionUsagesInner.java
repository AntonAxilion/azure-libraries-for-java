// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * SubscriptionUsages.
 */
public final class SubscriptionUsagesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private SubscriptionUsagesService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of SubscriptionUsagesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public SubscriptionUsagesInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(SubscriptionUsagesService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientSubscriptionUsages to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientSubscriptionUsages")
    private interface SubscriptionUsagesService {
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Sql/locations/{locationName}/usages")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<SubscriptionUsageListResultInner>> listByLocation(@HostParam("$host") String host, @PathParam("locationName") String locationName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Sql/locations/{locationName}/usages/{usageName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<SubscriptionUsageInner>> get(@HostParam("$host") String host, @PathParam("locationName") String locationName, @PathParam("usageName") String usageName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<SubscriptionUsageListResultInner>> listByLocationNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Gets all subscription usage metrics in a given location.
     * 
     * @param locationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<SubscriptionUsageInner>> listByLocationSinglePageAsync(String locationName) {
        final String apiVersion = "2015-05-01-preview";
        return service.listByLocation(this.client.getHost(), locationName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets all subscription usage metrics in a given location.
     * 
     * @param locationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SubscriptionUsageInner> listByLocationAsync(String locationName) {
        return new PagedFlux<>(
            () -> listByLocationSinglePageAsync(locationName),
            nextLink -> listByLocationNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all subscription usage metrics in a given location.
     * 
     * @param locationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SubscriptionUsageInner> listByLocation(String locationName) {
        return new PagedIterable<>(listByLocationAsync(locationName));
    }

    /**
     * Gets a subscription usage metric.
     * 
     * @param locationName 
     * @param usageName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SubscriptionUsageInner>> getWithResponseAsync(String locationName, String usageName) {
        final String apiVersion = "2015-05-01-preview";
        return service.get(this.client.getHost(), locationName, usageName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets a subscription usage metric.
     * 
     * @param locationName 
     * @param usageName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SubscriptionUsageInner> getAsync(String locationName, String usageName) {
        return getWithResponseAsync(locationName, usageName)
            .flatMap((SimpleResponse<SubscriptionUsageInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a subscription usage metric.
     * 
     * @param locationName 
     * @param usageName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SubscriptionUsageInner get(String locationName, String usageName) {
        return getAsync(locationName, usageName).block();
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
    public Mono<PagedResponse<SubscriptionUsageInner>> listByLocationNextSinglePageAsync(String nextLink) {
        return service.listByLocationNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
