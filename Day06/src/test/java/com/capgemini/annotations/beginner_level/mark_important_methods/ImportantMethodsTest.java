package com.capgemini.annotations.beginner_level.mark_important_methods;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class ImportantMethodsTest {

    @Test
    void testImportantMethods1() throws NoSuchMethodException {

        Class<?> cls = ImportantMethods.class;

        Method studyMethod = cls.getDeclaredMethod("studyLevel");
        Method gameMethod = cls.getDeclaredMethod("gameLevel");

        //check if annotation is present or not
        assertTrue(studyMethod.isAnnotationPresent(ImportantMethod.class));
        assertTrue(gameMethod.isAnnotationPresent(ImportantMethod.class));


        //check for the level of methods or annotations value

        ImportantMethod studyAnnotations = studyMethod.getAnnotation(ImportantMethod.class);
        ImportantMethod gameAnnotations = gameMethod.getAnnotation(ImportantMethod.class);
        assertEquals("INTERMEDIATE", studyAnnotations.level());
        assertEquals("MEDIUM", gameAnnotations.level());
        System.out.println("✅ Test Passed");

    }
}
