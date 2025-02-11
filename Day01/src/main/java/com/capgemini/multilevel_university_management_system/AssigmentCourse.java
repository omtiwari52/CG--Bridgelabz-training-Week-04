package com.capgemini.multilevel_university_management_system;

public class AssigmentCourse extends CourseType {

    private int totalAssignments;

    AssigmentCourse(int totalAssignments) {
        super("Assignment-Based");
        this.totalAssignments = totalAssignments;
    }

    public int getTotalAssignments() { return totalAssignments; }

    @Override
    public void displayCourseInfo() {
        System.out.println("Assignment-Based Course -> Total Assignments: " + totalAssignments);
    }
}
