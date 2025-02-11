package com.capgemini.ai_driven_resume_screening_system;

public class Main {
    public static void main(String[] args) {
        JobRole job1 = new SoftwareEngineerRole("Om", 6, "Software Engineer", 89000);
        JobRole job2 = new DataScientistRole("Durgesh", 1, "Data Scientist", 80000000);
        Resume resumeList = new Resume();
        resumeList.addResume(job1);
        resumeList.addResume(job2);
        JobUtility utility = new JobUtility();
        utility.displayInfo(resumeList.resumeList);
    }
}
