package com.capgemini.reflection.advance_problems.method_execution_timing;

public class SampleOperations {

    public void fastMethod() {
        System.out.println("Executing fast method...");
    }

    public void slowMethod() {
        try {
            System.out.println("Executing slow method...");
            Thread.sleep(2000); // Simulating a slow method
        } catch (InterruptedException e) {
            System.out.println("Exception caught "+e.getMessage());
        }
    }
}
