package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise023Test {

    @Test
    void testNegativeKilometers() {
        assertEquals(-0.621371, Exercise023.kilometersToMiles(-1));
    }

    @Test
    void testConversion() {
        assertEquals(6.21371, Exercise023.kilometersToMiles(10));
    }

    @Test
    void testZeroKilometers() {
        assertEquals(0.0, Exercise023.kilometersToMiles(0));
    }
}