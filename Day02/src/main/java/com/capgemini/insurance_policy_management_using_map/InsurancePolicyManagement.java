package com.capgemini.insurance_policy_management_using_map;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManagement {
    private Map<Integer, InsurancePolicy> policyHashMap = new HashMap<>();
    private Map<Integer, InsurancePolicy> policyLinkedHashMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, InsurancePolicy> policyTreeMap = new TreeMap<>();

    public void addPolicy(InsurancePolicy policy) {
        policyHashMap.put(policy.getPolicyNumber(), policy);
        policyLinkedHashMap.put(policy.getPolicyNumber(), policy);
        policyTreeMap.put(policy.getExpiryDate(), policy);
    }

    public InsurancePolicy getPolicyByNumber(int policyNumber) {
        return policyHashMap.get(policyNumber);
    }

    public List<InsurancePolicy> getExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate cutoff = today.plusDays(30);
        List<InsurancePolicy> expiringPolicies = new ArrayList<>();

        for (Map.Entry<LocalDate, InsurancePolicy> entry : policyTreeMap.entrySet()) {
            if (entry.getKey().isBefore(cutoff)) {
                expiringPolicies.add(entry.getValue());
            }
        }
        return expiringPolicies;
    }

    public List<InsurancePolicy> getPoliciesByHolder(String policyholderName) {
        List<InsurancePolicy> result = new ArrayList<>();
        for (InsurancePolicy policy : policyHashMap.values()) {
            if (policy.getPolicyholderName().equalsIgnoreCase(policyholderName)) {
                result.add(policy);
            }
        }
        return result;
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        Iterator<Map.Entry<LocalDate, InsurancePolicy>> iterator = policyTreeMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<LocalDate, InsurancePolicy> entry = iterator.next();
            if (entry.getKey().isBefore(today)) {
                policyHashMap.remove(entry.getValue().getPolicyNumber());
                policyLinkedHashMap.remove(entry.getValue().getPolicyNumber());
                iterator.remove();
            }
        }
    }

    public void displayAllPolicies() {
        for (InsurancePolicy policy : policyLinkedHashMap.values()) {
            System.out.println(policy);
        }
    }
}
