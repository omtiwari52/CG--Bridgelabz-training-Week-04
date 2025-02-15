package com.capgemini.junit_problems.testing_parameterized_tests;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberUtilsTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void testIsEven(int number) {
        boolean expected = (number % 2 == 0);
        assertEquals(expected, NumberUtils.isEven(number));
    }
}

