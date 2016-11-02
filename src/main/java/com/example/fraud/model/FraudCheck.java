package com.example.fraud.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class FraudCheck {
    private String clientId;
    private BigDecimal loanAmount;
}
