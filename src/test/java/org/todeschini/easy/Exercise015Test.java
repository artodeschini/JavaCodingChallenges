package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise015Test {
    @Test
    void testCountCapitalLettersEmpty() {
        assertEquals(0, Exercise015.countCapitalLetters(""));
    }

    @Test
    void testCountCapitalLettersEmptyWithStream() {
        assertEquals(0, Exercise015.countCapitalLettersWithStream(""));
    }

    @Test
    void testCountCapitalLettersMixedCase() {
        assertEquals(2, Exercise015.countCapitalLetters("aEiOu"));
    }

    @Test
    void testCountCapitalLettersMixedCaseWithStream() {
        assertEquals(2, Exercise015.countCapitalLettersWithStream("aEiOu"));
    }

    @Test
    void testCountCapitalLettersAllLower() {
        assertEquals(0, Exercise015.countCapitalLetters("aeiou"));
    }

    @Test
    void testCountCapitalLettersAllLowerWithStream() {
        assertEquals(0, Exercise015.countCapitalLettersWithStream("aeiou"));
    }

    @Test
    void testCountCapitalLettersAllUpper() {
        assertEquals(5, Exercise015.countCapitalLetters("AEIOU"));
    }

    @Test
    void testCountCapitalLettersAllUppeWithStreamr() {
        assertEquals(5, Exercise015.countCapitalLettersWithStream("AEIOU"));
    }
}