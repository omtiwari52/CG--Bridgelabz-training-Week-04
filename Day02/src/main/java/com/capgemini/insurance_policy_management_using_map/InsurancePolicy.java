package com.capgemini.insurance_policy_management_using_map;

import java.time.LocalDate;

public class InsurancePolicy {
    private int policyNumber;
    private String policyholderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;

    public InsurancePolicy(int policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Policy No: " + policyNumber + ", Holder: " + policyholderName + ", Expiry: " + expiryDate +
                ", Coverage: " + coverageType + ", Premium: $" + premiumAmount;
    }
}
