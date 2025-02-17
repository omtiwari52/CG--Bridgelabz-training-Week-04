package com.capgemini.reflection.basic_problems.invoke_private_method;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testInvokePrivateMultiplyMethod() throws Exception {
        // Create instance of Calculator
        Calculator calculator = new Calculator();

        // Get the private method using Reflection
        Method method = calculator.getClass().getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true); // Make it accessible

        // Invoke the method with different test cases
        assertEquals(50, method.invoke(calculator, 5, 10));  // 5 * 10 = 50
        assertEquals(0, method.invoke(calculator, 0, 10));   // 0 * 10 = 0
        assertEquals(-20, method.invoke(calculator, -4, 5)); // -4 * 5 = -20
        assertEquals(25, method.invoke(calculator, -5, -5)); // -5 * -5 = 25
    }
}
