package com.capgemini.count_words_in_a_file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //use try and catch to catch IO Exception if occurs
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            //get user input for the name of source file
            System.out.println("Enter the source file name: ");
            String sourceFileName = br.readLine().trim();

            HashMap<String, Integer> result = new HashMap<>(CountWordInAFile.readFileAndCount(sourceFileName));
            LinkedHashMap<String, Integer> sortedWordCount = new LinkedHashMap<>(CountWordInAFile.sortHashMap(result));

            // Display the top 5 most frequent words
            System.out.println("Top 5 most frequent words:");
            int count = 0;
            for (Map.Entry<String, Integer> entry : sortedWordCount.entrySet()) {
                if (count++ >= 5) break;
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
