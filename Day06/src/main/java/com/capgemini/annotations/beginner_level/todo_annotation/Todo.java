package com.capgemini.annotations.beginner_level.todo_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Todo {
    String task();
    String assignedInfo() ;
    String priority() default "MEDIUM";
}
