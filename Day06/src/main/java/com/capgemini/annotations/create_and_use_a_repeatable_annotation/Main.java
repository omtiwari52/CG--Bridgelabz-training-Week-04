package com.capgemini.annotations.create_and_use_a_repeatable_annotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {

            //get class object
            Class<?> cls = SoftwareModule.class;

            //Get method
            Method method = cls.getDeclaredMethod("processData");

            //Retrieve annotations
            if(method.isAnnotationPresent(BugReports.class)){
                BugReports bugReports = method.getAnnotation(BugReports.class);

                System.out.println("Bug reports for processed data: ");
                for(BugReport bug : bugReports.value()){
                    System.out.println(" Description: "+bug.description());
                    System.out.println(" Reported By: "+bug.reportedBy());
                    System.out.println(" Severity: "+bug.severity());
                    System.out.println("-------------------------------");
                }
            }
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
