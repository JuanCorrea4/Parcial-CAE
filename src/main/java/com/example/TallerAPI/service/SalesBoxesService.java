package com.example.TallerAPI.service;

import java.util.List;

import com.example.TallerAPI.models.SalesBox;
import com.example.TallerAPI.repository.SalesBoxesRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
