package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise018Test {

    @Test
    public void testReverseArrayEmpty() {
        assertArrayEquals(new int[]{}, Exercise018.reverseArray(new int[]{}));
        assertArrayEquals(new int[]{}, Exercise018.reverseArrayWithStream(new int[]{}));
        assertArrayEquals(new int[]{}, Exercise018.reverseArrayWithCollection(new int[]{}));
    }

    @Test
    public void testReverseArrayLengthFive() {
        assertArrayEquals(new int[]{5,4,3,2,1}, Exercise018.reverseArray(new int[]{1,2,3,4,5}));
        assertArrayEquals(new int[]{5,4,3,2,1}, Exercise018.reverseArrayWithStream(new int[]{1,2,3,4,5}));
        assertArrayEquals(new int[]{5,4,3,2,1}, Exercise018.reverseArrayWithCollection(new int[]{1,2,3,4,5}));
    }

    @Test
    public void testReverseArrayLengthOne() {
        assertArrayEquals(new int[]{1}, Exercise018.reverseArray(new int[]{1}));
        assertArrayEquals(new int[]{1}, Exercise018.reverseArrayWithStream(new int[]{1}));
        assertArrayEquals(new int[]{1}, Exercise018.reverseArrayWithCollection(new int[]{1}));
    }
}