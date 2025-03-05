package com.example.TallerAPI.controller;

import com.example.TallerAPI.models.MeansOfPayment;
import com.example.TallerAPI.service.MeansOfPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/meansOfPayment")
@RestController
public class MeansOfPaymentController {

    // We inject the service
    @Autowired
    private MeansOfPaymentService meansOfPaymentService;

    // Get all means of payment
    @GetMapping
    public List<MeansOfPayment> getMeansOfPayments() {
        return meansOfPaymentService.getAllMeansOfPayments();
    }

    // Create a new means of payment
    @PostMapping("/newMeansOfPayment")
    public MeansOfPayment newMeansOfPayment(@RequestBody MeansOfPayment customer) {
        return meansOfPaymentService.newMeansOfPayment(customer);
    }

    // Endpoint with parameters in to URL
    @DeleteMapping("/deleteMeansOfPayment/{id}")
    public void deleteMeansOfPaymentById(@PathVariable Long id) {
        meansOfPaymentService.deleteMeansOfPaymentById(id);
    }
}
