package org.todeschini.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise018 {

    public static int[] reverseArray(int[] arr){
        // reverse the elements in the array without using a temporary array or built-in method
        // your code here
        for(int i = 0; i < arr.length / 2; i++) {
            // Swapping the elements
            int j = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = j;
        }

        // return the reversed array
        // your code here
        return arr;
    }

    public static int[] reverseArrayWithStream(int[] arr){
        // reverse the elements in the array without using a temporary array or built-in method
        // your code here
        return IntStream.range(0, arr.length)
                .map(i -> arr[arr.length - i - 1])
                .toArray();
    }

    public static int[] reverseArrayWithCollection(int[] arr) {
        List<Integer> inteiros = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.reverse(inteiros);
        return inteiros.stream().mapToInt(i -> i).toArray();
    }
}
