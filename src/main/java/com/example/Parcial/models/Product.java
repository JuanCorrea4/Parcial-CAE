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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<SalesBox> getSalesBoxes() {
        return salesBoxes;
    }

    public void setSalesBoxes(List<SalesBox> salesBoxes) {
        this.salesBoxes = salesBoxes;
    }
}
