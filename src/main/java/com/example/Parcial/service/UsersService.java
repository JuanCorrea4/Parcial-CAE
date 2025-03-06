package com.example.Parcial.service;

import java.util.List;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Parcial.models.User;
import com.example.Parcial.repository.UsersRepository;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    // Get all users
    public List<User> getUsers() {
        try {
            return usersRepository.findAll();
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error getting users: " + e.getMessage());
            throw new RuntimeException("Error getting users", e);
        }
    }

    // Create a new user
    @Transactional
    public User newUser(User user) {
        try {
            System.out.println("Guardando usuario: " + user);
            return usersRepository.save(user);
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error saving user: " + e.getMessage());
            throw new RuntimeException("Error saving user", e);
        }
    }

    // Delete a user
    @Transactional
    public void deleteUserById(Long id) {
        try {
            usersRepository.deleteById(id);
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error deleting user: " + e.getMessage());
            throw new RuntimeException("Error deleting user", e);
        }
    }
}
