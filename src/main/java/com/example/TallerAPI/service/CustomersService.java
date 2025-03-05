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

    // Get all customers
    public List<Customer> getAllCustomers() {
        try {
            return customersRepository.findAll();
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error getting customers: " + e.getMessage());
            throw new RuntimeException("Error getting customers", e);
        }
    }

    // Create a new customer
    @Transactional
    public Customer newCustomer(Customer customer) {
        try {
            return customersRepository.save(customer);
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error saving customer: " + e.getMessage());
            throw new RuntimeException("Error saving customer", e);
        }
    }

    // Delete a customer
    @Transactional
    public void deleteCustomerById(Long id) {
        try {
            customersRepository.deleteById(id);
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error deleting customer: " + e.getMessage());
            throw new RuntimeException("Error deleting customer", e);
        }
    }
}
