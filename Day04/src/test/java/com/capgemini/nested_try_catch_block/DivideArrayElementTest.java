package com.capgemini.nested_try_catch_block;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivideArrayElementTest {

    @Test
    void divideElementAtIndexTest1(){
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> DivideArrayElement.divideElementOnIndex(new int[]{1,2,3,4}, 2, 5));
    }

    @Test
    void divideElementAtIndexTest2(){
        assertEquals(1, DivideArrayElement.divideElementOnIndex(new int[]{1,2,3,4}, 2, 1));
    }

    @Test
    void divideElementAtIndexTest3(){
        assertThrows(ArithmeticException.class, ()-> DivideArrayElement.divideElementOnIndex(new int[]{1,2,3,4}, 0, 1));
    }
}
