package com.example.Parcial.service;

import java.util.List;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Parcial.models.Product;
import com.example.Parcial.repository.ProductsRepository;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    // Get all products
    public List<Product> geProducts() {
        try {
            return productsRepository.findAll();
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error getting products: " + e.getMessage());
            throw new RuntimeException("Error getting products", e);
        }
    }

    // Create a new product
    @Transactional
    public Product newProduct(Product product) {
        try {
            return productsRepository.save(product);
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error saving product: " + e.getMessage());
            throw new RuntimeException("Error saving product", e);
        }
    }

    // Delete a product
    @Transactional
    public void deleteProductById(Long id) {
        try {
            productsRepository.deleteById(id);
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error deleting product: " + e.getMessage());
            throw new RuntimeException("Error deleting product", e);
        }
    }
}
