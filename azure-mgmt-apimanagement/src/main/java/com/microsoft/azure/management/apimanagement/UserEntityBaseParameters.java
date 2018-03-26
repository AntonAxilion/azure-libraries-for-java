/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement;

import java.util.List;
import com.microsoft.azure.management.apimanagement.implementation.UserIdentityContractInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User Entity Base Parameters set.
 */
public class UserEntityBaseParameters {
    /**
     * Account state. Specifies whether the user is active or not. Blocked
     * users are unable to sign into the developer portal or call any APIs of
     * subscribed products. Default state is Active. Possible values include:
     * 'active', 'blocked', 'pending', 'deleted'.
     */
    @JsonProperty(value = "state")
    private UserState state;

    /**
     * Optional note about a user set by the administrator.
     */
    @JsonProperty(value = "note")
    private String note;

    /**
     * Collection of user identities.
     */
    @JsonProperty(value = "identities", access = JsonProperty.Access.WRITE_ONLY)
    private List<UserIdentityContractInner> identities;

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public UserState state() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     * @return the UserEntityBaseParameters object itself.
     */
    public UserEntityBaseParameters withState(UserState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the note value.
     *
     * @return the note value
     */
    public String note() {
        return this.note;
    }

    /**
     * Set the note value.
     *
     * @param note the note value to set
     * @return the UserEntityBaseParameters object itself.
     */
    public UserEntityBaseParameters withNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * Get the identities value.
     *
     * @return the identities value
     */
    public List<UserIdentityContractInner> identities() {
        return this.identities;
    }

}