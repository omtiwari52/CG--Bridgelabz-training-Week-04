package com.capgemini.ai_driven_resume_screening_system;

import java.util.ArrayList;
import java.util.List;

public class Resume <T extends JobRole>{

    List<JobRole> resumeList = new ArrayList<>();
    public void addResume(JobRole resume){
        resumeList.add(resume);
    }
}
