
package com.company.sample.api;

import com.company.sample.api.definitions.Contact;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "user_id",
    "contact"
})
public class UserDetail {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("user_id")
    private Integer userId;
    /**
     * 
     */
    @JsonProperty("contact")
    private Contact contact;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The userId
     */
    @JsonProperty("user_id")
    public Integer getUserId() {
        return userId;
    }

    /**
     * 
     * (Required)
     * 
     * @param userId
     *     The user_id
     */
    @JsonProperty("user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public UserDetail withUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 
     * @return
     *     The contact
     */
    @JsonProperty("contact")
    public Contact getContact() {
        return contact;
    }

    /**
     * 
     * @param contact
     *     The contact
     */
    @JsonProperty("contact")
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public UserDetail withContact(Contact contact) {
        this.contact = contact;
        return this;
    }

}
