package com.capgemini.map_interface.merge_two_map;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

class MapMergerTest {

    @Test
    void testMergeMaps() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> expectedOutput = new HashMap<>();
        expectedOutput.put("A", 1);
        expectedOutput.put("B", 5);
        expectedOutput.put("C", 4);

        Map<String, Integer> actualOutput = MergeMap.mergeMaps(map1, map2);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testEmptyMaps() {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        Map<String, Integer> actualOutput = MergeMap.mergeMaps(map1, map2);

        assertTrue(actualOutput.isEmpty(), "Merged map should be empty when both inputs are empty.");
    }
}