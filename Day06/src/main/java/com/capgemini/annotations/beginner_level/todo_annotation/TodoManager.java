package com.capgemini.annotations.beginner_level.todo_annotation;

public class TodoManager {
    // method in which annotation is applied

    @Todo(task = "Complete the UI" , assignedInfo = "Harsh veer singh",priority = "High")
    public static void pendingTask(){
        System.out.println("Pending task");
    }
    @Todo(task = "Complete the Login/SignUp Feature" , assignedInfo = "OM",priority = "lOW")
    public static void completedTask(){
        System.out.println("Completed Task");
    }
    @Todo(task = "Complete the Concurrency" , assignedInfo = "Harsh veer",priority = "High")
    public static void submittedTask(){
        System.out.println("Pending task");
    }
}
