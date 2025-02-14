package com.capgemini.throw_vs_throws;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionPropagationTest {

    @Test
    void calculateInterestTest1(){
        assertThrows(IllegalArgumentException.class, ()-> ExceptionPropagation.calculateInterest(-7000,8,9));
    }

    @Test
    void calculateInterestTest2(){
        assertEquals(3920,ExceptionPropagation.calculateInterest(7000, 7, 8));
    }
}
