package com.capgemini.annotations.create_custom_annotations;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<TaskManager> taskClass = TaskManager.class;
        for (Method method : taskClass.getDeclaredMethods()){
            TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
            if (method.isAnnotationPresent(TaskInfo.class)){
                System.out.println("Method name:- " + method.getName());
                System.out.println("Priority:- " + taskInfo.priority());
                System.out.println("Assigned to:- " + taskInfo.assignedTo());
                System.out.println("--------------------------");
            }
        }


    }
}
