package com.example.Parcial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Parcial.models.User;
import com.example.Parcial.service.UsersService;

import java.util.List;

@RequestMapping("/api/user")
@RestController
public class UsersController {

    // We inject the service
    @Autowired
    private UsersService usersService;

    // Get all users
    @GetMapping
    public List<User> getUsers() {
        return usersService.getUsers();
    }

    // Create a new user
    @PostMapping("/newUser")
    public User newUser(@RequestBody User user) {
        return usersService.newUser(user);
    }

    // Endpoint with parameters in to URL
    @DeleteMapping("/deleteUser/{id}")
    public void deleteUserById(@PathVariable Long id) {
        usersService.deleteUserById(id);
    }
}
