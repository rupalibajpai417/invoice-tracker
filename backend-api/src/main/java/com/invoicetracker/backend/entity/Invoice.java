package com.invoicetracker.backend.entity;
import jakarta.persistence.ManyToOne;

public class Invoice {
    
    @ManyToOne
    private Client client;

}
