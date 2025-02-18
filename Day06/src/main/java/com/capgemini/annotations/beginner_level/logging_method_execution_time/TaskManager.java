package com.capgemini.annotations.beginner_level.logging_method_execution_time;

public class TaskManager {

    @LogExecutionTime
    public void processTask(){
        try {
            Thread.sleep(200);  //task will take 200ms
        } catch (InterruptedException e) {
            System.out.println("Exception caught: "+ e.getMessage());
        }
        System.out.println("Task Completed");
    }

    @LogExecutionTime
    public void fastTask(){
        System.out.println("Task completed fast");
    }

    public void withoutAnnotation(){
        System.out.println("This method is without annotation");
    }
}
