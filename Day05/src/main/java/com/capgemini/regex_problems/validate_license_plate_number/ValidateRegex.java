package com.capgemini.regex.validate_license_plate_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateRegex {

    // Method to validate the regex
    public static boolean validate(String text){
        String regex = "^[A-B]{2}\\d{4}$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        return matcher.matches();
    }
}
