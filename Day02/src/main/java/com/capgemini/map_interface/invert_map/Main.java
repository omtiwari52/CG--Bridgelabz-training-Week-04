package com.capgemini.map_interface.invert_map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.capgemini.map_interface.invert_map.InvertMap.invertMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);
        Map<Integer, List<String>> inverted = invertMap(inputMap);

        // Printing output
        System.out.println(inverted);
    }
}
