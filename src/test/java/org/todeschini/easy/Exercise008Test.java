package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise008Test {

    @Test
    void testSwapNumbersZero() {
        int[] atual = Exercise008.swapNumbers(0,0);
        assertEquals(0, atual[0]);
        assertEquals(0, atual[1]);
    }

    @Test
    void testSwapNumbersPositive() {
        int[] atual = Exercise008.swapNumbers(1,2);
        assertEquals(2, atual[0]);
        assertEquals(1, atual[1]);
    }

    @Test
    void testSwapNumbersNegative() {
        int[] atual = Exercise008.swapNumbers(-1,-2);
        assertEquals(-2, atual[0]);
        assertEquals(-1, atual[1]);
    }

    @Test
    void testSwapNumbersEqual() {
        int[] atual = Exercise008.swapNumbers(1,1);
        assertEquals(1, atual[0]);
        assertEquals(1, atual[1]);
    }
}