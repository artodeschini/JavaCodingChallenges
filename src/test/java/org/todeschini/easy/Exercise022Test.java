package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise022Test {

    @Test
    void testAreaWithNegative() {
        assertEquals(-1, new Exercise022.Rectangle(1,-1).area());
    }

    @Test
    void testArea() {
        assertEquals(20, new Exercise022.Rectangle(4,5).area());
    }

    @Test
    void testAreaWithZero() {
        assertEquals(0, new Exercise022.Rectangle(0,5).area());
    }
}