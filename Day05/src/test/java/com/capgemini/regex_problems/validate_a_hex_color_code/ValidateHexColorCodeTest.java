package com.capgemini.regex_problems.validate_a_hex_color_code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateHexColorCodeTest {


    //this test will pass if the method will return true for valid color code
    @Test
    void isValidTest1(){
        assertTrue(ValidateHexColorCode.isValid("#FFA500"));
    }

    //this test will fail if the method will return true for valid color code
    @Test
    void isValidTest2(){
        assertFalse(ValidateHexColorCode.isValid("#123"));
    }
}
