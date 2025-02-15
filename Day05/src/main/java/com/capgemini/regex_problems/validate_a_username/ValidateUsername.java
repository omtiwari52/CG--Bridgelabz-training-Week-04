package com.capgemini.regex_problems.validate_a_username;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {


    //Method to check if the username is valid or not
    public static boolean isValid(String username){

        String regex = "^[a-zA-Z][a-zA-Z0-9_]{5,15}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);

        while(matcher.matches()){
            return true;
        }

        return false;
    }

}
