package com.jcrechriou.application.services;

import com.jcrechriou.domain.entities.User;
import com.jcrechriou.domain.interfaces.UserRepository;

import java.util.List;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> execute() {
        return userRepository.findAll();
    }
}
