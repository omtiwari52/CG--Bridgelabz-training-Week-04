package com.capgemini.queue_interface.convert_decimal_into_binary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckDecimalBinaryConversion {

    ConvertBDecimalToBinaryNumber conversion = new ConvertBDecimalToBinaryNumber();

    // Test one
    @Test
    void testCaseOne() {
        assertEquals(Arrays.asList("1", "10", "11", "100", "101"), conversion.convertToBinary(5));
    }

    // Failed test case
    @Test
    void testCaseSecond() {
        assertEquals(Arrays.asList("1", "10", "11", "100", "101", "111", "101"), conversion.convertToBinary(7));
    }
}
