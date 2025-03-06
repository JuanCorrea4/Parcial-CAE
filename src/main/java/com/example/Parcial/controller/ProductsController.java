package com.example.Parcial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Parcial.models.Product;
import com.example.Parcial.service.ProductsService;

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
    public Product newProduct(@RequestBody Product product) {
        return productsService.newProduct(product);
    }

    // Endpoint with parameters in to URL
    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProductById(@PathVariable Long id) {
        productsService.deleteProductById(id);
    }
}
