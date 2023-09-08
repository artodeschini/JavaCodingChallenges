package org.todeschini.easy;

import java.util.stream.IntStream;

public class Exercise004 {

    public static String reverseString(String str){
        // Use the StringBuilder's reverse method to reverse str
        // your code here
        StringBuilder sb = new StringBuilder(str);

        return str != null ? sb.reverse().toString() : str;
    }

    public static String reverseStringWithStream(String str) {
        return IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(str.length() - i - 1))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }
}
