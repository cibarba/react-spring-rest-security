package com.generation.reactspringrestsecurity.db.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "user_account")
public class User {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;

    private String firstName;

    private String lastName;

    @Column(length = 60)
    private String password;

    private boolean enabled;

    private String secret;

    // Relations

    // EAGER Fetch all data from a collection vs LAZY fetch a specific data from a collection
    // joinColumn point to the column of this Model
    // inverseJoinColumn point to the column of the Model to be related
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;

    public User() {
        super();
    }

    public User(String email, String firstName, String lastName, String password, boolean enabled, String secret, Collection<Role> roles) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.enabled = enabled;
        this.secret = secret;
        this.roles = roles;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((email == null) ? 0 : email.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User user = (User) obj;
        if (!email.equals(user.email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("User [id=").append(id)
                .append(", firstName").append(firstName)
                .append(", lastName=").append(lastName)
                .append(", email=").append(email)
                .append(", password=").append(password)
                .append(", enabled=").append(enabled)
                .append(", secret=").append(secret).append("]");

        return builder.toString();
    }
}
