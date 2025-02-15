package com.capgemini.regex.validate_ip_address;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIpAddress {
    // Method which validate the ip address
    public static boolean validateIpAddress(String text){
        String regex = "^(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]\\d|\\d)\\."
                + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]\\d|\\d)\\."
                + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]\\d|\\d)\\."
                + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]\\d|\\d)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        return matcher.find();
    }
}
