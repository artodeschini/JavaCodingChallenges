package org.todeschini.easy;

public class Exercise003 {
    public static int stringLength(String str){
        // Use the length method to get the length of str
        // your code here
        return str != null ? str.length() : 0;
    }

    public static void main(String[] args) {
        System.out.println(stringLength("a string"));
    }
}
