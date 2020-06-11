/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for OrchestrationServiceNames.
 */
public final class OrchestrationServiceNames extends ExpandableStringEnum<OrchestrationServiceNames> {
    /** Static value AutomaticRepairs for OrchestrationServiceNames. */
    public static final OrchestrationServiceNames AUTOMATIC_REPAIRS = fromString("AutomaticRepairs");

    /**
     * Creates or finds a OrchestrationServiceNames from its string representation.
     * @param name a name to look for
     * @return the corresponding OrchestrationServiceNames
     */
    @JsonCreator
    public static OrchestrationServiceNames fromString(String name) {
        return fromString(name, OrchestrationServiceNames.class);
    }

    /**
     * @return known OrchestrationServiceNames values
     */
    public static Collection<OrchestrationServiceNames> values() {
        return values(OrchestrationServiceNames.class);
    }
}
