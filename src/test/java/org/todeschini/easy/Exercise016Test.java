package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise016Test {

    @Test
    void testSumOfExtremesPositive() {
        assertEquals(10, Exercise016.sumOfExtremes(new int[] { 1,2,3,4,5,6,7,8,9}));
    }

    @Test
    void testSumOfExtremesPositiveWithStream() {
        assertEquals(10, Exercise016.sumOfExtremesWithStream(new int[] { 1,2,3,4,5,6,7,8,9}));
    }

    @Test
    void testSumOfExtremesNegative() {
        assertEquals(-6, Exercise016.sumOfExtremes(new int[] { -5,-4,-3,-2,-1}));
    }

    @Test
    void testSumOfExtremesNegativeWithStream() {
        assertEquals(-6, Exercise016.sumOfExtremesWithStream(new int[] { -5,-4,-3,-2,-1}));
    }

    @Test
    void testSumOfExtremesMixed() {
        assertEquals(0, Exercise016.sumOfExtremes(new int[] { -5, -3, 2, 4, 5}));
    }

    @Test
    void testSumOfExtremesMixedWithStream() {
        assertEquals(0, Exercise016.sumOfExtremesWithStream(new int[] { -5, -3, 2, 4, 5}));
    }

    @Test
    void testSumOfExtremesSingleElement() {
        assertEquals(0, Exercise016.sumOfExtremes(new int[] { Integer.MIN_VALUE, Integer.MIN_VALUE}));
    }

    @Test
    void testSumOfExtremesSingleElementWithStream() {
        assertEquals(0, Exercise016.sumOfExtremesWithStream(new int[] { Integer.MIN_VALUE, Integer.MIN_VALUE}));
    }
}