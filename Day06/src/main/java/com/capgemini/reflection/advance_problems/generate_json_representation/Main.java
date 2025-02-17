package com.capgemini.reflection.advance_problems.generate_json_representation;

import static com.capgemini.reflection.advance_problems.generate_json_representation.JsonConvertor.toJson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Harshveer",25,true);
        String json = toJson(person);

        System.out.println(json);
    }
}
