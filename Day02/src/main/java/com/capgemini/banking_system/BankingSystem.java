package com.capgemini.banking_system;

import java.util.*;


public class BankingSystem {

    // Stores account balances
    private HashMap<Integer, Double> accounts;

    // Sorted by balance
    private TreeMap<Double, List<Integer>> sortedAccounts;

    // Queue for withdrawal requests
    private Queue<Integer> withdrawalQueue;

    public BankingSystem() {
        accounts = new HashMap<>();
        sortedAccounts = new TreeMap<>();
        withdrawalQueue = new LinkedList<>();
    }

    public double getBalance(int accountNumber){
        return accounts.get(accountNumber);
    }

    // Create a new account
    public void createAccount(int accountNumber, double initialBalance) {
        if (accounts.containsKey(accountNumber)) {
            System.out.println("Account already exists!");
            return;
        }
        accounts.put(accountNumber, initialBalance);
        sortedAccounts.computeIfAbsent(initialBalance, k -> new ArrayList<>()).add(accountNumber);
        System.out.println("Account " + accountNumber + " created with balance: " + initialBalance);
    }

    // Deposit money into an account
    public void deposit(int accountNumber, double amount) {
        if (!accounts.containsKey(accountNumber)) {
            System.out.println("Account not found!");
            return;
        }
        double oldBalance = accounts.get(accountNumber);
        double newBalance = oldBalance + amount;
        accounts.put(accountNumber, newBalance);

        // Update sortedAccounts
        sortedAccounts.get(oldBalance).remove((Integer) accountNumber);
        if (sortedAccounts.get(oldBalance).isEmpty()) {
            sortedAccounts.remove(oldBalance);
        }
        sortedAccounts.computeIfAbsent(newBalance, k -> new ArrayList<>()).add(accountNumber);
        System.out.println("Deposited " + amount + " to Account " + accountNumber + ". New Balance: " + newBalance);
    }

    // Withdraw money (add request to queue)
    public void requestWithdrawal(int accountNumber) {
        if (!accounts.containsKey(accountNumber)) {
            System.out.println("Account not found!");
            return;
        }
        withdrawalQueue.add(accountNumber);
        System.out.println("Withdrawal request added for Account " + accountNumber);
    }

    // Process withdrawal requests
    public void processWithdrawals(double withdrawalAmount) {
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            double balance = accounts.get(accountNumber);

            if (balance >= withdrawalAmount) {
                double newBalance = balance - withdrawalAmount;
                accounts.put(accountNumber, newBalance);

                // Update sortedAccounts
                sortedAccounts.get(balance).remove((Integer) accountNumber);
                if (sortedAccounts.get(balance).isEmpty()) {
                    sortedAccounts.remove(balance);
                }
                sortedAccounts.computeIfAbsent(newBalance, k -> new ArrayList<>()).add(accountNumber);

                System.out.println("Withdrawn " + withdrawalAmount + " from Account " + accountNumber + ". New Balance: " + newBalance);
            } else {
                System.out.println("Insufficient funds for Account " + accountNumber);
            }
        }
    }

    // Display all accounts sorted by balance
    public void displayAccountsSortedByBalance() {
        System.out.println("Accounts sorted by balance:");
        for (var entry : sortedAccounts.entrySet()) {
            for (int accountNumber : entry.getValue()) {
                System.out.println("Account Number: " + accountNumber + " -> Balance: " + entry.getKey());
            }
        }
    }
}
