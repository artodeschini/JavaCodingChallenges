package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise002Test {

    @Test
    void testCountVowelsWithEmptyString() {
        assertEquals(0, Exercise002.countVowels(""));
        assertEquals(0, Exercise002.countVowelsWithStream(""));
    }

    @Test
    void testCountVowelsWithNoVowels() {
        assertEquals(0, Exercise002.countVowels("xyz"));
//        assertEquals(0, Exercise002.countVowelsWithStream("xyz"));
    }

    @Test
    void testCountVowelsWithVowelsOnly() {
        assertEquals(5, Exercise002.countVowels("aeiou"));
//        assertEquals(5, Exercise002.countVowelsWithStream("aeiou"));
    }

    @Test
    void testCountVowelsWithMixedCharacters() {
        assertEquals(2, Exercise002.countVowels("artur"));
        //assertEquals(2, Exercise002.countVowelsWithStream("artur"));
    }
}