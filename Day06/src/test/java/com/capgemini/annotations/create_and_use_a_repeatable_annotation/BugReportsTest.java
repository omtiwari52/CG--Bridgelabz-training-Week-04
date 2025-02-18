package com.capgemini.annotations.create_and_use_a_repeatable_annotation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Method;

public class BugReportsTest {

    @Test
    void testBugReport1() throws NoSuchMethodException {

        Class<?> cls = SoftwareModule.class;
        Method method = cls.getDeclaredMethod("processData");

        //check if BugReports annotation is present
        assertTrue(method.isAnnotationPresent(BugReports.class));

        //retrieve annotation
        BugReports bugReports = method.getAnnotation(BugReports.class);
        assertNotNull(bugReports);

        //test for number of bug reports
        assertEquals(2, bugReports.value().length);


        // let's test for bug report 1
        assertEquals("NullPointerException occurs", bugReports.value()[0].description());
        assertEquals("Om Tiwari", bugReports.value()[0].reportedBy());
        assertEquals("High", bugReports.value()[0].severity());

        assertEquals("IOException occurs", bugReports.value()[1].description());
        assertEquals("HarshVeer", bugReports.value()[1].reportedBy());
        assertEquals("Medium", bugReports.value()[1].severity());


        System.out.println("✅Test Passed");
    }
}
