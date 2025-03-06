package com.example.Parcial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Parcial.models.SalesBox;

@Repository
public interface SalesBoxesRepository extends JpaRepository<SalesBox, Long> {
    // Puedes agregar métodos personalizados si es necesario
}
