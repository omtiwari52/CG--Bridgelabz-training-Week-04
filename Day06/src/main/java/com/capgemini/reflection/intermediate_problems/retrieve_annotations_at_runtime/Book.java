package com.capgemini.reflection.intermediate_problems.retrieve_annotations_at_runtime;

// Apply the custom annotation
@Author(name = "John Doe")
public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void displayTitle() {
        System.out.println("Book Title: " + title);
    }
}
