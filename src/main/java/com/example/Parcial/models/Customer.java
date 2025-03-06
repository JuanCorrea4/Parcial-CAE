package com.example.Parcial.models;

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

    public List<SalesBox> getSalesBoxes() {
        return salesBoxes;
    }

    public void setSalesBoxes(List<SalesBox> salesBoxes) {
        this.salesBoxes = salesBoxes;
    }
}
