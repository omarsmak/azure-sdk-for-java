/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Description of a Virtual Network subnet that is useable for private site
 * access.
 */
public class PrivateAccessSubnet {
    /**
     * The name of the subnet.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The key (ID) of the subnet.
     */
    @JsonProperty(value = "key")
    private Integer key;

    /**
     * Get the name of the subnet.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the subnet.
     *
     * @param name the name value to set
     * @return the PrivateAccessSubnet object itself.
     */
    public PrivateAccessSubnet withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the key (ID) of the subnet.
     *
     * @return the key value
     */
    public Integer key() {
        return this.key;
    }

    /**
     * Set the key (ID) of the subnet.
     *
     * @param key the key value to set
     * @return the PrivateAccessSubnet object itself.
     */
    public PrivateAccessSubnet withKey(Integer key) {
        this.key = key;
        return this;
    }

}
