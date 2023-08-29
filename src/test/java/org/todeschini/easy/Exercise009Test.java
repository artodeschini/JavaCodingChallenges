package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise009Test {

    @Test
    void testCountDigitsPositiveNumber() {
        assertEquals(Exercise009.countDigits(1000), 4);
    }

    @Test
    void testCountDigitsZero() {
        assertEquals(Exercise009.countDigits(0), 1);
    }

    @Test
    void testCountDigitsNegativeNumber() {
        assertEquals(Exercise009.countDigits(-123), 3);
    }

    @Test
    void testCountDigitsSingleDigitNumber() {
        assertEquals(Exercise009.countDigits(9), 1);
    }
}