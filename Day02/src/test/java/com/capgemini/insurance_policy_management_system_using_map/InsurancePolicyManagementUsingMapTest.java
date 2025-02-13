package com.capgemini.insurance_policy_management_system_using_map;

import static org.junit.jupiter.api.Assertions.*;

import com.capgemini.insurance_policy_management_using_map.InsurancePolicy;
import com.capgemini.insurance_policy_management_using_map.InsurancePolicyManagement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;

public class InsurancePolicyManagementUsingMapTest {
    private InsurancePolicyManagement management;

    @BeforeEach
    void setUp() {
        management = new InsurancePolicyManagement();
        management.addPolicy(new InsurancePolicy(1, "Alice", LocalDate.now().plusDays(15), "Health", 500.0));
        management.addPolicy(new InsurancePolicy(2, "Bob", LocalDate.now().plusDays(45), "Auto", 750.0));
        management.addPolicy(new InsurancePolicy(3, "Charlie", LocalDate.now().plusDays(10), "Health", 600.0));
        management.addPolicy(new InsurancePolicy(4, "David", LocalDate.now().plusDays(5), "Home", 900.0));
        management.addPolicy(new InsurancePolicy(5, "Alice", LocalDate.now().minusDays(5), "Travel", 300.0)); // Expired
    }

    @Test
    void testAddPolicy() {
        InsurancePolicy newPolicy = new InsurancePolicy(6, "Emma", LocalDate.now().plusDays(20), "Life", 650.0);
        management.addPolicy(newPolicy);

        assertEquals(newPolicy, management.getPolicyByNumber(6));
    }
}

