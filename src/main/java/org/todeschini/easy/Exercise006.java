package org.todeschini.easy;

import java.util.stream.LongStream;

public class Exercise006 {

    public static long factorial(int n) {
        // Check if n is less than 0. If so, throw an exception
        if (n < 0) {
            throw new IllegalArgumentException();
        } else {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return LongStream.rangeClosed(2, n).reduce(1, (x, y) -> x * y);
            }
        }
        // Check if n is 0 or 1. If so, return 1

        // Otherwise, return n multiplied by the factorial of n-1
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
