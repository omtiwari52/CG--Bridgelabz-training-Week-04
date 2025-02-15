package com.capgemini.junit_problems.calculator_problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    //test for addition
    @Test
    void addTest1(){
        assertEquals(7, Calculator.add(4,3));
        System.out.println("✅ Test1 Passed");
    }

    //test for subtraction
    @Test
    void subtractTest2(){
        assertEquals(6, Calculator.subtract(10,4));
        System.out.println("✅ Test2 Passed");
    }


    //test for addition
    @Test
    void multiplyTest3(){
        assertEquals(12, Calculator.multiply(4,3));
        System.out.println("✅ Test3 Passed");
    }

    //test for addition
    @Test
    void divisionTest4(){
        assertEquals(6, Calculator.divide(24,4));
        System.out.println("✅ Test4 Passed");
    }

    //test for addition
    @Test
    void divisionTest5(){
        assertThrows(ArithmeticException.class,()-> Calculator.divide(4,0));
        System.out.println("✅ Test5 Passed");
    }
}
