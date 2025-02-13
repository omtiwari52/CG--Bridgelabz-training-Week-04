package com.capgemini.map_interface.find_key_with_highest_value;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;

public class MaxValueKeyFinderTest {

    @Test
    void testFindKeyWithMaxValue() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        String expectedOutput = "B";
        String actualOutput = MaxValueKeyFinder.findKeyWithMaxValue(inputMap);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testEmptyMap() {
        Map<String, Integer> inputMap = new HashMap<>();
        String actualOutput = MaxValueKeyFinder.findKeyWithMaxValue(inputMap);

        assertNull(actualOutput, "Should return null for an empty map.");
    }

}
