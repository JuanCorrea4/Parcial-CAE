package com.example.TallerAPI.models;

import jakarta.persistence.*;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<SalesBox> salesBoxes;

    // Getters y Setters
}
