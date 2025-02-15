package com.capgemini.regex_problems.validate_a_credit_card_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCard {

    //method to check if the master card number is valid or not
    public static boolean isVisaCard(String cardNumber){

        //define regex in which ensures that a visa should start from 4 and goes upto 16 digits
        String regex = "^4\\d{15}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cardNumber);

        //return boolean for result
        return matcher.matches();
    }

    //method to check if the master card number is valid or not
    public static boolean isMasterCard(String cardNumber){

        //define regex in which ensures that a mastercard should start from 5 and goes upto 16 digits
        String regex = "^5\\d{15}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cardNumber);

        //return boolean for result
        return matcher.matches();
    }
}
