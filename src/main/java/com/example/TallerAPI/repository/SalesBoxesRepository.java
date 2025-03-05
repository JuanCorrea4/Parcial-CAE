package com.example.TallerAPI.repository;

import com.example.TallerAPI.models.SalesBox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesBoxesRepository extends JpaRepository<SalesBox, Long> {
    // Puedes agregar métodos personalizados si es necesario
}
