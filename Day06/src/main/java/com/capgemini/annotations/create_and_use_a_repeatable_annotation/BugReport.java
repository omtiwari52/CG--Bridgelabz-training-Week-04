package com.capgemini.annotations.create_and_use_a_repeatable_annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
public @interface BugReport {
    String description();
    String reportedBy() default "Unknown";
    String severity() default "Medium";
}
