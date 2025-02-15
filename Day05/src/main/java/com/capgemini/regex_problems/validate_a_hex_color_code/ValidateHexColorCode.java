package com.capgemini.regex_problems.validate_a_hex_color_code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHexColorCode {

    //method to validate hex color code
    public static boolean isValid(String colorCode){

        String regex = "^#[A-Fa-f0-9]{6}$";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(colorCode);

        while (matcher.matches()){
            return true;
        }
        return false;
    }
}
