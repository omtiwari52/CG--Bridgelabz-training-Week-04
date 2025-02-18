package com.capgemini.annotations.intermediate.logging_method_execution_time;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExecutionTimeLoggerTest {

    TaskManager manager = new TaskManager();
    @Test
    void logingTimeExecutionTesting1(){

        long startTime = System.nanoTime();
        manager.processTask();
        long endTime = System.nanoTime();

        long executionTime = (endTime - startTime) / 1_000_000; // Convert to ms

        assertTrue(executionTime >= 200);
        System.out.println("✅ Test1 Passed");
    }

    @Test
    void logingTimeExecutionTesting2(){

        long startTime = System.nanoTime();
        manager.fastTask();
        long endTime = System.nanoTime();

        long executionTime  = (endTime - startTime) / 1_000_000;

        assertTrue(executionTime >= 0);
        System.out.println("✅ Test2 Passed");
    }
}
