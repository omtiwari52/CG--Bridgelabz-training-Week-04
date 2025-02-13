package com.capgemini.map_interface.invert_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertMap {
    // Method which inverts the map
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> originalMap) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : originalMap.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();

            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        return invertedMap;
    }
}
