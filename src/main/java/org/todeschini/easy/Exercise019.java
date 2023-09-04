package org.todeschini.easy;

import java.util.stream.IntStream;

public class Exercise019 {
    public static boolean isPalindrome(String str){
        // compare the characters from both ends of the string towards the middle
        // your code here

        // return true if the string is a palindrome, false otherwise
        // your code here
        //return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
        int start = 0;
        int end = str.length() -1;

        str = str.toLowerCase();

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static boolean isPalindromeWithStringBuilder(String str){
        // compare the characters from both ends of the string towards the middle
        // your code here

        // return true if the string is a palindrome, false otherwise
        // your code here
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }


    public static boolean isPalindromeWithStream(String str) {
        // compare the characters from both ends of the string towards the middle
        // your code here

        // return true if the string is a palindrome, false otherwise
        // your code here
        return str.equalsIgnoreCase(IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(str.length() - i - 1))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString());
    }
}
