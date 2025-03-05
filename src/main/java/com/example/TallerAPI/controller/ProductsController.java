package com.example.TallerAPI.controller;

import com.example.TallerAPI.models.Product;
import com.example.TallerAPI.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/products")
@RestController
public class ProductsController {

    // We inject the service
    @Autowired
    private ProductsService productsService;

    // Get all products
    @GetMapping
    public List<Product> geProducts() {
        return productsService.geProducts();
    }

    // Create a new product
    @PostMapping("/newProduct")
    public Product newProduct(@RequestBody Product customer) {
        return productsService.newProduct(customer);
    }

    // Endpoint with parameters in to URL
    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProductById(@PathVariable Long id) {
        productsService.deleteProductById(id);
    }
}
