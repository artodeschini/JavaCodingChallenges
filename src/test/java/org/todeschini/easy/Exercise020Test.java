package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise020Test {

    @Test
    void testNonAnagramCaseInsensitive() {
        assertFalse(Exercise020.areAnagrams("ABC", "BCD"));
    }

    @Test
    void testAnagramCaseInsensitive() {
        assertTrue(Exercise020.areAnagrams("ABC", "cba"));
    }

    @Test
    void testAnagramWithSpacesAndCaseInsensitive() {
        assertTrue(Exercise020.areAnagrams("A BC", "cba "));
    }
}