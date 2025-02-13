package com.capgemini.banking_system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckBankingSystemTest {
    BankingSystem bank = new BankingSystem();
    @BeforeEach
    void addAccounts(){
        bank.createAccount(188941, 5000);
        bank.createAccount(188392, 3000);
        bank.createAccount(199223, 7000);
    }

    @Test
    void testDeposit(){
        bank.deposit(188941, 2000);
        // Check the account balance
        assertEquals(7000,bank.getBalance(188941));
    }
}
