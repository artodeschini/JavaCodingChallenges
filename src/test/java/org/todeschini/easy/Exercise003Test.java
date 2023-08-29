package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise003Test {

    @Test
    void stringLengthEmptyString() {
        assertEquals(Exercise003.stringLength(""),0);
    }

    @Test
    void stringLengthVogais() {
        assertEquals(Exercise003.stringLength("aeiou"),5);
    }

    @Test
    void stringLengthNull() {
        assertEquals(Exercise003.stringLength(null),0);
    }
}