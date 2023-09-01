package org.todeschini.easy;

public class Exercise015 {

    public static int countCapitalLetters(String str){
        // count the number of capital letters in the string
        // your code here
        int count = 0;

        // return the count of capital letters
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        // your code here
        return count;
    }

    public static int countCapitalLettersWithStream(String str){
        // count the number of capital letters in the string
        // your code here

        // return the count of capital letters
        // your code here
        return (int) str.chars()
                .filter(c -> Character.isUpperCase(c))
                .count();
                //.map(c -> Character.isUpperCase(c) ? c ^ ' ' : c)
                //.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}
