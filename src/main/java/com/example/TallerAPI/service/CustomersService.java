package com.example.TallerAPI.service;

import java.util.List;

import com.example.TallerAPI.models.Customer;
import com.example.TallerAPI.repository.CustomersRepository;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomersService {

    @Autowired
    private CustomersRepository customersRepository;

    // Get all students
    public List<Customer> getAllCustomers() {
        try {
            return customersRepository.findAll();
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error getting courses: " + e.getMessage());
            throw new RuntimeException("Error getting courses", e);
        }
    }

    // Create a new student
    @Transactional
    public Customer newCustomer(Customer customer) {
        try {
            return customersRepository.save(customer);
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error saving course: " + e.getMessage());
            throw new RuntimeException("Error saving course", e);
        }
    }

    // Delete a student
    @Transactional
    public void deleteCustomerById(Long id) {
        try {
            customersRepository.deleteById(id);
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error deleting course: " + e.getMessage());
            throw new RuntimeException("Error deleting course", e);
        }
    }
}
