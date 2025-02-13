package com.capgemini.map_interface.merge_two_map;


import java.util.HashMap;
import java.util.Map;

public class MergeMap {
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(map1); // Copy map1 into result
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            result.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        return result;
    }
}