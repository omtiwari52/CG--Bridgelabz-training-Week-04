package com.capgemini.annotations.beginner_level.logging_method_execution_time;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ExecutionTimeLogger {

    public static void logExecutionTime(Object obj, String methodName, Object... args){

        try {

            //get class and method
            Class<?> cls = obj.getClass();
            Method method = cls.getMethod(methodName);


            //check if method has annotation
            if(method.isAnnotationPresent(LogExecutionTime.class)){
                long startTime = System.nanoTime();

                //invoke method
                method.invoke(obj,args);

                long endTime = System.nanoTime();
                long duration = (endTime - startTime) / 1_000_000;

                System.out.println("Execution Time of " + methodName + ": " + duration + " ms");
            }else{
                System.out.println("Method "+methodName+" is not @annotated with @LogExecutionTime");
            }

        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
