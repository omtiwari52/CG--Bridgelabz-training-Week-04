package com.capgemini.reflection.basic_problems.access_private_field;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            //get user input for age
            System.out.print("Enter initial age: ");
            int age = Integer.parseInt(br.readLine());

            //create an instance of person
            Person person = new Person(age);

            //display age before modification
            System.out.print("Before modification ");
            person.displayAge();

            //Get class object
            Class<?> personClass = person.getClass();

            //Access private field age of person
            Field agefield = personClass.getDeclaredField("age");

            //allow modification to private field
            agefield.setAccessible(true);

            //again get value for age to modified
            System.out.print("Enter modified age: ");
            age = Integer.parseInt(br.readLine());

            //modify value of private field age
            agefield.set(person,age);

            //retrieve the modified value
            int modifiedAge = (int) agefield.get(person);

            System.out.print("After modification age is: "+modifiedAge);

        } catch (NoSuchFieldException | IllegalAccessException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
