package org.todeschini.easy;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Exercise001 {
    public static int findSmallestElement(int[] arr){
        IntStream intStream = Arrays.stream(arr);

        OptionalInt min = intStream.min();

        return min.isPresent() ? min.getAsInt() : Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        System.out.println(findSmallestElement(new int[] { 10,5,3,2}));
    }
}
