package com.example.TallerAPI.service;

import java.util.List;

import com.example.TallerAPI.models.MeansOfPayment;
import com.example.TallerAPI.repository.MeansOfPaymentRepository;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeansOfPaymentService {

    @Autowired
    private MeansOfPaymentRepository meansOfPaymentRepository;

    // Get all students
    public List<MeansOfPayment> getAllMeansOfPayments() {
        try {
            return meansOfPaymentRepository.findAll();
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error getting courses: " + e.getMessage());
            throw new RuntimeException("Error getting courses", e);
        }
    }

    // Create a new student
    @Transactional
    public MeansOfPayment newMeansOfPayment(MeansOfPayment meansOfPayment) {
        try {
            return meansOfPaymentRepository.save(meansOfPayment);
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error saving course: " + e.getMessage());
            throw new RuntimeException("Error saving course", e);
        }
    }

    // Delete a student
    @Transactional
    public void deleteMeansOfPaymentById(Long id) {
        try {
            meansOfPaymentRepository.deleteById(id);
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error deleting course: " + e.getMessage());
            throw new RuntimeException("Error deleting course", e);
        }
    }
}
