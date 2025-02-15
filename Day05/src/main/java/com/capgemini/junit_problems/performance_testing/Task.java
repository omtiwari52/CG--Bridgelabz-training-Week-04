package com.capgemini.junit_problems.performance_testing;

public class Task {
    public String longRunningTask() {
        try {
            Thread.sleep(3000); // Simulating a long-running task
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task Completed";
    }
}
