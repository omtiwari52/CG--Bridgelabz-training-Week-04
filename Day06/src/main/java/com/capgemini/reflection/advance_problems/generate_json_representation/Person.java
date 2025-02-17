package com.capgemini.reflection.advance_problems.generate_json_representation;

import java.security.PublicKey;

public class Person {
    private String name;
    private int age;
    private boolean accessible;

    public Person(String name, int age, boolean accessible) {
        this.name = name;
        this.age = age;
        this.accessible = accessible;
    }

    @Override
    public String toString(){
        return "Person: " + name +" ,Age: " + age + ",Accessible: " + accessible;
    }
}
