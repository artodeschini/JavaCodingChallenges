package org.todeschini.easy;

public class Exercise004 {

    public static String reverseString(String str){
        // Use the StringBuilder's reverse method to reverse str
        // your code here
        StringBuilder sb = new StringBuilder(str);

        return str != null ? sb.reverse().toString() : str;
    }
}
