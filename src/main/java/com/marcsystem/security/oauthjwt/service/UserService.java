package com.marcsystem.security.oauthjwt.service;

import com.marcsystem.security.oauthjwt.domain.User;

import java.util.List;

public interface UserService {

    User findByUsername(String username);

    List<User> findAllUsers();

}
