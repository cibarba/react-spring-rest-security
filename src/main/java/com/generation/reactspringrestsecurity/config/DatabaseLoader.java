package com.generation.reactspringrestsecurity.config;

import com.generation.reactspringrestsecurity.db.dao.RoleRepository;
import com.generation.reactspringrestsecurity.db.dao.UserRepository;
import com.generation.reactspringrestsecurity.db.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Autowired
    public DatabaseLoader(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(String... args) throws Exception {
    }


}
