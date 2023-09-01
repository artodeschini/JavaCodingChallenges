# Counting Capital Letters - String Manipulation

[code](Exercise015.java)

## Introduction

In this challenge, you'll create a function called countCapitalLetters to count the number of capital letters in a given string. The function will traverse the string and for each character, it will check whether it is a capital letter.

## Steps

1. Define a function countCapitalLetters in the Exercise class. It accepts a string str.
2. Initialize a counter count to zero. This will keep track of the number of capital letters.
3. Traverse the string using a loop. For each character, if it is uppercase, increment the count.
4. After the loop finishes, return count.

## Requirements

1. The function countCapitalLetters should be defined in the Exercise class.
2. The function countCapitalLetters should return an integer which is the number of capital letters in the given string.

Input: A string, str.
Output: An integer, which is the count of capital letters in the string str.

## Examples

Exercise015.countCapitalLetters("HelloWorldJAVA"); // Returns 6
Exercise015.countCapitalLetters("JAVA"); // Returns 4
Exercise015.countCapitalLetters("java"); // Returns 0
Exercise015.countCapitalLetters(""); // Returns 0


The string can be of any length, including empty.
The string may contain special characters and numbers, which should not be counted as capital letters.

Expected Time Complexity: O(n), where n is the length of the input string.
Expected Auxiliary Space: O(1), as no additional space is required.

Hint: You can use Character.isUpperCase(char ch) function in Java to check whether a character is uppercase or not.

Note: This exercise helps in understanding how to traverse a string and work with individual characters in Java.
