package com.example.Parcial.models;

import jakarta.persistence.*;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private double price;

    @ManyToMany(mappedBy = "products")
    @JsonIgnore
    private List<SalesBox> salesBoxes;

    // Getters y Setters
}