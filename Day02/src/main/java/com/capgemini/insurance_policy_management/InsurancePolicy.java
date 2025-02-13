package com.capgemini.insurance_policy_management;

import java.time.LocalDate;

public class InsurancePolicy implements Comparable<InsurancePolicy> {
    private Integer policyNumber;
    private String policyholderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;

    public InsurancePolicy(Integer policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public Integer getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    @Override
    public int compareTo(InsurancePolicy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        InsurancePolicy policy = (InsurancePolicy) obj;
        return policyNumber.equals(policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return policyNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Policy{" + "Number='" + policyNumber + '\'' + ", Holder='" + policyholderName + '\'' + ", Expiry=" + expiryDate + ", Coverage='" + coverageType + '\'' + ", Premium=" + premiumAmount + '}';
    }
}
