package com.example.fraud.model;

import lombok.Value;

@Value
public class FraudCheckResult {
    private FraudCheckStatus fraudCheckStatus;

    private String rejectionReason;
}
