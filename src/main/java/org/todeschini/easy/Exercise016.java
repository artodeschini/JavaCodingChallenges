package org.todeschini.easy;

import java.util.Arrays;

public class Exercise016 {

    public static int sumOfExtremes(int[] arr){
        // initialize min and max
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // traverse the array and find min and max
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return min + max;
        // return the sum of min and max
    }

    public static int sumOfExtremesWithStream(int[] arr){
        // initialize min and max
        // traverse the array and find min and max
        // return the sum of min and max

        return Arrays.stream(arr).max().getAsInt() + Arrays.stream(arr).min().getAsInt();
    }
}
