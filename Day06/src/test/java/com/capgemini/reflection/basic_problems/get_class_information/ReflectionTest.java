package com.capgemini.reflection.basic_problems.get_class_information;

import org.testng.annotations.Test;

import java.lang.reflect.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ReflectionTest {

    @Test
    void testGetClassInfo() throws Exception {
        Class<?> cls = Class.forName("java.lang.String");
        assertNotNull(cls);

        Method[] methods = cls.getDeclaredMethods();
        assertNotNull(methods);

        Field[] fields = cls.getDeclaredFields();
        assertNotNull(fields);

        Constructor<?>[] constructors = cls.getDeclaredConstructors();
        assertNotNull(constructors);
    }
}
