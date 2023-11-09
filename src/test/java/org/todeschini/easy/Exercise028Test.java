package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise028Test {

    @Test
    public void testSwapNumbers1() {
        assertArrayEquals(Exercise028.swapNumbers(1,2), new int[] {2,1});
    }

    @Test
    public void testSwapNumbers2() {
        assertArrayEquals(Exercise028.swapNumbers(2,3), new int[] {3,2});
    }

    @Test
    public void testSwapNumbers3() {
        assertArrayEquals(Exercise028.swapNumbers(3,4), new int[] {4,3});
    }


    @Test
    public void testSwapNumbers4() {
        assertArrayEquals(Exercise028.swapNumbers(4,4), new int[] {4,4});
    }

}