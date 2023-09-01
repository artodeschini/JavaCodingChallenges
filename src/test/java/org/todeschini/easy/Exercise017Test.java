package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise017Test {

    @Test
    void testPowerNegativeExponent(){
        assertEquals(0.125, Exercise017.power(2, -3));
        assertEquals(0.125, Exercise017.powerMath(2, -3));
    }

    @Test
    void testPowerZeroExponent() {
        assertEquals(0.0, Exercise017.power(0, 2));
        assertEquals(0.0, Exercise017.powerMath(0, 2));
    }

    @Test
    void testPowerPositiveExponent(){
        assertEquals(8.0, Exercise017.power(2, 3));
        assertEquals(8.0, Exercise017.powerMath(2, 3));
    }

    @Test
    void testPowerFractionBase() {
        assertEquals(-8.0, Exercise017.power(-2, 3));
        assertEquals(-8.0, Exercise017.powerMath(-2, 3));
    }
}