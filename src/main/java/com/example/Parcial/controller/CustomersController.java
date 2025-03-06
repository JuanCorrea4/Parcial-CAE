package com.example.Parcial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Parcial.models.Customer;
import com.example.Parcial.service.CustomersService;

import java.util.List;

@RequestMapping("/api/customers")
@RestController
public class CustomersController {

    // We inject the service
    @Autowired
    private CustomersService customersService;

    // Get all customer
    @GetMapping
    public List<Customer> getCustomers() {
        return customersService.getAllCustomers();
    }

    // Create a new customer
    @PostMapping("/newCustomer")
    public Customer newCustomer(@RequestBody Customer customer) {
        return customersService.newCustomer(customer);
    }

    // Endpoint with parameters in to URL
    @DeleteMapping("/deleteCustomer/{id}")
    public void deleteCustomerById(@PathVariable Long id) {
        customersService.deleteCustomerById(id);
    }
}
