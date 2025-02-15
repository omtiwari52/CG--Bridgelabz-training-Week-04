package com.capgemini.regex.validate_licese_plate_number;

import com.capgemini.regex.validate_license_plate_number.ValidateRegex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidateLicensePlateNumberTest {
    @Test
    void checkValidTest(){
        assertTrue(ValidateRegex.validate("AB1234"));
    }

    @Test
    void checkInvalidTest(){
        assertFalse(ValidateRegex.validate("ABC12345")); // Invalid regex
    }
}
