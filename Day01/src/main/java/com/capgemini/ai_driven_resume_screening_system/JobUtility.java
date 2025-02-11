package com.capgemini.ai_driven_resume_screening_system;

import java.util.List;

public class JobUtility {
    public void displayInfo(List<? extends JobRole> jobRoles){
        System.out.println("------CANDIDATES RESUME DETAILS----------");
        for(JobRole job : jobRoles){
            job.displayCandidateDetails();
            System.out.println("----------------------------");
        }
    }
}
