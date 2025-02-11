package com.capgemini.ai_driven_resume_screening_system_test;

import com.capgemini.ai_driven_resume_screening_system.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ResumeScreeningSystemTest {

    JobRole job1 = new SoftwareEngineerRole("Om", 6, "Software Engineer", 89000);
    Resume resumeList = new Resume();
    JobUtility utility = new JobUtility();

    @Test
    void ResumeScreeningTest(){
        resumeList.addResume(job1);
        assertEquals("Om", job1.getCandidateName());
    }
}
