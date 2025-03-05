package com.example.TallerAPI.models;

import jakarta.persistence.*;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<SalesBox> salesBoxes;

    // Getters y Setters
}
