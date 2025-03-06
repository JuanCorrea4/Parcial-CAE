package com.example.Parcial.service;

import java.util.List;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Parcial.models.SalesBox;
import com.example.Parcial.repository.SalesBoxesRepository;

@Service
public class SalesBoxesService {

    @Autowired
    private SalesBoxesRepository salesBoxesRepository;

    // Get all sales boxes
    public List<SalesBox> getSalesBoxs() {
        try {
            return salesBoxesRepository.findAll();
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error getting sales boxes: " + e.getMessage());
            throw new RuntimeException("Error getting sales boxes", e);
        }
    }

    // Create a new sales box
    @Transactional
    public SalesBox newSalesBox(SalesBox product) {
        try {
            return salesBoxesRepository.save(product);
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error saving sales box: " + e.getMessage());
            throw new RuntimeException("Error saving sales box", e);
        }
    }

    // Delete a sales box
    @Transactional
    public void deleteSalesBox(Long id) {
        try {
            salesBoxesRepository.deleteById(id);
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error deleting sales box: " + e.getMessage());
            throw new RuntimeException("Error deleting sales box", e);
        }
    }
}
