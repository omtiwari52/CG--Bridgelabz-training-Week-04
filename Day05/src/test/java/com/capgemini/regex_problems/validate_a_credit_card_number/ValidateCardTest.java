package com.capgemini.regex_problems.validate_a_credit_card_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateCardTest {

    //this test case will pass if we give it a right card number
    @Test
    void isValidTest1(){
        assertTrue(ValidateCard.isVisaCard("4567897654312345"));
        System.out.println("✅ Test1 Passed");
    }

    //this test case will pass if we give it a right card number
    @Test
    void isValidTest2(){
        assertTrue(ValidateCard.isMasterCard("5567897654312345"));
        System.out.println("✅ Test2 Passed");
    }

    //this test case will fail if we give it a wrong card number
    @Test
    void isValidTest3(){
        assertTrue(ValidateCard.isVisaCard("3567897654312345"));
    }

    //this test case will fail if we give it a wrong card number
    @Test
    void isValidTest4(){
        assertTrue(ValidateCard.isMasterCard("4567897654312345"));
    }
}
