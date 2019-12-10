/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.store;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.datalake.store.models.TrustedIdProvider;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import rx.Observable;

import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in TrustedIdProviders.
 */
public interface TrustedIdProviders {
    /**
     * Lists the Data Lake Store trusted identity providers within the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;TrustedIdProvider&gt; object if successful.
     */
    PagedList<TrustedIdProvider> listByAccount(String resourceGroupName, String accountName);

    /**
     * Lists the Data Lake Store trusted identity providers within the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<TrustedIdProvider>> listByAccountAsync(String resourceGroupName, String accountName, ListOperationCallback<TrustedIdProvider> serviceCallback);

    /**
     * Lists the Data Lake Store trusted identity providers within the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;TrustedIdProvider&gt; object
     */
    Observable<Page<TrustedIdProvider>> listByAccountAsync(String resourceGroupName, String accountName);

    /**
     * Lists the Data Lake Store trusted identity providers within the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;TrustedIdProvider&gt; object
     */
    Observable<ServiceResponse<Page<TrustedIdProvider>>> listByAccountWithServiceResponseAsync(String resourceGroupName, String accountName);

    /**
     * Creates or updates the specified trusted identity provider. During update, the trusted identity provider with the specified name will be replaced with this new provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * @param idProvider The URL of this trusted identity provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TrustedIdProvider object if successful.
     */
    TrustedIdProvider createOrUpdate(String resourceGroupName, String accountName, String trustedIdProviderName, String idProvider);

    /**
     * Creates or updates the specified trusted identity provider. During update, the trusted identity provider with the specified name will be replaced with this new provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * @param idProvider The URL of this trusted identity provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TrustedIdProvider> createOrUpdateAsync(String resourceGroupName, String accountName, String trustedIdProviderName, String idProvider, ServiceCallback<TrustedIdProvider> serviceCallback);

    /**
     * Creates or updates the specified trusted identity provider. During update, the trusted identity provider with the specified name will be replaced with this new provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * @param idProvider The URL of this trusted identity provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TrustedIdProvider object
     */
    Observable<TrustedIdProvider> createOrUpdateAsync(String resourceGroupName, String accountName, String trustedIdProviderName, String idProvider);

    /**
     * Creates or updates the specified trusted identity provider. During update, the trusted identity provider with the specified name will be replaced with this new provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * @param idProvider The URL of this trusted identity provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TrustedIdProvider object
     */
    Observable<ServiceResponse<TrustedIdProvider>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String accountName, String trustedIdProviderName, String idProvider);

    /**
     * Gets the specified Data Lake Store trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TrustedIdProvider object if successful.
     */
    TrustedIdProvider get(String resourceGroupName, String accountName, String trustedIdProviderName);

    /**
     * Gets the specified Data Lake Store trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider to retrieve.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TrustedIdProvider> getAsync(String resourceGroupName, String accountName, String trustedIdProviderName, ServiceCallback<TrustedIdProvider> serviceCallback);

    /**
     * Gets the specified Data Lake Store trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TrustedIdProvider object
     */
    Observable<TrustedIdProvider> getAsync(String resourceGroupName, String accountName, String trustedIdProviderName);

    /**
     * Gets the specified Data Lake Store trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TrustedIdProvider object
     */
    Observable<ServiceResponse<TrustedIdProvider>> getWithServiceResponseAsync(String resourceGroupName, String accountName, String trustedIdProviderName);

    /**
     * Updates the specified trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TrustedIdProvider object if successful.
     */
    TrustedIdProvider update(String resourceGroupName, String accountName, String trustedIdProviderName);

    /**
     * Updates the specified trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TrustedIdProvider> updateAsync(String resourceGroupName, String accountName, String trustedIdProviderName, ServiceCallback<TrustedIdProvider> serviceCallback);

    /**
     * Updates the specified trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TrustedIdProvider object
     */
    Observable<TrustedIdProvider> updateAsync(String resourceGroupName, String accountName, String trustedIdProviderName);

    /**
     * Updates the specified trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TrustedIdProvider object
     */
    Observable<ServiceResponse<TrustedIdProvider>> updateWithServiceResponseAsync(String resourceGroupName, String accountName, String trustedIdProviderName);
    /**
     * Updates the specified trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * @param idProvider The URL of this trusted identity provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TrustedIdProvider object if successful.
     */
    TrustedIdProvider update(String resourceGroupName, String accountName, String trustedIdProviderName, String idProvider);

    /**
     * Updates the specified trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * @param idProvider The URL of this trusted identity provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TrustedIdProvider> updateAsync(String resourceGroupName, String accountName, String trustedIdProviderName, String idProvider, ServiceCallback<TrustedIdProvider> serviceCallback);

    /**
     * Updates the specified trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * @param idProvider The URL of this trusted identity provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TrustedIdProvider object
     */
    Observable<TrustedIdProvider> updateAsync(String resourceGroupName, String accountName, String trustedIdProviderName, String idProvider);

    /**
     * Updates the specified trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * @param idProvider The URL of this trusted identity provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TrustedIdProvider object
     */
    Observable<ServiceResponse<TrustedIdProvider>> updateWithServiceResponseAsync(String resourceGroupName, String accountName, String trustedIdProviderName, String idProvider);

    /**
     * Deletes the specified trusted identity provider from the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String resourceGroupName, String accountName, String trustedIdProviderName);

    /**
     * Deletes the specified trusted identity provider from the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider to delete.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String resourceGroupName, String accountName, String trustedIdProviderName, ServiceCallback<Void> serviceCallback);

    /**
     * Deletes the specified trusted identity provider from the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String resourceGroupName, String accountName, String trustedIdProviderName);

    /**
     * Deletes the specified trusted identity provider from the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String accountName, String trustedIdProviderName);

    /**
     * Lists the Data Lake Store trusted identity providers within the specified Data Lake Store account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;TrustedIdProvider&gt; object if successful.
     */
    PagedList<TrustedIdProvider> listByAccountNext(String nextPageLink);

    /**
     * Lists the Data Lake Store trusted identity providers within the specified Data Lake Store account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<TrustedIdProvider>> listByAccountNextAsync(String nextPageLink, ServiceFuture<List<TrustedIdProvider>> serviceFuture, ListOperationCallback<TrustedIdProvider> serviceCallback);

    /**
     * Lists the Data Lake Store trusted identity providers within the specified Data Lake Store account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;TrustedIdProvider&gt; object
     */
    Observable<Page<TrustedIdProvider>> listByAccountNextAsync(String nextPageLink);

    /**
     * Lists the Data Lake Store trusted identity providers within the specified Data Lake Store account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;TrustedIdProvider&gt; object
     */
    Observable<ServiceResponse<Page<TrustedIdProvider>>> listByAccountNextWithServiceResponseAsync(String nextPageLink);

}
