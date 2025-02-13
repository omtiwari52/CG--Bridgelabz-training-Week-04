package com.capgemini.map_interface.count_words_in_file_and_map;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class MapWordsFrequency {
    // Method which calculate words and map in the hash-map then return it
    public static HashMap<String,Integer> countAndMap(String fileName){
        HashMap<String, Integer> map = new HashMap<>();
        String filePath = "src/main/java/com/capgemini/map_interface/count_words_in_file_and_map/" + fileName;
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            String line;
            try{
                while((line = br.readLine()) != null){
                    String[] words = line.toLowerCase().split(" "); // Split by spaces

                    for (String word : words) {
                        word = word.replaceAll("[^a-zA-Z]", "");
                        if (!word.isEmpty()) {
                            map.put(word, map.getOrDefault(word, 0) + 1);
                        }
                    }
                }
            }catch (IOException e){
                System.out.println("Exception caught io exception occurred "+ e.getMessage());
            }

        }catch(FileNotFoundException e){
            System.out.println("Exception caught file not found please check the file path:- " + e.getMessage() );
        }

        return map;
    }
}
