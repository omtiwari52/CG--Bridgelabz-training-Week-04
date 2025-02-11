package com.capgemini.multilevel_university_management_system;

public class ExamCourse extends CourseType{
    private int examWeightage;
    public ExamCourse(int examWeightage){
        super("Exam-Based");
        this.examWeightage = examWeightage;
    }

    public int getExamWeightage() { return examWeightage; }

    @Override
    public void displayCourseInfo() {
        System.out.println("Exam-Based Course -> Exam Weightage: " + examWeightage + "%");
    }

}
