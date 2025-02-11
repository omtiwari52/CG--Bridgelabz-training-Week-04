package com.capgemini.multilevel_university_management_system;

import java.util.ArrayList;
import java.util.List;

public class CourseUtility {
    List< Course<? extends CourseType>> courseList = new ArrayList<>();

    // Method to add the course
    void addCourse(Course<? extends CourseType> course){
        courseList.add(course);
    }

    // Display all courses dynamically
    public void displayAllCourses() {
        for (Course<? extends CourseType> course : courseList) {
            course.displayCourseDetails();
            System.out.println("---------------------------------");
        }
    }
}
