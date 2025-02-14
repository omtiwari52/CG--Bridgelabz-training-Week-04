package com.capgemini.unchecked_exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivideNumbersAndHandleExceptionTest {

    @Test
    void divideNumbersTest1(){
        assertEquals(2, DivideNumbersAndHandleException.divideTwoNumbers(4,2));
    }

    @Test
    void divideNumbersTest2(){
        assertThrows(ArithmeticException.class,()-> DivideNumbersAndHandleException.divideTwoNumbers(2,0));
    }
}
