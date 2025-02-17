package com.capgemini.reflection.basic_problems.get_class_information;

import java.lang.reflect.*;

public class ReflectionUtil {
    public static void getClassInfo(String className) throws ClassNotFoundException {
        Class<?> cls = Class.forName(className);
        System.out.println("Class: " + cls.getName());

        System.out.println("Methods:");
        for (Method method : cls.getDeclaredMethods()) {
            System.out.println(method);
        }

        System.out.println("----------------------------------------------------------------------");

        System.out.println("Fields:");
        for (Field field : cls.getDeclaredFields()) {
            System.out.println(field);
        }

        System.out.println("----------------------------------------------------------------------");

        System.out.println("Constructors:");
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            System.out.println(constructor);
        }
        System.out.println("----------------------------------------------------------------------");
    }
}
