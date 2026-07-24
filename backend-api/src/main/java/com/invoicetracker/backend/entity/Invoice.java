package com.invoicetracker.backend.entity;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;

public class Invoice {
    
    @ManyToOne
    private Client client;

    private BigDecimal totalAmount;

}
