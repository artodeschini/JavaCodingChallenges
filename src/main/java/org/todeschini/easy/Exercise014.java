package org.todeschini.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise014 {

    public static int[] separateEvenOdd(int[] arr) {
        // separate even and odd numbers in the array
        // your code here

        // return the array after separating even and odd numbers
        // your code here
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            // Move left pointer until an odd number is found
            while (arr[left] % 2 == 0 && left < right)
                left++;

            // Move right pointer until an even number is found
            while (arr[right] % 2 == 1 && left < right)
                right--;

            if (left < right) {
                // Swap arr[left] and arr[right]
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return arr;
    }

    public static int[] separateEvenOddWithStream(int[] arr) {
        List<Integer> evens = Arrays.stream(arr)
                .filter(i -> i % 2 == 0)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> odds = Arrays.stream(arr)
                .filter(i -> i % 2 == 1)
                .boxed()
                .collect(Collectors.toList());


        evens.addAll(odds);
        int[] result = evens.stream().mapToInt(i->i).toArray();
        // OR
        //int[] example2 = evens.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}
