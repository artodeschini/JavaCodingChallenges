package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise032Test {

    @Test
    void testFizzBuzzOutput() {
        var s = Exercise032.printFizzBuzz(0);
        assertEquals(s, "");
    }

    @Test
    void testFizzBuzzOutput15() {
        var s = Exercise032.printFizzBuzz(15);
        var e = new StringBuilder("12")
                .append(Exercise032.FIZZ)
                .append("4")
                .append(Exercise032.BUZZ)
                .append(Exercise032.FIZZ)
                .append("78")
                .append(Exercise032.FIZZ)
                .append(Exercise032.BUZZ)
                .append("11")
                .append(Exercise032.FIZZ)
                .append("1314")
                .append(Exercise032.FIZZ_BUZZ)
                .toString();
        for (int i = 0; i < s.length() ; i++) {
            assertEquals(s.charAt(i), e.charAt(i));
        }
    }
    // 1
// 2
// Fizz
// 4
// Buzz
// Fizz
// 7
// 8
// Fizz
// Buzz
// 11
// Fizz
// 13
// 14
// FizzBuzz

}