package com.jcrechriou.apiweb;

import com.jcrechriou.domain.User;
import com.jcrechriou.infra.InMemoryUserRepository;
import com.jcrechriou.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController() {
        this.userService = new UserService(new InMemoryUserRepository());
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.execute();
    }
}
