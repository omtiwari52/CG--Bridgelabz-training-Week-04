package com.capgemini.regex_problems.extract_currency_values_from_a_text;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtractCurrencyTest {


    @Test
    void extractCurrencyTest1(){
        assertEquals(new ArrayList<>(Arrays.asList("$45.99", "10.50")), ExtractCurrency.extractCurrency("The price is $45.99, and the discount is 10.50.") );
        System.out.println("✅ Test1 Passed");
    }

    @Test
    void extractCurrencyTest2(){
        assertEquals(new ArrayList<>(Arrays.asList("$45.99")), ExtractCurrency.extractCurrency("The price is $45.99, and the discount is 10.50.") );
    }
}
