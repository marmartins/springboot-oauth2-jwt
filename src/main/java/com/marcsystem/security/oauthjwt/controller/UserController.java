package com.marcsystem.security.oauthjwt.controller;

import com.marcsystem.security.oauthjwt.domain.User;
import com.marcsystem.security.oauthjwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController extends MappingController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public List<User> getUsers() {
        return userService.findAllUsers();
    }

}
