package com.capgemini.reflection.intermediate_problems.retrieve_annotations_at_runtime;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Define Custom Annotation
@Retention(RetentionPolicy.RUNTIME)    // Available at runtime
@Target(ElementType.TYPE)      // Can be applied to classes
public @interface Author {
    String name();
}