package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise030Test {

    @Test
    public void testCheckEvenOrOddEvenNumber() {
        assertEquals("Even", Exercise030.checkEvenOrOdd(2));
    }

    @Test
    public void testCheckEvenOrOddOddNumber() {
        assertEquals("Odd", Exercise030.checkEvenOrOdd(1));
    }

    @Test
    public void testCheckEvenOrOddZero() {
        assertEquals("Even", Exercise030.checkEvenOrOdd(0));
    }

    @Test
    public void testCheckEvenOrOddNegativeNumber() {
        assertEquals("Even", Exercise030.checkEvenOrOdd(-2));
    }

}