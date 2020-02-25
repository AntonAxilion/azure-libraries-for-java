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
import com.azure.core.annotation.Patch;
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
import com.azure.management.network.TagsObject;
import com.azure.management.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.management.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.management.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * VpnSites.
 */
public final class VpnSitesInner implements InnerSupportsGet<VpnSiteInner>, InnerSupportsListing<VpnSiteInner>, InnerSupportsDelete<Void> {
    /**
     * The proxy service used to perform REST calls.
     */
    private VpnSitesService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of VpnSitesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public VpnSitesInner(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(VpnSitesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientVpnSites to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementClientVpnSites")
    private interface VpnSitesService {
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnSites/{vpnSiteName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VpnSiteInner>> getByResourceGroup(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vpnSiteName") String vpnSiteName, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnSites/{vpnSiteName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vpnSiteName") String vpnSiteName, @BodyParam("application/json") VpnSiteInner vpnSiteParameters, @QueryParam("api-version") String apiVersion);

        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnSites/{vpnSiteName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VpnSiteInner>> updateTags(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vpnSiteName") String vpnSiteName, @BodyParam("application/json") TagsObject vpnSiteParameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnSites/{vpnSiteName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vpnSiteName") String vpnSiteName, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnSites")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ListVpnSitesResultInner>> listByResourceGroup(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Network/vpnSites")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ListVpnSitesResultInner>> list(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnSites/{vpnSiteName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VpnSiteInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vpnSiteName") String vpnSiteName, @BodyParam("application/json") VpnSiteInner vpnSiteParameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnSites/{vpnSiteName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vpnSiteName") String vpnSiteName, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ListVpnSitesResultInner>> listByResourceGroupNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ListVpnSitesResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Retrieves the details of a VPN site.
     * 
     * @param resourceGroupName 
     * @param vpnSiteName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VpnSiteInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String vpnSiteName) {
        final String apiVersion = "2019-11-01";
        return service.getByResourceGroup(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, vpnSiteName, apiVersion);
    }

    /**
     * Retrieves the details of a VPN site.
     * 
     * @param resourceGroupName 
     * @param vpnSiteName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpnSiteInner> getByResourceGroupAsync(String resourceGroupName, String vpnSiteName) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, vpnSiteName)
            .flatMap((SimpleResponse<VpnSiteInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Retrieves the details of a VPN site.
     * 
     * @param resourceGroupName 
     * @param vpnSiteName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VpnSiteInner getByResourceGroup(String resourceGroupName, String vpnSiteName) {
        return getByResourceGroupAsync(resourceGroupName, vpnSiteName).block();
    }

    /**
     * Creates a VpnSite resource if it doesn't exist else updates the existing VpnSite.
     * 
     * @param resourceGroupName 
     * @param vpnSiteName 
     * @param vpnSiteParameters VpnSite Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String vpnSiteName, VpnSiteInner vpnSiteParameters) {
        final String apiVersion = "2019-11-01";
        return service.createOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, vpnSiteName, vpnSiteParameters, apiVersion);
    }

    /**
     * Creates a VpnSite resource if it doesn't exist else updates the existing VpnSite.
     * 
     * @param resourceGroupName 
     * @param vpnSiteName 
     * @param vpnSiteParameters VpnSite Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpnSiteInner> createOrUpdateAsync(String resourceGroupName, String vpnSiteName, VpnSiteInner vpnSiteParameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, vpnSiteName, vpnSiteParameters);
        return client.<VpnSiteInner, VpnSiteInner>getLroResultAsync(response, client.getHttpPipeline(), VpnSiteInner.class, VpnSiteInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates a VpnSite resource if it doesn't exist else updates the existing VpnSite.
     * 
     * @param resourceGroupName 
     * @param vpnSiteName 
     * @param vpnSiteParameters VpnSite Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VpnSiteInner createOrUpdate(String resourceGroupName, String vpnSiteName, VpnSiteInner vpnSiteParameters) {
        return createOrUpdateAsync(resourceGroupName, vpnSiteName, vpnSiteParameters).block();
    }

    /**
     * Updates VpnSite tags.
     * 
     * @param resourceGroupName 
     * @param vpnSiteName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VpnSiteInner>> updateTagsWithResponseAsync(String resourceGroupName, String vpnSiteName, Map<String, String> tags) {
        final String apiVersion = "2019-11-01";
        TagsObject vpnSiteParameters = new TagsObject();
        vpnSiteParameters.withTags(tags);
        return service.updateTags(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, vpnSiteName, vpnSiteParameters, apiVersion);
    }

    /**
     * Updates VpnSite tags.
     * 
     * @param resourceGroupName 
     * @param vpnSiteName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpnSiteInner> updateTagsAsync(String resourceGroupName, String vpnSiteName, Map<String, String> tags) {
        return updateTagsWithResponseAsync(resourceGroupName, vpnSiteName, tags)
            .flatMap((SimpleResponse<VpnSiteInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Updates VpnSite tags.
     * 
     * @param resourceGroupName 
     * @param vpnSiteName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VpnSiteInner updateTags(String resourceGroupName, String vpnSiteName, Map<String, String> tags) {
        return updateTagsAsync(resourceGroupName, vpnSiteName, tags).block();
    }

    /**
     * Deletes a VpnSite.
     * 
     * @param resourceGroupName 
     * @param vpnSiteName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String vpnSiteName) {
        final String apiVersion = "2019-11-01";
        return service.delete(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, vpnSiteName, apiVersion);
    }

    /**
     * Deletes a VpnSite.
     * 
     * @param resourceGroupName 
     * @param vpnSiteName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String vpnSiteName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, vpnSiteName);
        return client.<Void, Void>getLroResultAsync(response, client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes a VpnSite.
     * 
     * @param resourceGroupName 
     * @param vpnSiteName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String vpnSiteName) {
        deleteAsync(resourceGroupName, vpnSiteName).block();
    }

    /**
     * Lists all the vpnSites in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VpnSiteInner>> listByResourceGroupSinglePageAsync(String resourceGroupName) {
        final String apiVersion = "2019-11-01";
        return service.listByResourceGroup(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Lists all the vpnSites in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<VpnSiteInner> listByResourceGroupAsync(String resourceGroupName) {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(resourceGroupName),
            nextLink -> listByResourceGroupNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all the vpnSites in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VpnSiteInner> listByResourceGroup(String resourceGroupName) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName));
    }

    /**
     * Lists all the VpnSites in a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VpnSiteInner>> listSinglePageAsync() {
        final String apiVersion = "2019-11-01";
        return service.list(this.client.getHost(), this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Lists all the VpnSites in a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<VpnSiteInner> listAsync() {
        return new PagedFlux<>(
            () -> listSinglePageAsync(),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all the VpnSites in a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VpnSiteInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Creates a VpnSite resource if it doesn't exist else updates the existing VpnSite.
     * 
     * @param resourceGroupName 
     * @param vpnSiteName 
     * @param vpnSiteParameters VpnSite Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VpnSiteInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String vpnSiteName, VpnSiteInner vpnSiteParameters) {
        final String apiVersion = "2019-11-01";
        return service.beginCreateOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, vpnSiteName, vpnSiteParameters, apiVersion);
    }

    /**
     * Creates a VpnSite resource if it doesn't exist else updates the existing VpnSite.
     * 
     * @param resourceGroupName 
     * @param vpnSiteName 
     * @param vpnSiteParameters VpnSite Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpnSiteInner> beginCreateOrUpdateAsync(String resourceGroupName, String vpnSiteName, VpnSiteInner vpnSiteParameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, vpnSiteName, vpnSiteParameters)
            .flatMap((SimpleResponse<VpnSiteInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates a VpnSite resource if it doesn't exist else updates the existing VpnSite.
     * 
     * @param resourceGroupName 
     * @param vpnSiteName 
     * @param vpnSiteParameters VpnSite Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VpnSiteInner beginCreateOrUpdate(String resourceGroupName, String vpnSiteName, VpnSiteInner vpnSiteParameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, vpnSiteName, vpnSiteParameters).block();
    }

    /**
     * Deletes a VpnSite.
     * 
     * @param resourceGroupName 
     * @param vpnSiteName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String vpnSiteName) {
        final String apiVersion = "2019-11-01";
        return service.beginDelete(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, vpnSiteName, apiVersion);
    }

    /**
     * Deletes a VpnSite.
     * 
     * @param resourceGroupName 
     * @param vpnSiteName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String vpnSiteName) {
        return beginDeleteWithResponseAsync(resourceGroupName, vpnSiteName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes a VpnSite.
     * 
     * @param resourceGroupName 
     * @param vpnSiteName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String vpnSiteName) {
        beginDeleteAsync(resourceGroupName, vpnSiteName).block();
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
    public Mono<PagedResponse<VpnSiteInner>> listByResourceGroupNextSinglePageAsync(String nextLink) {
        return service.listByResourceGroupNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
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
    public Mono<PagedResponse<VpnSiteInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
