package com.generation.reactspringrestsecurity.web.dto;

import com.generation.reactspringrestsecurity.validation.PasswordMatches;
import com.generation.reactspringrestsecurity.validation.ValidEmail;
import com.generation.reactspringrestsecurity.validation.ValidPassword;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * This class will send all of the registration information
 * to our Spring backend. The Data Transfer Object (DTO)
 * should have all the information we'll require later on
 * we create and populate our User object.
 */
@PasswordMatches // Custom annotation to verify passwords
public class UserDto {

    @NotNull // Standard java annotation to validate
    @Size(min = 1, message = "{Size.userDto.firstName}")
    private String firstName;

    @NotNull
    @Size(min = 1, message = "{Size.userDto.lastName}")
    private String lastName;

    @ValidPassword // Custom annotation to validate password
    private String password;

    @NotNull
    @Size(min = 1)
    private String matchingPassword;

    @ValidEmail // Custom annotation to validate email
    @NotNull
    @Size(min = 1, message = "{Size.userDto.email}")
    private String email;

    // Getters and setters

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    private Integer role;

    public Integer getRole() {
        return role;
    }

    public void setRole(final Integer role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getMatchingPassword() {
        return matchingPassword;
    }

    public void setMatchingPassword(final String matchingPassword) {
        this.matchingPassword = matchingPassword;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("UserDto [firstName=").append(firstName)
                .append(", lastName=").append(lastName)
                .append(", password=").append(password)
                .append(", matchingPassword=").append(matchingPassword)
                .append(", email=").append(email)
                .append(", role=").append(role).append("]");
        return builder.toString();
    }

}
