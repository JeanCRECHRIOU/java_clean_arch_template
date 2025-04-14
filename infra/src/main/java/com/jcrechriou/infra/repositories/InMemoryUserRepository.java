package com.jcrechriou.infra.repositories;

import com.jcrechriou.domain.entities.User;
import com.jcrechriou.domain.interfaces.UserRepository;

import java.util.Arrays;
import java.util.List;

public class InMemoryUserRepository implements UserRepository {
    @Override
    public List<User> findAll() {
        return Arrays.asList(
            new User(1L, "Alice"),
            new User(2L, "Bob")
        );
    }
}
