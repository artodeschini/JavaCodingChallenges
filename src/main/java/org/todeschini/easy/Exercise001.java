package org.todeschini.easy;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Exercise001 {
    public static int findSmallestElementWithStream(int[] arr){
        IntStream intStream = Arrays.stream(arr);

        OptionalInt min = intStream.min();

        return min.isPresent() ? min.getAsInt() : Integer.MAX_VALUE;
    }

    public static int findSmallestElement(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        for (int i :arr) {
            if ( i < smallest ) {
                smallest = i;
            }
        }
        return smallest;
    }
}
