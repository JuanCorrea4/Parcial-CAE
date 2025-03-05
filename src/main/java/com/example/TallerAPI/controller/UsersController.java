package com.example.TallerAPI.controller;

import com.example.TallerAPI.models.User;
import com.example.TallerAPI.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/user")
    public User newUser(@RequestBody User customer) {
        return usersService.newUser(customer);
    }

    // Endpoint with parameters in to URL
    @DeleteMapping("/deleteUser/{id}")
    public void deleteUserById(@PathVariable Long id) {
        usersService.deleteUserById(id);
    }
}
