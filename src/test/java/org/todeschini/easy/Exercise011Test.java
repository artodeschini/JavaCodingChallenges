package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise011Test {

    @Test
    void testToggleCaseLowercase() {
        assertEquals("AEIOU", Exercise011.toggleCase("aeiou"));
    }

    @Test
    void testToggleCaseLowercaseStream() {
        assertEquals("AEIOU", Exercise011.toggleCase("aeiou"));
    }

    @Test
    void testToggleCaseUppercase() {
        assertEquals("aeiou", Exercise011.toggleCase("AEIOU"));
    }

    @Test
    void testToggleCaseUppercaseStream() {
        assertEquals("aeiou", Exercise011.toggleCaseWithStream("AEIOU"));
    }

    @Test
    void testToggleCaseEmpty() {
        assertEquals("", Exercise011.toggleCase(""));
    }

    @Test
    void testToggleCaseEmptyStream() {
        assertEquals("", Exercise011.toggleCaseWithStream(""));
    }

    @Test
    void testToggleCaseMixed() {
        assertEquals("aEiOu", Exercise011.toggleCase("AeIoU"));
    }

    @Test
    void testToggleCaseMixedStream() {
        assertEquals("aEiOu", Exercise011.toggleCaseWithStream("AeIoU"));
    }
}