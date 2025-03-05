package com.example.TallerAPI.repository;

import com.example.TallerAPI.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends JpaRepository<Customer, Long> {
    // Puedes agregar métodos personalizados si es necesario
}
