package com.capgemini.junit_problems.performance_testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    @Timeout(2) // Test fails if it runs longer than 2 seconds
    void testLongRunningTask() {
        Task task = new Task();
        assertEquals("Task Completed", task.longRunningTask());
    }
}