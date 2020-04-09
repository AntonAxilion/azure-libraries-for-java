// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cdn;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for DeliveryRuleConditionName.
 */
public final class DeliveryRuleConditionName extends ExpandableStringEnum<DeliveryRuleConditionName> {
    /**
     * Static value UrlPath for DeliveryRuleConditionName.
     */
    public static final DeliveryRuleConditionName URL_PATH = fromString("UrlPath");

    /**
     * Static value UrlFileExtension for DeliveryRuleConditionName.
     */
    public static final DeliveryRuleConditionName URL_FILE_EXTENSION = fromString("UrlFileExtension");

    /**
     * Creates or finds a DeliveryRuleConditionName from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DeliveryRuleConditionName.
     */
    @JsonCreator
    public static DeliveryRuleConditionName fromString(String name) {
        return fromString(name, DeliveryRuleConditionName.class);
    }

    /**
     * @return known DeliveryRuleConditionName values.
     */
    public static Collection<DeliveryRuleConditionName> values() {
        return values(DeliveryRuleConditionName.class);
    }
}