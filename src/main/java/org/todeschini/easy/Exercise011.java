package org.todeschini.easy;

public class Exercise011 {

    public static String toggleCase(String s){
        // Create a new StringBuilder
        // your code here

        // Iterate through each character in the string
        StringBuilder toggle = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    toggle.append(Character.toLowerCase(c));
                } else if (Character.isLowerCase(c)) {
                    toggle.append(Character.toUpperCase(c));
                } else {
                    toggle.append(c);
                }
            } else {
                toggle.append(c);
            }
        }
        // your code here

        // Return the string representation of toggledString
        // your code here
        return toggle.toString();
    }

    public static String toggleCaseWithStream(String s){
        // String.chars transform in IntStream
        return s.chars()
                .map(c -> Character.isLetter(c) ? c ^ ' ' : c)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

    }
    public static void main(String[] args) {
        System.out.println(toggleCase("InverRter MaisUlas Por MINUSCulas"));
        System.out.println(toggleCaseWithStream("InverRter MaisUlas Por MINUSCulas"));
    }
}
