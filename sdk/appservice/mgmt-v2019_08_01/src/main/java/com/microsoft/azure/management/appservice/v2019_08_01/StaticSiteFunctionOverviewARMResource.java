/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.StaticSiteFunctionOverviewARMResourceInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.AppServiceManager;

/**
 * Type representing StaticSiteFunctionOverviewARMResource.
 */
public interface StaticSiteFunctionOverviewARMResource extends HasInner<StaticSiteFunctionOverviewARMResourceInner>, HasManager<AppServiceManager> {
    /**
     * @return the functionName value.
     */
    String functionName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the triggerType value.
     */
    TriggerTypes triggerType();

    /**
     * @return the type value.
     */
    String type();

}