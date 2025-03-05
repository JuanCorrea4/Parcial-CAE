package com.example.TallerAPI.models;

import jakarta.persistence.*;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "sales_boxes")
public class SalesBox {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToMany
    @JoinTable(name = "salesbox_product", joinColumns = @JoinColumn(name = "salesbox_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
    @JsonIgnore
    private List<Product> products;

    @ManyToOne
    @JoinColumn(name = "means_of_payment_id", nullable = false)
    private MeansOfPayment meansOfPayment;

    // Getters y Setters
}
