package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise005Test {

    @Test
    void secondLargestWithNullArray() {
        assertThrows(IllegalArgumentException.class, () -> Exercise005.secondLargest(null));
    }

    @Test
    void secondLargestWithArrayNoOneElement() {
        assertThrows(IllegalArgumentException.class, () -> Exercise005.secondLargest(new int[] {}));
    }

    @Test
    void secondLargestWithArrayOneElement() {
        assertThrows(IllegalArgumentException.class, () -> Exercise005.secondLargest(new int[] {1}));
    }

    @Test
    void secondLargestWithArrayDuplicateElement() {
        assertEquals(1, Exercise005.secondLargest(new int[] {1,1}));
    }

    @Test
    void secondLargestWithArrayDiferenteElement() {
        assertEquals(1, Exercise005.secondLargest(new int[] {1,2}));
    }

    @Test
    void secondLargestWithArrayDiferenteMoreThenTwo() {
        assertEquals(5, Exercise005.secondLargest(new int[] {1,2,3,4,5,6}));
    }
}