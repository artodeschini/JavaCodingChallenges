package org.todeschini.easy;

import java.util.Arrays;

public class Exercise020 {

    public static boolean areAnagrams(String str1, String str2){
        // your code here
        char[] chars1 = str1.replaceAll("\\s+", "").toLowerCase().toCharArray();
        char[] chars2 = str2.replaceAll("\\s+", "").toLowerCase().toCharArray();

        if (chars1.length != chars2.length) {
            return false;
        }

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        //return String.valueOf(chars1).equals(String.valueOf(chars2));
        return Arrays.equals(chars1, chars2);
    }
}
