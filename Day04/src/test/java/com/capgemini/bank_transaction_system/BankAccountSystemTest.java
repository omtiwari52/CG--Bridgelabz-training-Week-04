package com.capgemini.bank_transaction_system;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountSystemTest {

    BankAccountSystem bank = new BankAccountSystem(500);

    @Test
    void bankSystemTest1(){
        assertThrows(InsufficientBalanceException.class, ()-> bank.withdraw(900));
    }

    @Test
    void bankSystemTest2(){
        assertThrows(IllegalArgumentException.class, ()-> bank.deposit(-80));
    }

    @Test
    void bankSystemTest3(){
        assertEquals(200, bank.withdraw(300));
    }
}
