// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies the hardware settings for the virtual machine. */
@Fluent
public final class HardwareProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HardwareProfile.class);

    /*
     * Specifies the size of the virtual machine. <br><br> The enum data type
     * is currently deprecated and will be removed by December 23rd 2023.
     * <br><br> Recommended way to get the list of available sizes is using
     * these APIs: <br><br> [List all available virtual machine sizes in an
     * availability
     * set](https://docs.microsoft.com/rest/api/compute/availabilitysets/listavailablesizes)
     * <br><br> [List all available virtual machine sizes in a region](
     * https://docs.microsoft.com/en-us/rest/api/compute/resourceskus/list)
     * <br><br> [List all available virtual machine sizes for
     * resizing](https://docs.microsoft.com/rest/api/compute/virtualmachines/listavailablesizes).
     * For more information about virtual machine sizes, see [Sizes for virtual
     * machines](https://docs.microsoft.com/en-us/azure/virtual-machines/sizes).
     * <br><br> The available VM sizes depend on region and availability set.
     */
    @JsonProperty(value = "vmSize")
    private VirtualMachineSizeTypes vmSize;

    /**
     * Get the vmSize property: Specifies the size of the virtual machine. &lt;br&gt;&lt;br&gt; The enum data type is
     * currently deprecated and will be removed by December 23rd 2023. &lt;br&gt;&lt;br&gt; Recommended way to get the
     * list of available sizes is using these APIs: &lt;br&gt;&lt;br&gt; [List all available virtual machine sizes in an
     * availability set](https://docs.microsoft.com/rest/api/compute/availabilitysets/listavailablesizes)
     * &lt;br&gt;&lt;br&gt; [List all available virtual machine sizes in a region](
     * https://docs.microsoft.com/en-us/rest/api/compute/resourceskus/list) &lt;br&gt;&lt;br&gt; [List all available
     * virtual machine sizes for
     * resizing](https://docs.microsoft.com/rest/api/compute/virtualmachines/listavailablesizes). For more information
     * about virtual machine sizes, see [Sizes for virtual
     * machines](https://docs.microsoft.com/en-us/azure/virtual-machines/sizes). &lt;br&gt;&lt;br&gt; The available VM
     * sizes depend on region and availability set.
     *
     * @return the vmSize value.
     */
    public VirtualMachineSizeTypes vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize property: Specifies the size of the virtual machine. &lt;br&gt;&lt;br&gt; The enum data type is
     * currently deprecated and will be removed by December 23rd 2023. &lt;br&gt;&lt;br&gt; Recommended way to get the
     * list of available sizes is using these APIs: &lt;br&gt;&lt;br&gt; [List all available virtual machine sizes in an
     * availability set](https://docs.microsoft.com/rest/api/compute/availabilitysets/listavailablesizes)
     * &lt;br&gt;&lt;br&gt; [List all available virtual machine sizes in a region](
     * https://docs.microsoft.com/en-us/rest/api/compute/resourceskus/list) &lt;br&gt;&lt;br&gt; [List all available
     * virtual machine sizes for
     * resizing](https://docs.microsoft.com/rest/api/compute/virtualmachines/listavailablesizes). For more information
     * about virtual machine sizes, see [Sizes for virtual
     * machines](https://docs.microsoft.com/en-us/azure/virtual-machines/sizes). &lt;br&gt;&lt;br&gt; The available VM
     * sizes depend on region and availability set.
     *
     * @param vmSize the vmSize value to set.
     * @return the HardwareProfile object itself.
     */
    public HardwareProfile withVmSize(VirtualMachineSizeTypes vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
