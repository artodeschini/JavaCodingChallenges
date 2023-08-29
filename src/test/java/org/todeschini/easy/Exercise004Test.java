package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise004Test {

    @Test
    void reverseString() {
        assertEquals(Exercise004.reverseString("aeiou"),"uoiea");
    }

    @Test
    void reverseStringWithStream() {
        assertEquals(Exercise004.reverseStringWithStream("aeiou"),"uoiea");
    }
}