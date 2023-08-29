package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise007Test {

    @Test
    void testRemoveSpaces() {
        assertEquals("a", Exercise007.removeSpaces("a "));
    }

    @Test
    void testRemoveSpacesWithLeadingAndTrailingSpaces() {
        assertEquals("a", Exercise007.removeSpaces(" a "));
    }

    @Test
    void testRemoveSpacesWithMultipleSpaces() {
        assertEquals("aeiou", Exercise007.removeSpaces(" a    e   i    o   u "));
    }
}