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
 * Defines values for VirtualMachineScaleSetScaleInRules.
 */
public final class VirtualMachineScaleSetScaleInRules extends ExpandableStringEnum<VirtualMachineScaleSetScaleInRules> {
    /** Static value Default for VirtualMachineScaleSetScaleInRules. */
    public static final VirtualMachineScaleSetScaleInRules DEFAULT = fromString("Default");

    /** Static value OldestVM for VirtualMachineScaleSetScaleInRules. */
    public static final VirtualMachineScaleSetScaleInRules OLDEST_VM = fromString("OldestVM");

    /** Static value NewestVM for VirtualMachineScaleSetScaleInRules. */
    public static final VirtualMachineScaleSetScaleInRules NEWEST_VM = fromString("NewestVM");

    /**
     * Creates or finds a VirtualMachineScaleSetScaleInRules from its string representation.
     * @param name a name to look for
     * @return the corresponding VirtualMachineScaleSetScaleInRules
     */
    @JsonCreator
    public static VirtualMachineScaleSetScaleInRules fromString(String name) {
        return fromString(name, VirtualMachineScaleSetScaleInRules.class);
    }

    /**
     * @return known VirtualMachineScaleSetScaleInRules values
     */
    public static Collection<VirtualMachineScaleSetScaleInRules> values() {
        return values(VirtualMachineScaleSetScaleInRules.class);
    }
}
