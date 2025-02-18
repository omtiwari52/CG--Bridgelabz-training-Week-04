package com.capgemini.annotations.beginner_level.todo_annotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<TodoManager> taskInfo = TodoManager.class;

        for (Method method : taskInfo.getDeclaredMethods()){
            Todo todoInfo = method.getAnnotation(Todo.class);
            if (method.isAnnotationPresent(Todo.class)){
                System.out.println("Method name: " + method.getName());
                System.out.println("Assigned to: " + todoInfo.assignedInfo());
                System.out.println("Task name: " + todoInfo.task());
                System.out.println("Priority : " + todoInfo.priority());
                System.out.println("-------------------");
            }
        }
    }
}
