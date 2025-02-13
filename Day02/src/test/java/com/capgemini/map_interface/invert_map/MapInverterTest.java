package com.capgemini.map_interface.invert_map;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.*;

public class MapInverterTest {

    @Test
    void testInvertMap() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);

        Map<Integer, List<String>> expectedOutput = new HashMap<>();
        expectedOutput.put(1, Arrays.asList("A", "C"));
        expectedOutput.put(2, List.of("B"));

        Map<Integer, List<String>> actualOutput = InvertMap.invertMap(inputMap);

        assertEquals(expectedOutput, actualOutput);
    }
}
