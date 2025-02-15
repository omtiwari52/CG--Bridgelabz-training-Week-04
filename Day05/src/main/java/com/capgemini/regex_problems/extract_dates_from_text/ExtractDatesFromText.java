package com.capgemini.regex.extract_dates_from_text;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDatesFromText {
    // Method to extract the dates from the string
    public static ArrayList<String> extractDates(String text){
        ArrayList<String> list = new ArrayList<>();
        String regex = "\\b\\d{2}\\/\\d{2}\\/\\d{4}";
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            list.add(matcher.group());
        }

        return list;
    }
}
