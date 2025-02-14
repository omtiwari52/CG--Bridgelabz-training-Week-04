package com.capgemini.finally_block_execution;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FinallyBlockExecutionTest {

    @Test
    void testValidDivision() {
        assertEquals(5, FinallyBlockExecution.resultCalculate(10, 2));
        assertEquals(-3, FinallyBlockExecution.resultCalculate(-9, 3));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> FinallyBlockExecution.resultCalculate(10,0));
    }
}