package com.capgemini.multilevel_university_management_system;

public class ResearchCource extends CourseType {
    private boolean research;

    ResearchCource(boolean research) {
        super("Research-Based");
        this.research = research;
    }

    public boolean isThesisRequired() { return research; }

    @Override
    public void displayCourseInfo() {
        System.out.println("Research-Based Course -> research Required: " + (research ? "Yes" : "No"));
    }
}
