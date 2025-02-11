package com.capgemini.ai_driven_resume_screening_system;

public abstract class JobRole {
    private String candidateName;
    private int experience;
    private double salary;

    public JobRole(String candidateName, int experience, double salary){
        this.candidateName = candidateName;
        this.experience = experience;
        this.salary = salary;
    }

    //method to get experience of candidate
    public int getExperience() {
        return experience;
    }

    //method to get name of candidate
    public String getCandidateName() {
        return candidateName;
    }

    //getter method for salary
    public double getSalary() {
        return salary;
    }

    //method to display candidate information
    abstract void displayCandidateDetails();
}
