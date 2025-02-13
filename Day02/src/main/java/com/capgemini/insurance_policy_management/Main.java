package com.capgemini.insurance_policy_management;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        InsurancePolicyManagement<InsurancePolicy> management = new InsurancePolicyManagement<>();

        management.addPolicy(new InsurancePolicy(1, "Harshveer", LocalDate.now().plusDays(15), "Health", 500.0));
        management.addPolicy(new InsurancePolicy(2, "Om Tiwari", LocalDate.now().plusDays(45), "Auto", 750.0));
        management.addPolicy(new InsurancePolicy(3, "Aarav Singh", LocalDate.now().plusDays(10), "Home", 1000.0));
        management.addPolicy(new InsurancePolicy(1, "Harshveer", LocalDate.now().plusDays(15), "Health", 500.0)); // Duplicate

        management.displayAllPolicies();
        management.displayExpiringSoon();
        management.displayByCoverageType("Health");
        management.findDuplicatePolicies();
    }
}
