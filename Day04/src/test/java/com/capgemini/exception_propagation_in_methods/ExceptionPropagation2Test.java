package com.capgemini.exception_propagation_in_methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionPropagation2Test {

    ExceptionPropagation excep = new ExceptionPropagation(10);

    @Test
    void method2Test1(){
        assertThrows(ArithmeticException.class,()-> excep.method2());
        System.out.println("Exception occurs in method1 but handled in method2");
    }
}
