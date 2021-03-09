// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.fluent.models.VirtualMachineImageInner;
import com.azure.resourcemanager.compute.fluent.models.VirtualMachineImageResourceInner;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in VirtualMachineImagesEdgeZonesClient. */
public interface VirtualMachineImagesEdgeZonesClient {
    /**
     * Gets a virtual machine image in an edge zone.
     *
     * @param location The name of a supported Azure region.
     * @param edgeZone The name of the edge zone.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param version A valid image SKU version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a virtual machine image in an edge zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<VirtualMachineImageInner>> getWithResponseAsync(
        String location, String edgeZone, String publisherName, String offer, String skus, String version);

    /**
     * Gets a virtual machine image in an edge zone.
     *
     * @param location The name of a supported Azure region.
     * @param edgeZone The name of the edge zone.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param version A valid image SKU version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a virtual machine image in an edge zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VirtualMachineImageInner> getAsync(
        String location, String edgeZone, String publisherName, String offer, String skus, String version);

    /**
     * Gets a virtual machine image in an edge zone.
     *
     * @param location The name of a supported Azure region.
     * @param edgeZone The name of the edge zone.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param version A valid image SKU version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a virtual machine image in an edge zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineImageInner get(
        String location, String edgeZone, String publisherName, String offer, String skus, String version);

    /**
     * Gets a virtual machine image in an edge zone.
     *
     * @param location The name of a supported Azure region.
     * @param edgeZone The name of the edge zone.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param version A valid image SKU version.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a virtual machine image in an edge zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualMachineImageInner> getWithResponse(
        String location,
        String edgeZone,
        String publisherName,
        String offer,
        String skus,
        String version,
        Context context);

    /**
     * Gets a list of all virtual machine image versions for the specified location, edge zone, publisher, offer, and
     * SKU.
     *
     * @param location The name of a supported Azure region.
     * @param edgeZone The name of the edge zone.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param expand The expand expression to apply on the operation.
     * @param top An integer value specifying the number of images to return that matches supplied values.
     * @param orderby Specifies the order of the results returned. Formatted as an OData query.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all virtual machine image versions for the specified location, edge zone, publisher, offer, and
     *     SKU.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<List<VirtualMachineImageResourceInner>>> listWithResponseAsync(
        String location,
        String edgeZone,
        String publisherName,
        String offer,
        String skus,
        String expand,
        Integer top,
        String orderby);

    /**
     * Gets a list of all virtual machine image versions for the specified location, edge zone, publisher, offer, and
     * SKU.
     *
     * @param location The name of a supported Azure region.
     * @param edgeZone The name of the edge zone.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param expand The expand expression to apply on the operation.
     * @param top An integer value specifying the number of images to return that matches supplied values.
     * @param orderby Specifies the order of the results returned. Formatted as an OData query.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all virtual machine image versions for the specified location, edge zone, publisher, offer, and
     *     SKU.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<List<VirtualMachineImageResourceInner>> listAsync(
        String location,
        String edgeZone,
        String publisherName,
        String offer,
        String skus,
        String expand,
        Integer top,
        String orderby);

    /**
     * Gets a list of all virtual machine image versions for the specified location, edge zone, publisher, offer, and
     * SKU.
     *
     * @param location The name of a supported Azure region.
     * @param edgeZone The name of the edge zone.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all virtual machine image versions for the specified location, edge zone, publisher, offer, and
     *     SKU.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<List<VirtualMachineImageResourceInner>> listAsync(
        String location, String edgeZone, String publisherName, String offer, String skus);

    /**
     * Gets a list of all virtual machine image versions for the specified location, edge zone, publisher, offer, and
     * SKU.
     *
     * @param location The name of a supported Azure region.
     * @param edgeZone The name of the edge zone.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all virtual machine image versions for the specified location, edge zone, publisher, offer, and
     *     SKU.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<VirtualMachineImageResourceInner> list(
        String location, String edgeZone, String publisherName, String offer, String skus);

    /**
     * Gets a list of all virtual machine image versions for the specified location, edge zone, publisher, offer, and
     * SKU.
     *
     * @param location The name of a supported Azure region.
     * @param edgeZone The name of the edge zone.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param expand The expand expression to apply on the operation.
     * @param top An integer value specifying the number of images to return that matches supplied values.
     * @param orderby Specifies the order of the results returned. Formatted as an OData query.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all virtual machine image versions for the specified location, edge zone, publisher, offer, and
     *     SKU.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<VirtualMachineImageResourceInner>> listWithResponse(
        String location,
        String edgeZone,
        String publisherName,
        String offer,
        String skus,
        String expand,
        Integer top,
        String orderby,
        Context context);

    /**
     * Gets a list of virtual machine image offers for the specified location, edge zone and publisher.
     *
     * @param location The name of a supported Azure region.
     * @param edgeZone The name of the edge zone.
     * @param publisherName A valid image publisher.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine image offers for the specified location, edge zone and publisher.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<List<VirtualMachineImageResourceInner>>> listOffersWithResponseAsync(
        String location, String edgeZone, String publisherName);

    /**
     * Gets a list of virtual machine image offers for the specified location, edge zone and publisher.
     *
     * @param location The name of a supported Azure region.
     * @param edgeZone The name of the edge zone.
     * @param publisherName A valid image publisher.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine image offers for the specified location, edge zone and publisher.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<List<VirtualMachineImageResourceInner>> listOffersAsync(
        String location, String edgeZone, String publisherName);

    /**
     * Gets a list of virtual machine image offers for the specified location, edge zone and publisher.
     *
     * @param location The name of a supported Azure region.
     * @param edgeZone The name of the edge zone.
     * @param publisherName A valid image publisher.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine image offers for the specified location, edge zone and publisher.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<VirtualMachineImageResourceInner> listOffers(String location, String edgeZone, String publisherName);

    /**
     * Gets a list of virtual machine image offers for the specified location, edge zone and publisher.
     *
     * @param location The name of a supported Azure region.
     * @param edgeZone The name of the edge zone.
     * @param publisherName A valid image publisher.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine image offers for the specified location, edge zone and publisher.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<VirtualMachineImageResourceInner>> listOffersWithResponse(
        String location, String edgeZone, String publisherName, Context context);

    /**
     * Gets a list of virtual machine image publishers for the specified Azure location and edge zone.
     *
     * @param location The name of a supported Azure region.
     * @param edgeZone The name of the edge zone.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine image publishers for the specified Azure location and edge zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<List<VirtualMachineImageResourceInner>>> listPublishersWithResponseAsync(
        String location, String edgeZone);

    /**
     * Gets a list of virtual machine image publishers for the specified Azure location and edge zone.
     *
     * @param location The name of a supported Azure region.
     * @param edgeZone The name of the edge zone.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine image publishers for the specified Azure location and edge zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<List<VirtualMachineImageResourceInner>> listPublishersAsync(String location, String edgeZone);

    /**
     * Gets a list of virtual machine image publishers for the specified Azure location and edge zone.
     *
     * @param location The name of a supported Azure region.
     * @param edgeZone The name of the edge zone.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine image publishers for the specified Azure location and edge zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<VirtualMachineImageResourceInner> listPublishers(String location, String edgeZone);

    /**
     * Gets a list of virtual machine image publishers for the specified Azure location and edge zone.
     *
     * @param location The name of a supported Azure region.
     * @param edgeZone The name of the edge zone.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine image publishers for the specified Azure location and edge zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<VirtualMachineImageResourceInner>> listPublishersWithResponse(
        String location, String edgeZone, Context context);

    /**
     * Gets a list of virtual machine image SKUs for the specified location, edge zone, publisher, and offer.
     *
     * @param location The name of a supported Azure region.
     * @param edgeZone The name of the edge zone.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine image SKUs for the specified location, edge zone, publisher, and offer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<List<VirtualMachineImageResourceInner>>> listSkusWithResponseAsync(
        String location, String edgeZone, String publisherName, String offer);

    /**
     * Gets a list of virtual machine image SKUs for the specified location, edge zone, publisher, and offer.
     *
     * @param location The name of a supported Azure region.
     * @param edgeZone The name of the edge zone.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine image SKUs for the specified location, edge zone, publisher, and offer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<List<VirtualMachineImageResourceInner>> listSkusAsync(
        String location, String edgeZone, String publisherName, String offer);

    /**
     * Gets a list of virtual machine image SKUs for the specified location, edge zone, publisher, and offer.
     *
     * @param location The name of a supported Azure region.
     * @param edgeZone The name of the edge zone.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine image SKUs for the specified location, edge zone, publisher, and offer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<VirtualMachineImageResourceInner> listSkus(
        String location, String edgeZone, String publisherName, String offer);

    /**
     * Gets a list of virtual machine image SKUs for the specified location, edge zone, publisher, and offer.
     *
     * @param location The name of a supported Azure region.
     * @param edgeZone The name of the edge zone.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine image SKUs for the specified location, edge zone, publisher, and offer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<VirtualMachineImageResourceInner>> listSkusWithResponse(
        String location, String edgeZone, String publisherName, String offer, Context context);
}
