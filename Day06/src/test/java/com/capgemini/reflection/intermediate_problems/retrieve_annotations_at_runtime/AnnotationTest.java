package com.capgemini.reflection.intermediate_problems.retrieve_annotations_at_runtime;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnnotationTest {

    @Test
    void testAuthorAnnotationPresence() {
        Class<Book> bookClass = Book.class;

        // Ensure the annotation is present
        assertTrue(bookClass.isAnnotationPresent(Author.class));

        // Retrieve and verify annotation value
        Author authorAnnotation = bookClass.getAnnotation(Author.class);
        assertEquals("John Doe", authorAnnotation.name());
        System.out.println("✅Test1 Passed");
    }

    @Test
    void testAnnotationAbsentOnDifferentClass() {
        class UnrelatedClass {}

        assertFalse(UnrelatedClass.class.isAnnotationPresent(Author.class));
        System.out.println("✅Test2 Passed");
    }
}