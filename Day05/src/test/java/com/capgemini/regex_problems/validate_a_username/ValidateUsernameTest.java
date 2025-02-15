package com.capgemini.regex_problems.validate_a_username;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateUsernameTest {

    @Test
    void isValidTest1(){
        assertTrue(ValidateUsername.isValid("omtiwari52"));
    }

    @Test
    void isValidTest2(){
        assertFalse(ValidateUsername.isValid("_bipin@sahu"));
    }
}
