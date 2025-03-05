package com.example.TallerAPI.controller;

import com.example.TallerAPI.models.SalesBox;
import com.example.TallerAPI.service.SalesBoxesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/products")
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
    public SalesBox newSalesBox(@RequestBody SalesBox customer) {
        return salesBoxesService.newSalesBox(customer);
    }

    // Endpoint with parameters in to URL
    @DeleteMapping("/deleteSalesBox/{id}")
    public void deleteSalesBoxById(@PathVariable Long id) {
        salesBoxesService.deleteSalesBox(id);
    }
}
