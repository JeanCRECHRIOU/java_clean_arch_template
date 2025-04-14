package com.jcrechriou.infra;

import com.jcrechriou.domain.User;
import com.jcrechriou.domain.UserRepository;

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
