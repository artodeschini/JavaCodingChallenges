package org.todeschini.easy;

public class Exercise012 {
    public static int countDigitFrequency(long number, int digit){
        // Initialize count to 0
        // your code here

        // Use a while loop to iterate through each digit in the number
        // your code here

        // Return the count
        // your code here
        int count = 0;
        while (number > 0) {
            if (number % 10 == digit) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
}
