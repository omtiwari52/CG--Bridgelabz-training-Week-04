package com.capgemini.junit_problems.user_registration;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    void testValidUserRegistration() {
        assertEquals("User registered successfully", UserRegistration.registerUser("JohnDoe", "john@example.com", "StrongPass1"));
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("", "test@example.com", "Pass1234"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser(null, "test@example.com", "Pass1234"));
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("Harsh", "invalid-email", "Pass1234"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("Om", "user@com", "Pass1234"));
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("Harsh", "harsh@example.com", "short"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("om", "om@example.com", "nouppercase1"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("durgesh", "durgesh@example.com", "NOLOWERCASE1"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("okaaayy", "vipin@example.com", "NoNumbersHere"));
    }
}
