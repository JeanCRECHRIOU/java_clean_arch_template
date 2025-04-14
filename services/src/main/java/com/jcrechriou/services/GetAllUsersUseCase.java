package com.jcrechriou.services;

import com.jcrechriou.domain.User;
import com.jcrechriou.domain.UserRepository;

import java.util.List;

public class GetAllUsersUseCase {
    private final UserRepository userRepository;

    public GetAllUsersUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> execute() {
        return userRepository.findAll();
    }
}
