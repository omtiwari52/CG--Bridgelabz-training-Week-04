package com.capgemini.multilevel_university_management_system;

public class Course<T extends CourseType> {
    private String courseName;
    private String duration;
    private double price;
    private T type;
    public Course(String courseName, String duration, double price, T type){
        this.courseName = courseName;
        this.duration = duration;
        this.price = price;
        this.type = type;
    }

    public String getCourseName(){
        return courseName;
    }

    public String getDuration(){
        return duration;
    }
    public double getPrice(){
        return price;
    }
    public T getCourseType() { return type; }

    public void displayCourseDetails(){
        System.out.println("Name of the course: " + courseName +
                "\nPrice of the course: " + price +
                "\nCourse type: " + type.getCourseType() +
                "\nDuration of the course: " + duration
        );
        System.out.println("--------------------------------");
    }



}
