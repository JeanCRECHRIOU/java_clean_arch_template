package com.jcrechriou.apiweb;

import com.jcrechriou.domain.User;
import com.jcrechriou.infra.InMemoryUserRepository;
import com.jcrechriou.services.GetAllUsersUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final GetAllUsersUseCase getAllUsersUseCase;

    public UserController() {
        this.getAllUsersUseCase = new GetAllUsersUseCase(new InMemoryUserRepository());
    }

    @GetMapping
    public List<User> getUsers() {
        return getAllUsersUseCase.execute();
    }

    public void test(){
        String toto = "";
    }
}
