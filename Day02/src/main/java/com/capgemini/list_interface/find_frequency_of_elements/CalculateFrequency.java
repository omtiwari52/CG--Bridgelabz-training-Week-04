package com.capgemini.list_interface.find_frequency_of_elements;

import java.util.ArrayList;
import java.util.HashMap;

public class CalculateFrequency {
    public HashMap<String,Integer> calculateFrequency(ArrayList<String> list){
        HashMap<String,Integer> map = new HashMap<>();
        // Map the values in the ArrayList
        for (String ch: list) {
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }
        return map;
    }
}
