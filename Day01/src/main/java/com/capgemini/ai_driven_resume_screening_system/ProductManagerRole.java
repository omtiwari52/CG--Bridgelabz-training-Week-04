package com.capgemini.ai_driven_resume_screening_system;

public class ProductManagerRole extends JobRole{
    private String role;

    public ProductManagerRole(String name, int experience, String role, double salary){
        super(name,experience,salary);
        this.role = role;
    }

    //getter method
    public String getRole() {
        return role;
    }

    @Override
    void displayCandidateDetails() {
        System.out.println("Candidate Name: "+ getCandidateName() +"\nExperience: "+getExperience()+ "\nRole: "+getRole()+"\nPrevious Salary: "+getSalary());
    }
}
