// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PolybaseSettingsRejectType. */
public final class PolybaseSettingsRejectType extends ExpandableStringEnum<PolybaseSettingsRejectType> {
    /** Static value value for PolybaseSettingsRejectType. */
    public static final PolybaseSettingsRejectType VALUE = fromString("value");

    /** Static value percentage for PolybaseSettingsRejectType. */
    public static final PolybaseSettingsRejectType PERCENTAGE = fromString("percentage");

    /**
     * Creates or finds a PolybaseSettingsRejectType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PolybaseSettingsRejectType.
     */
    @JsonCreator
    public static PolybaseSettingsRejectType fromString(String name) {
        return fromString(name, PolybaseSettingsRejectType.class);
    }

    /** @return known PolybaseSettingsRejectType values. */
    public static Collection<PolybaseSettingsRejectType> values() {
        return values(PolybaseSettingsRejectType.class);
    }
}
