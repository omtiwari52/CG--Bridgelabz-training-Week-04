package com.capgemini.list_interface.find_frequency_of_elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateFrequencyTest {

    CalculateFrequency calculateFrequency = new CalculateFrequency();
    HashMap<String,Integer> map = calculateFrequency.calculateFrequency(new ArrayList<>(Arrays.asList("Apple","Banana","Apple","Mango")));

    // Passes all the test
    @Test
    void frequencyTestOne(){
        assertEquals(2,map.get("Apple"));
        assertEquals(1,map.get("Mango"));
    }

    // Failed as the value of mango key is 1 not 0
    @Test
    void frequencyTestSecond(){
        assertEquals(0,map.get("Mango"));
    }
}
