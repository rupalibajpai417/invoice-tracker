package com.invoicetracker.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")

public class HealthController {
    @GetMapping("/health")
    public String healthcheck() {
        return "Invoice Tracker API is healthy!";
    }
    
}
