package com.capgemini.reflection.advance_problems.custom_logging_proxy;

public class Greet implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }

    @Override
    public void sayGoodBye(String name) {
        System.out.println("Good bye " + name );
    }
    // Concrete method of the abstract methods

}
