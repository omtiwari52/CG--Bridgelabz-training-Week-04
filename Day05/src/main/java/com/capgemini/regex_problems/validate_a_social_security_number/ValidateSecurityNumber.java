package com.capgemini.regex.validate_a_social_security_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSecurityNumber {
    // Method to validate a security number
    public static boolean validateSecurityNumber(String text){
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.matches()){
            return true;
        }
        return false;
    }
}
