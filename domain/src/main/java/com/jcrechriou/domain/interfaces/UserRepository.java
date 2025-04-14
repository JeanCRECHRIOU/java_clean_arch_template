package com.jcrechriou.domain.interfaces;

import com.jcrechriou.domain.entities.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
}
