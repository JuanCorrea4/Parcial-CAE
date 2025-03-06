package com.example.Parcial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Parcial.models.SalesBox;
import com.example.Parcial.service.SalesBoxesService;

import java.util.List;

@RequestMapping("/api/salesBoxes")
@RestController
public class SalesBoxesController {

    // We inject the service
    @Autowired
    private SalesBoxesService salesBoxesService;

    // Get all sales boxes
    @GetMapping
    public List<SalesBox> getSalesBoxs() {
        return salesBoxesService.getSalesBoxs();
    }

    // Create a new sales box
    @PostMapping("/newSalesBox")
    public SalesBox newSalesBox(@RequestBody SalesBox salesBox) {
        return salesBoxesService.newSalesBox(salesBox);
    }

    // Endpoint with parameters in to URL
    @DeleteMapping("/deleteSalesBox/{id}")
    public void deleteSalesBoxById(@PathVariable Long id) {
        salesBoxesService.deleteSalesBox(id);
    }
}
