package com.capgemini.annotations.intermediate.logging_method_execution_time;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        ExecutionTimeLogger.logExecutionTime(manager, "processTask");
        ExecutionTimeLogger.logExecutionTime(manager, "fastTask");
        ExecutionTimeLogger.logExecutionTime(manager, "withoutAnnotation");
    }
}