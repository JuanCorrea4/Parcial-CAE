package com.example.TallerAPI.repository;

import com.example.TallerAPI.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<User, Long> {
    // Puedes agregar métodos personalizados si es necesario
}
