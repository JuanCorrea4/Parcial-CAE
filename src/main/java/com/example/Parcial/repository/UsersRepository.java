package com.example.Parcial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Parcial.models.User;

@Repository
public interface UsersRepository extends JpaRepository<User, Long> {
    // Puedes agregar métodos personalizados si es necesario
}
