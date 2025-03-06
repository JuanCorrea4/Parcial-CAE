package com.example.Parcial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Parcial.models.MeansOfPayment;
import com.example.Parcial.service.MeansOfPaymentService;

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
    public MeansOfPayment newMeansOfPayment(@RequestBody MeansOfPayment meansOfPayment) {
        return meansOfPaymentService.newMeansOfPayment(meansOfPayment);
    }

    // Endpoint with parameters in to URL
    @DeleteMapping("/deleteMeansOfPayment/{id}")
    public void deleteMeansOfPaymentById(@PathVariable Long id) {
        meansOfPaymentService.deleteMeansOfPaymentById(id);
    }
}
