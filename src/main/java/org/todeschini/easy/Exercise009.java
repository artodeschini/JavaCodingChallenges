package org.todeschini.easy;

public class Exercise009 {
    public static int countDigits(int number){
        // calculate the count of digits in number
        // your code here

        // return the count of digits
        // your code here
        return (int) Math.floor( (number != 0 ? Math.log10(Math.abs(number)) : 0) + 1);
    }

    public static void main(String[] args) {
        System.out.println(countDigits(0));
    }
}
