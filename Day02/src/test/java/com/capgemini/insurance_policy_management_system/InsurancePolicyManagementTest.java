package com.capgemini.insurance_policy_management_system;

import static org.junit.jupiter.api.Assertions.*;

import com.capgemini.insurance_policy_management.InsurancePolicy;
import com.capgemini.insurance_policy_management.InsurancePolicyManagement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.Set;

public class InsurancePolicyManagementTest {
    private InsurancePolicyManagement<InsurancePolicy> policyManagement;

    @BeforeEach
    void setUp() {
        policyManagement = new InsurancePolicyManagement<>();
        policyManagement.addPolicy(new InsurancePolicy(1, "Harshveer", LocalDate.now().plusDays(15), "Health", 500.0));
        policyManagement.addPolicy(new InsurancePolicy(2, "Om Tiwari", LocalDate.now().plusDays(45), "Auto", 750.0));
        policyManagement.addPolicy(new InsurancePolicy(3, "Riya", LocalDate.now().plusDays(10), "Health", 600.0));
        policyManagement.addPolicy(new InsurancePolicy(4, "Sameer", LocalDate.now().plusDays(5), "Home", 900.0));
    }

    @Test
    void testAddPolicy() {
        InsurancePolicy newPolicy = new InsurancePolicy(5, "Rahul", LocalDate.now().plusDays(30), "Travel", 650.0);
        policyManagement.addPolicy(newPolicy);

        assertTrue(policyManagement.policyHashSet.contains(newPolicy));
        assertTrue(policyManagement.policyLinkedHashSet.contains(newPolicy));
    }

    @Test
    void testDisplayAllPolicies() {
        Set<InsurancePolicy> policies = policyManagement.policyHashSet;
        assertEquals(4, policies.size()); // Should match the number of added policies
    }

}