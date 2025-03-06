package com.example.Parcial.models;

import jakarta.persistence.*;

@Entity
@Table(name = "means_of_payment")
public class MeansOfPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String type;

    // Getters y Setters
}