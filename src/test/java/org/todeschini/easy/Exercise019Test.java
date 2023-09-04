package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise019Test {

    @Test
    void testPalindromeSingleCharacter() {
        assertTrue(Exercise019.isPalindrome("A"));
        assertTrue(Exercise019.isPalindromeWithStringBuilder("A"));
        assertTrue(Exercise019.isPalindromeWithStream("A"));
    }

    @Test
    void testNonPalindrome() {
        assertFalse(Exercise019.isPalindrome("uva"));
        assertFalse(Exercise019.isPalindromeWithStringBuilder("uva"));
        assertFalse(Exercise019.isPalindromeWithStream("uva"));
    }

    @Test
    void testPalindrome() {
        assertTrue(Exercise019.isPalindrome("ovo"));
        assertTrue(Exercise019.isPalindromeWithStringBuilder("ovo"));
        assertTrue(Exercise019.isPalindromeWithStream("ovo"));
    }
}