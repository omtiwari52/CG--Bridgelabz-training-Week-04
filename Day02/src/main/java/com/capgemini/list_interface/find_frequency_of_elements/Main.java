package com.capgemini.list_interface.find_frequency_of_elements;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CalculateFrequency calculateFrequency = new CalculateFrequency();
        // Invoke the method which return the map and print it
        System.out.println(calculateFrequency.calculateFrequency(new ArrayList<>(Arrays.asList("Apple","Banana","Mango","Apple"))));
    }
}
