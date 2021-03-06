/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.cdn.ErrorResponseException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in EdgeNodes.
 */
public class EdgeNodesInner {
    /** The Retrofit service to perform REST calls. */
    private EdgeNodesService service;
    /** The service client containing this operation class. */
    private CdnManagementClientImpl client;

    /**
     * Initializes an instance of EdgeNodesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public EdgeNodesInner(Retrofit retrofit, CdnManagementClientImpl client) {
        this.service = retrofit.create(EdgeNodesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for EdgeNodes to be
     * used by Retrofit to perform actually REST calls.
     */
    interface EdgeNodesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.cdn.EdgeNodes list" })
        @GET("providers/Microsoft.Cdn/edgenodes")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.cdn.EdgeNodes listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Edgenodes are the global Point of Presence (POP) locations used to deliver CDN content to end users.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;EdgeNodeInner&gt; object if successful.
     */
    public PagedList<EdgeNodeInner> list() {
        ServiceResponse<Page<EdgeNodeInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<EdgeNodeInner>(response.body()) {
            @Override
            public Page<EdgeNodeInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Edgenodes are the global Point of Presence (POP) locations used to deliver CDN content to end users.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<EdgeNodeInner>> listAsync(final ListOperationCallback<EdgeNodeInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<EdgeNodeInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EdgeNodeInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Edgenodes are the global Point of Presence (POP) locations used to deliver CDN content to end users.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;EdgeNodeInner&gt; object
     */
    public Observable<Page<EdgeNodeInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<EdgeNodeInner>>, Page<EdgeNodeInner>>() {
                @Override
                public Page<EdgeNodeInner> call(ServiceResponse<Page<EdgeNodeInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Edgenodes are the global Point of Presence (POP) locations used to deliver CDN content to end users.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;EdgeNodeInner&gt; object
     */
    public Observable<ServiceResponse<Page<EdgeNodeInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<EdgeNodeInner>>, Observable<ServiceResponse<Page<EdgeNodeInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EdgeNodeInner>>> call(ServiceResponse<Page<EdgeNodeInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Edgenodes are the global Point of Presence (POP) locations used to deliver CDN content to end users.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;EdgeNodeInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<EdgeNodeInner>>> listSinglePageAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<EdgeNodeInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EdgeNodeInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<EdgeNodeInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<EdgeNodeInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<EdgeNodeInner>> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<EdgeNodeInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<EdgeNodeInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Edgenodes are the global Point of Presence (POP) locations used to deliver CDN content to end users.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;EdgeNodeInner&gt; object if successful.
     */
    public PagedList<EdgeNodeInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<EdgeNodeInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<EdgeNodeInner>(response.body()) {
            @Override
            public Page<EdgeNodeInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Edgenodes are the global Point of Presence (POP) locations used to deliver CDN content to end users.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<EdgeNodeInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<EdgeNodeInner>> serviceFuture, final ListOperationCallback<EdgeNodeInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<EdgeNodeInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EdgeNodeInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Edgenodes are the global Point of Presence (POP) locations used to deliver CDN content to end users.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;EdgeNodeInner&gt; object
     */
    public Observable<Page<EdgeNodeInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<EdgeNodeInner>>, Page<EdgeNodeInner>>() {
                @Override
                public Page<EdgeNodeInner> call(ServiceResponse<Page<EdgeNodeInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Edgenodes are the global Point of Presence (POP) locations used to deliver CDN content to end users.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;EdgeNodeInner&gt; object
     */
    public Observable<ServiceResponse<Page<EdgeNodeInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<EdgeNodeInner>>, Observable<ServiceResponse<Page<EdgeNodeInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EdgeNodeInner>>> call(ServiceResponse<Page<EdgeNodeInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Edgenodes are the global Point of Presence (POP) locations used to deliver CDN content to end users.
     *
    ServiceResponse<PageImpl<EdgeNodeInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;EdgeNodeInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<EdgeNodeInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<EdgeNodeInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EdgeNodeInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<EdgeNodeInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<EdgeNodeInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<EdgeNodeInner>> listNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<EdgeNodeInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<EdgeNodeInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
