package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise012Test {

    @Test
    void testCountDigitFrequency1() {
        assertEquals(1, Exercise012.countDigitFrequency(12345, 1));
    }

    @Test
    void testCountDigitFrequency2() {
        assertEquals(1, Exercise012.countDigitFrequency(23456, 5));
    }

    @Test
    void testCountDigitFrequency3() {
        assertEquals(0, Exercise012.countDigitFrequency(12345, 6));
    }

    @Test
    void testCountDigitFrequency5() {
        assertEquals(5, Exercise012.countDigitFrequency(11111, 1));
    }
}