package com.example.Parcial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Parcial.models.Product;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Long> {
    // Puedes agregar métodos personalizados si es necesario
}
