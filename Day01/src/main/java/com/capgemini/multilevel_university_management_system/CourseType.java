package com.capgemini.multilevel_university_management_system;

public abstract class CourseType {
    private String courseType;

    CourseType(String type){
        this.courseType = type;
    }

    // Get the course type
    public String getCourseType(){
        return courseType;
    }


    public abstract void displayCourseInfo();
}
