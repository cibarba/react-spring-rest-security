package com.generation.reactspringrestsecurity.db.dao;

import com.generation.reactspringrestsecurity.db.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findByName(String name);

    @Override
    void delete(Role role);
}
