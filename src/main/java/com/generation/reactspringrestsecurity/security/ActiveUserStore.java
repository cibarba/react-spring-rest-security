package com.generation.reactspringrestsecurity.security;

import java.util.ArrayList;
import java.util.List;

/**
 * Storage users who was active on the application
 */
public class ActiveUserStore {

    public List<String> users;

    public ActiveUserStore() {
        users = new ArrayList<String>();
    }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }
}
