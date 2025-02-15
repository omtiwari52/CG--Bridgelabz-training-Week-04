package com.capgemini.regex.extract_programming_language_from_text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguage {
    // Method to extract the programming language
    public static String extractProgrammingLanguage(String text){
        String result = "";
        String regex = "Java|Python|JavaScript|Go";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            result += matcher.group() + " ";
        }
        String[] arr = result.split(" ");
        result = "";

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) result += (arr[i] + ", ");
            else result += arr[i];
        }
        return result;
    }
}
