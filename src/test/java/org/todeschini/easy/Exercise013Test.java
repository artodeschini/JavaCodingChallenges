package org.todeschini.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exercise013Test {

    @Test
    void testSeparateZeroAndOne1() {
        int[] arr = {1};
        Exercise013.separateZeroAndOne(arr);

        assertArrayEquals(arr, new int[] {1});
    }

    @Test
    void testSeparateZeroAndOne1Other() {
        int[] arr = {1};
        Exercise013.separateZeroAndOneOther(arr);

        assertArrayEquals(arr, new int[] {1});
    }

    @Test
    void testSeparateZeroAndOne2() {
        int[] arr = {0, 1, 0, 1, 1, 0, 1, 0};
        Exercise013.separateZeroAndOne(arr); // arr1 becomes {0, 0, 0, 0, 1, 1, 1, 1}

        assertArrayEquals(arr, new int[] {0, 0, 0, 0, 1, 1, 1, 1});
        int[] arr2 = {1, 0, 1, 0, 1, 0, 1, 0};
        Exercise013.separateZeroAndOne(arr2); // arr2 becomes {0, 0, 0, 0, 1, 1, 1, 1}
    }

    @Test
    void testSeparateZeroAndOne2Other() {
        int[] arr = {0, 1, 0, 1, 1, 0, 1, 0};
        Exercise013.separateZeroAndOneOther(arr); // arr1 becomes {0, 0, 0, 0, 1, 1, 1, 1}

        assertArrayEquals(arr, new int[] {0, 0, 0, 0, 1, 1, 1, 1});
        int[] arr2 = {1, 0, 1, 0, 1, 0, 1, 0};
        Exercise013.separateZeroAndOne(arr2); // arr2 becomes {0, 0, 0, 0, 1, 1, 1, 1}
    }

    @Test
    void testSeparateZeroAndOne3() {
        int[] arr = {0, 0, 0, 0, 1, 1, 1, 1};
        Exercise013.separateZeroAndOne(arr); // arr1 becomes {0, 0, 0, 0, 1, 1, 1, 1}

        assertArrayEquals(arr, new int[] {0, 0, 0, 0, 1, 1, 1, 1});
    }
}