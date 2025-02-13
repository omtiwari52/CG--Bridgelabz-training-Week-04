package com.capgemini.insurance_policy_management;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManagement<T extends InsurancePolicy> {
    public Set<T> policyHashSet = new HashSet<>();
    public Set<T> policyLinkedHashSet = new LinkedHashSet<>();
    private Set<T> policyTreeSet = new TreeSet<>();

    public void addPolicy(T policy) {
        policyHashSet.add(policy);
        policyLinkedHashSet.add(policy);
        policyTreeSet.add(policy);
    }

    public void displayAllPolicies() {
        System.out.println("\nAll Unique Policies (HashSet): ");
        for (T policy : policyHashSet) {
            System.out.println(policy);
        }
    }

    public void displayExpiringSoon() {
        LocalDate today = LocalDate.now();
        System.out.println("\nPolicies Expiring Soon:");
        for (T policy : policyTreeSet) {
            if (policy.getExpiryDate().isBefore(today.plusDays(30))) {
                System.out.println(policy);
            }
        }
    }

    public void displayByCoverageType(String coverageType) {
        System.out.println("\nPolicies with Coverage Type: " + coverageType);
        for (T policy : policyHashSet) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                System.out.println(policy);
            }
        }
    }

    public void findDuplicatePolicies() {
        Map<Integer, Integer> policyCount = new HashMap<>();
        for (T policy : policyHashSet) {
            policyCount.put(policy.getPolicyNumber(), policyCount.getOrDefault(policy.getPolicyNumber(), 0) + 1);
        }
        System.out.println("\nDuplicate Policies:");
        for (Map.Entry<Integer, Integer> entry : policyCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Policy Number: " + entry.getKey() + " (" + entry.getValue() + " times)");
            }
        }
    }
}
