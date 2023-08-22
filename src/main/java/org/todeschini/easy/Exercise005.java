package org.todeschini.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise005 {

    public static int secondLargest(int[] arr) {
        // Initialize firstLargest and secondLargest

        // Traverse through the array

        // Update firstLargest and secondLargest

        // Return secondLargest
        if (arr == null) {
            throw new IllegalArgumentException();
        } else {
            List<Integer> list = Arrays.stream(arr)
                    .distinct() // remove duplicatas
                    .sorted() // ordena
                    .boxed()// transforma em Stream<Integer>
                    .collect(Collectors.toList()); //

            if (arr.length < 2) {
                throw new IllegalArgumentException();
            }

            return list.size() >= 2 ? list.get(list.size() -2) : list.get(list.size() -1);
        }
    }

    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{2,3}));
    }
}
