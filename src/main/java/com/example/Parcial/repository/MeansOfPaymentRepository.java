package com.example.Parcial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Parcial.models.MeansOfPayment;

@Repository
public interface MeansOfPaymentRepository extends JpaRepository<MeansOfPayment, Long> {
    // Puedes agregar métodos personalizados si es necesario
}
