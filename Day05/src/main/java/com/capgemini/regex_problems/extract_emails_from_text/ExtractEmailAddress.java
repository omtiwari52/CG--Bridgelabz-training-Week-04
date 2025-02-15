package com.capgemini.regex.extract_emails_from_text;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailAddress {
    // method to extract the email address from the text
    public static ArrayList<String> extractEmailAddresses(String text){
        ArrayList<String> list = new ArrayList<>();
        String regex = "[a-zA-Z0-9_+%-.]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            list.add(matcher.group());
        }

        return list;
    }
}
