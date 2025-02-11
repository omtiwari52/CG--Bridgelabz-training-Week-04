package com.capgemini.multilevel_university_management_system_test;

import com.capgemini.multilevel_university_management_system.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultilevelUniversityManagementSystemTest {
    // Creating the course
    CourseType examBased = new ExamCourse(100);
    Course<ExamCourse> course1 = new Course("Java Programming","3-Months",5000,examBased);

    @Test
    void course1Test(){
        assertEquals("Java Programming",course1.getCourseName());
        assertEquals(5000,course1.getPrice());
        assertEquals(examBased,course1.getCourseType());
    }

}
