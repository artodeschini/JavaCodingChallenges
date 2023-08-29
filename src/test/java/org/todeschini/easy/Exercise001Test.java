package org.todeschini.easy;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise001Test {

    @Test
    public void testFindSmallestElementInEmptyArray() {
         assertEquals(Exercise001.findSmallestElement(new int[] {}), Integer.MAX_VALUE);
    }

    @Test
    public void testFindSmallestElementInSortedArray() {
        assertEquals(Exercise001.findSmallestElement(new int[] {1,2,3,4}), 1);
    }

    @Test
    public void testFindSmallestElementInArrayWithZero() {
        assertEquals(Exercise001.findSmallestElement(new int[] {0,1,2,3,4}), 0);
    }

    @Test
    public void testFindSmallestElementInArrayWithNegativeNumber() {
        assertEquals(Exercise001.findSmallestElement(new int[] {-1,0,1,2,3,4}), -1);
    }
}
