package com.capgemini.reflection.advance_problems.method_execution_timing;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

public class MethodTimingTest {

    @Test
    void testMethodExecutionTime() throws Exception {
        // Create an instance of SampleOperations
        SampleOperations operations = new SampleOperations();
        Class<?> cls = operations.getClass();

        // Get the slowMethod dynamically
        Method method = cls.getMethod("slowMethod");

        // Measure execution time
        long startTime = System.nanoTime();
        method.invoke(operations);
        long endTime = System.nanoTime();

        // Calculate execution time in milliseconds
        double executionTime = (endTime - startTime) / 1_000_000.0;

        // Assert that slowMethod takes at least 2 seconds
        assertTrue(executionTime >= 2000);
    }
}
