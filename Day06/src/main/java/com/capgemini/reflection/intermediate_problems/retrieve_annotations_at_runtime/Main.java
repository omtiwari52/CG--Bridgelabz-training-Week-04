package com.capgemini.reflection.intermediate_problems.retrieve_annotations_at_runtime;

public class Main {

    public static void main(String[] args) {
        // Get the class object
        Class<Book> bookClass = Book.class;

        // Check if @Author annotation is present
        if (bookClass.isAnnotationPresent(Author.class)) {
            // Retrieve the annotation
            Author authorAnnotation = bookClass.getAnnotation(Author.class);

            // Display the annotation value
            System.out.println("Author Name: " + authorAnnotation.name());
        } else {
            System.out.println("No @Author annotation found on the class.");
        }
    }
}
