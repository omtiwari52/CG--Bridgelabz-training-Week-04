package com.capgemini.banking_system;

public class Main {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        bank.createAccount(188941, 5000);
        bank.createAccount(188392, 3000);
        bank.createAccount(199223, 7000);

        bank.deposit(188941, 2000);
        bank.requestWithdrawal(188392);
        bank.requestWithdrawal(188941);

        bank.displayAccountsSortedByBalance();
        bank.processWithdrawals(1000);
        bank.displayAccountsSortedByBalance();
    }
}
