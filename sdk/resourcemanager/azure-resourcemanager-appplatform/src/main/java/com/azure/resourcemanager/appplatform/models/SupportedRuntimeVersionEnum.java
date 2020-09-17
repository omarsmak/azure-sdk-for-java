// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SupportedRuntimeVersionEnum. */
public final class SupportedRuntimeVersionEnum extends ExpandableStringEnum<SupportedRuntimeVersionEnum> {
    /** Static value Java_8 for SupportedRuntimeVersionEnum. */
    public static final SupportedRuntimeVersionEnum JAVA_8 = fromString("Java_8");

    /** Static value Java_11 for SupportedRuntimeVersionEnum. */
    public static final SupportedRuntimeVersionEnum JAVA_11 = fromString("Java_11");

    /** Static value NetCore_31 for SupportedRuntimeVersionEnum. */
    public static final SupportedRuntimeVersionEnum NET_CORE_31 = fromString("NetCore_31");

    /**
     * Creates or finds a SupportedRuntimeVersionEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SupportedRuntimeVersionEnum.
     */
    @JsonCreator
    public static SupportedRuntimeVersionEnum fromString(String name) {
        return fromString(name, SupportedRuntimeVersionEnum.class);
    }

    /** @return known SupportedRuntimeVersionEnum values. */
    public static Collection<SupportedRuntimeVersionEnum> values() {
        return values(SupportedRuntimeVersionEnum.class);
    }
}