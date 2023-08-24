package org.todeschini.easy;

public class Exercise008 {

    public static int[] swapNumbers(int a, int b){
        // swap a and b without using a temporary variable
        // your code here

        // return the swapped numbers
        // your code here
        // int[] arr = new int[2];
        // arr[0] = b;
        // arr[1] = a;

        a = a + b;
        b = a - b;
        a = a - b;

        return new int[]{a, b};
    }

    public static void main(String[] args) {
        System.out.println(swapNumbers(3,4));
    }

}
