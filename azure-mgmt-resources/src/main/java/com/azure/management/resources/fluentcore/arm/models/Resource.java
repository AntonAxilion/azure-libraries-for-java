/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.azure.management.resources.fluentcore.arm.models;

import com.azure.management.resources.fluentcore.arm.Region;
import com.azure.management.resources.fluentcore.model.Indexable;

import java.util.Map;

/**
 * Base interfaces for fluent resources.
 */
public interface Resource extends
        Indexable,
        HasId,
        HasName {

    /**
     * @return the type of the resource
     */
    String getType();

    /**
     * @return the name of the region the resource is in
     */
    String getRegionName();

    /**
     * @return the region the resource is in
     */
    Region getRegion();

    /**
     * @return the tags for the resource
     */
    Map<String, String> getTags();

    /**
     * A resource definition allowing a location be selected for the resource.
     *
     * @param <T> the type of the next stage resource definition
     */
    interface DefinitionWithRegion<T> {
        /**
         * Specifies the region for the resource by name.
         *
         * @param regionName The name of the region for the resource
         * @return the next stage of the definition
         */
        T withRegion(String regionName);

        /**
         * Specifies the region for the resource.
         *
         * @param region The location for the resource
         * @return the next stage of the definition
         */
        T withRegion(Region region);
    }

    /**
     * A resource definition allowing tags to be modified for the resource.
     *
     * @param <T> the type of the next stage resource definition
     */
    interface DefinitionWithTags<T> {
        /**
         * Specifies tags for the resource as a {@link Map}.
         *
         * @param tags a {@link Map} of tags
         * @return the next stage of the definition
         */
        T withTags(Map<String, String> tags);

        /**
         * Adds a tag to the resource.
         *
         * @param key   the key for the tag
         * @param value the value for the tag
         * @return the next stage of the definition
         */
        T withTag(String key, String value);
    }

    /**
     * An update allowing tags to be modified for the resource.
     *
     * @param <T> the type of the next stage resource update
     */
    interface UpdateWithTags<T> {
        /**
         * Specifies tags for the resource as a {@link Map}.
         *
         * @param tags a {@link Map} of tags
         * @return the next stage of the resource update
         */
        T withTags(Map<String, String> tags);

        /**
         * Adds a tag to the resource.
         *
         * @param key   the key for the tag
         * @param value the value for the tag
         * @return the next stage of the resource update
         */
        T withTag(String key, String value);

        /**
         * Removes a tag from the resource.
         *
         * @param key the key of the tag to remove
         * @return the next stage of the resource update
         */
        T withoutTag(String key);
    }
}