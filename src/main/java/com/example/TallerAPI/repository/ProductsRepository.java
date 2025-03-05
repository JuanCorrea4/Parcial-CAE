package com.example.TallerAPI.repository;

import com.example.TallerAPI.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Long> {
    // Puedes agregar métodos personalizados si es necesario
}
