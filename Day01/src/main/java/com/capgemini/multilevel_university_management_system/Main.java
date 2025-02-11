package com.capgemini.multilevel_university_management_system;

public class Main {

    public static void main(String[] args) {
        ExamCourse examBased = new ExamCourse(100);
        Course<ExamCourse> course1 = new Course<>("Physics","1-Months",800, examBased);
        Course<ExamCourse> course2 = new Course<>("chemistry","1-Months",700, examBased);
        Course<ExamCourse> course3 = new Course<>("Maths","1-Months",1000, examBased);
//        course1.displayCourseDetails();

        // Add course using course utility
        CourseUtility examUtility = new CourseUtility();
        examUtility.addCourse(course1);
        examUtility.addCourse(course2);
        examUtility.addCourse(course3);
        // Display all the course in exam type
        examUtility.displayAllCourses();
    }
}
