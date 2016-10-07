
package com.company.sample.api.definitions;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "first_name",
    "last_name",
    "email"
})
public class Contact {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    private String firstName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("last_name")
    private String lastName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("email")
    private String email;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The firstName
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * (Required)
     * 
     * @param firstName
     *     The first_name
     */
    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Contact withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The lastName
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * (Required)
     * 
     * @param lastName
     *     The last_name
     */
    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Contact withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The email
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * 
     * (Required)
     * 
     * @param email
     *     The email
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public Contact withEmail(String email) {
        this.email = email;
        return this;
    }

}
