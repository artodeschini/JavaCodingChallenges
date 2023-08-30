package org.todeschini.easy;

import java.util.Arrays;

public class Exercise013 {

    public static void separateZeroAndOne(int[] arr){
        // Initialize a counter for 0's
        // Your code here

        // Traverse the array and count the number of 0's
        // Your code here

        // Fill the first 'n' indices of the array with 0's
        // Your code here

        // Fill the rest of the array with 1's
        // Your code here
        Arrays.sort(arr);
    }

    public static void separateZeroAndOneOther(int[] arr){
        int counter = 0;  // counter for 0's

        // Traverse the array and count the number of 0'
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                counter++;
            }
        }

        // Fill the first 'n' indices of the array with 0's
        for(int i = 0; i < counter; i++){
            arr[i] = 0;
        }

        // Fill the rest of the array with 1's
        for(int i = counter; i < arr.length; i++){
            arr[i] = 1;
        }

    }
}
