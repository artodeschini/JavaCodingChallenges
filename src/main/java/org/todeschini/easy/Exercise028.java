package org.todeschini.easy;

public class Exercise028 {

    public static int[] swapNumbers(int a, int b){
        // add both numbers and assign to a
        // your code here

        // subtract b from a and assign to b
        // your code here

        // subtract b from a and assign to a
        // your code here

        // return swapped numbers
        // your code here
        a = a + b;
        b = a - b;
        a = a - b;

        return new int[]{a, b};
    }
}
