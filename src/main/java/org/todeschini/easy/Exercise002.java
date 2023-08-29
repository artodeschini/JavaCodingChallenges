package org.todeschini.easy;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise002 {

    static Pattern VOWELS_PATTERN = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);

    public static int countVowels(String str){
        // Initialize the counter to 0
        // your code here

        // Iterate through each character of the string
        // your code here

        // If the character is a vowel, increment the counter
        // your code here

        // Return the counter
        // your code here
        int count = 0;
        Matcher m = VOWELS_PATTERN.matcher(str);
        while (m.find()) {
            count++;
        }
        return count;
    }

    public static int countVowelsWithStream(String str){
        int count = Arrays.asList(str).stream()
                .map(s -> s.replaceAll("[aeiou]", "").length())
                .reduce(0, Integer::sum);
//        return Arrays.asList(str).stream()
//                .map(s -> s.replaceAll("[aeiou]", "").length())
//                .reduce(0, Integer::sum);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Emanuelle"));
        System.out.println(countVowelsWithStream("Emanuelle"));
    }
}
