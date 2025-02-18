package com.capgemini.annotations.create_custom_annotations;

public class TaskManager {

    @TaskInfo(priority = "High",assignedTo = "Harsh veer singh")
    public static void taskComplete(){
        System.out.println("Task is done");
    }

    @TaskInfo(priority = "Low" ,assignedTo = "Om")
    public static void taskSent(){
        System.out.println("Task sent successfully");
    }
}
