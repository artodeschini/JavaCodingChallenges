package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise021Test {

    @Test
    void testTargetNotInArray() {
        assertArrayEquals(new int[]{-1, -1}, Exercise021.findFirstAndLast(new int[]{1, 2, 3}, 0));
        assertArrayEquals(new int[]{-1, -1}, Exercise021.findFirstAndLastwithSteam(new int[]{1, 2, 3}, 0));
    }

    @Test
    void testTargetIsOnlyElement() {
        assertArrayEquals(new int[]{0, 0}, Exercise021.findFirstAndLast(new int[]{0}, 0));
        assertArrayEquals(new int[]{0, 0}, Exercise021.findFirstAndLastwithSteam(new int[]{0}, 0));
    }

    @Test
    void testTargetInArray() {
        assertArrayEquals(new int[]{0, 4}, Exercise021.findFirstAndLast(new int[]{0, 1, 2, 3, 0}, 0));
        assertArrayEquals(new int[]{0, 4}, Exercise021.findFirstAndLastwithSteam(new int[]{0, 1, 2, 3, 0}, 0));
    }

}