package com.capgemini.count_words_in_a_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CountWordInAFile {

    //method to Store the count of word and word
    public static HashMap<String, Integer> readFileAndCount(String filePath){

        String myFile = "src/main/java/com/capgemini/count_words_in_a_file/" + filePath;

        HashMap<String, Integer> wordCount = new HashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(myFile))){
            String line; //line contains each line
            try {
                while((line = br.readLine()) != null ){
                    String[] words = line.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
                    for(String word : words){
                        wordCount.put(word, wordCount.getOrDefault(word,0)+1);
                    }
                }
            }catch (IOException e){
                System.out.println("Exception Caught: "+e.getMessage());
            }
        }catch (FileNotFoundException e){
            System.out.println("Exception caught: "+e.getMessage());
        }catch (IOException e){
            System.out.println("Exception Caught: "+e.getMessage());
        }
        return wordCount;
    }

    public static LinkedHashMap<String, Integer> sortHashMap(HashMap<String, Integer> hashMap){

        List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());
        list.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        //create a linked HashMap to maintain order
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> entry : list){
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}
