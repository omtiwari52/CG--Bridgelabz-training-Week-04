package com.capgemini.junit_problems.testing_exceptional_handling;

import static org.junit.jupiter.api.Assertions.*;
import com.capgemini.junit_problems.testing_exception_handling.MathUtils;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {
    @Test
    void testDivideValid() {
        assertEquals(5, MathUtils.divide(10, 2));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            MathUtils.divide(10, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

