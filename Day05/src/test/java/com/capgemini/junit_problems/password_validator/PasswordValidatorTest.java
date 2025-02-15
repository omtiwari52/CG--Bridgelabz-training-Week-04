package com.capgemini.junit_problems.password_validator;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    @Test
    void testValidPasswords() {
        assertTrue(PasswordValidator.isValidPassword("StrongPass1"));
        assertTrue(PasswordValidator.isValidPassword("Hello123"));
    }

    @Test
    void testInvalidPasswords() {
        assertFalse(PasswordValidator.isValidPassword("short")); // Too short
        assertFalse(PasswordValidator.isValidPassword("nouppercase1")); // No uppercase
        assertFalse(PasswordValidator.isValidPassword("NoNumbersHere")); // No digit
        assertFalse(PasswordValidator.isValidPassword("")); // Empty password
        assertFalse(PasswordValidator.isValidPassword(null)); // Null password
    }
}
