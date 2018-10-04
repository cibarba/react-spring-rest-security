package com.generation.reactspringrestsecurity.db.dao;

import com.generation.reactspringrestsecurity.db.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String email);

    @Override
    void delete(User user);
}
