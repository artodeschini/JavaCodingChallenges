package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise014Test {

    @Test
    void testSeparateEvenOddEmpty() {
        assertArrayEquals(new int[]{}, Exercise014.separateEvenOdd(new int[] {}));
    }

    @Test
    void testSeparateEvenOddMixed() {
        assertArrayEquals(new int[]{6,2,4,3,5,1}, Exercise014.separateEvenOdd(new int[] {1,2,3,4,5,6}));
    }

    @Test
    void testSeparateEvenOddAllOdd() {
        assertArrayEquals(new int[]{1,3,5,7}, Exercise014.separateEvenOdd(new int[] {1,3,5,7}));
    }

    @Test
    void testSeparateEvenOddAllEven() {
        assertArrayEquals(new int[]{2,4,6,8}, Exercise014.separateEvenOdd(new int[] {2,4,6,8}));
    }
}