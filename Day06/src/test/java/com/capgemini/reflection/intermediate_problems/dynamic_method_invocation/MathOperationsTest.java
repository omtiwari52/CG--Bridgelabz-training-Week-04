package com.capgemini.reflection.intermediate_problems.dynamic_method_invocation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationsTest {

    private MathOperations mathOps;

    @BeforeEach
    void setUp() {
        mathOps = new MathOperations();
    }

    @Test
    void testAddMethodInvocation() throws Exception {
        Method method = mathOps.getClass().getMethod("add", int.class, int.class);
        int result = (int) method.invoke(mathOps, 5, 3);
        assertEquals(8, result);
        System.out.println("✅ Test1 Passed");
    }

    @Test
    void testSubtractMethodInvocation() throws Exception {
        Method method = mathOps.getClass().getMethod("subtract", int.class, int.class);
        int result = (int) method.invoke(mathOps, 10, 4);
        assertEquals(6, result, "Subtraction method failed");
        System.out.println("✅ Test2 Passed");
    }

    @Test
    void testMultiplyMethodInvocation() throws Exception {
        Method method = mathOps.getClass().getMethod("multiply", int.class, int.class);
        int result = (int) method.invoke(mathOps, 6, 7);
        assertEquals(42, result, "Multiplication method failed");
        System.out.println("✅ Test3 Passed");
    }
}