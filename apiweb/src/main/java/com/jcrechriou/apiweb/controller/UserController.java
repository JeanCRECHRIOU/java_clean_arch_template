package com.jcrechriou.apiweb.controller;

import com.jcrechriou.domain.entities.User;
import com.jcrechriou.application.services.UserService;
import com.jcrechriou.infra.entities.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    // ✅ Spring injectera automatiquement le UserService ici
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserEntity> getUsers() {
        return userService.getAllUsers();
    }
}
