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

    // Get all means of payments
    public List<MeansOfPayment> getAllMeansOfPayments() {
        try {
            return meansOfPaymentRepository.findAll();
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error getting means of payments: " + e.getMessage());
            throw new RuntimeException("Error getting means of payments", e);
        }
    }

    // Create a new mean of payment
    @Transactional
    public MeansOfPayment newMeansOfPayment(MeansOfPayment meansOfPayment) {
        try {
            return meansOfPaymentRepository.save(meansOfPayment);
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error saving mean of payment: " + e.getMessage());
            throw new RuntimeException("Error saving mean of payment", e);
        }
    }

    // Delete a mean of payment
    @Transactional
    public void deleteMeansOfPaymentById(Long id) {
        try {
            meansOfPaymentRepository.deleteById(id);
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error deleting mean of payment: " + e.getMessage());
            throw new RuntimeException("Error deleting mean of payment", e);
        }
    }
}
