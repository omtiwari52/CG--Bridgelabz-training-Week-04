package com.capgemini.annotations.create_and_use_a_repeatable_annotation;

public class SoftwareModule {

    @BugReport(description = "NullPointerException occurs", reportedBy = "Om Tiwari", severity = "High")
    @BugReport(description = "IOException occurs", reportedBy = "HarshVeer")
    public void processData(){
        System.out.println("Processing Data....");
    }
}
