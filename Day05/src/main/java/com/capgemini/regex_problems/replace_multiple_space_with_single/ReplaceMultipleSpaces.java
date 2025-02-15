package com.capgemini.regex.replace_multiple_space_with_single;

public class ReplaceMultipleSpaces {
    public static String replaceMultipleSpaces(String text){
        return text.replaceAll("\\s+"," ");
    }
}
