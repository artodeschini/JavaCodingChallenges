package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise006Test {

    @Test
    void factorialWithNegativeValues() {
        assertThrows(IllegalArgumentException.class, () -> Exercise006.factorial(-1));
    }

    @Test
    void factorialWithValueZero() {
        assertEquals(1, Exercise006.factorial(0));
    }

    @Test
    void factorialWithValueOne() {
        assertEquals(1, Exercise006.factorial(1));
    }

    @Test
    void factorialWithValueFive() {
        assertEquals(120, Exercise006.factorial(5));
    }
}