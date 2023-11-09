package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise025Test {

    @Test
    void testCalculateBMIWithZeroHeight() {
        assertThrows(IllegalArgumentException.class, () -> Exercise025.calculateBMI(1, 0));
    }

    @Test
    void testCalculateBMIWithZeroWeight() {
        assertThrows(IllegalArgumentException.class, () -> Exercise025.calculateBMI(0, 1));
    }

    @Test
    void testCalculateBMICorrectValues() {
        assertEquals(26.42356982428326, Exercise025.calculateBMI(80, 1.74));
    }

    @Test
    void testCalculateBMIWithNegativeValues() {
        assertThrows(IllegalArgumentException.class, () -> Exercise025.calculateBMI(-1, -1));
    }
}