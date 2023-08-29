package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise010Test {

    @Test
    void testNthFibonacciLargeNumber() {
        assertEquals(12586269025L, Exercise010.nthFibonacci(50));
    }

    @Test
    void testNthFibonacciSmallNumber() {
        assertEquals(1, Exercise010.nthFibonacci(2));
    }

    @Test
    void testNthFibonacciMediumNumber() {
        assertEquals(6765, Exercise010.nthFibonacci(20));
    }

    @Test
    void testNthFibonacciLargeNumberStream() {
        assertEquals(12586269025L, Exercise010.nthFibonacciWithStream(50));
    }

    @Test
    void testNthFibonacciSmallNumberStream() {
        assertEquals(1, Exercise010.nthFibonacciWithStream(2));
    }

    @Test
    void testNthFibonacciMediumNumberStream() {
        assertEquals(6765, Exercise010.nthFibonacciWithStream(20));
    }
}