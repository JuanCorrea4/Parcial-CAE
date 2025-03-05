package com.example.TallerAPI.repository;

import com.example.TallerAPI.models.MeansOfPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeansOfPaymentRepository extends JpaRepository<MeansOfPayment, Long> {
    // Puedes agregar métodos personalizados si es necesario
}
