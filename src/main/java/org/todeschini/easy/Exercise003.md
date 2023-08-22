# Calculating String Length - String Operations

[code](Exercise003.java)

## Introduction

In this challenge, you will implement a function named stringLength that calculates the length of a given string. Java's String class provides a built-in method length() that you can use to quickly obtain the length of any string.

## Steps

1. Define a function stringLength that accepts a string as its argument.
2. Use the length() method on the string to obtain its length.
3. Return the length of the string.

## Requirements

1. The function stringLength should be defined in the Exercise class.
2. The function stringLength should return an integer indicating the length of the input string.

Input: A string str (1 ≤ |str| ≤ 10^5) consisting of printable ASCII characters.
Output: An integer representing the length of str.

## Examples

Exercise.stringLength("Hello"); // Returns 5
Exercise.stringLength(""); // Returns 0
Exercise.stringLength("   "); // Returns 3
Exercise.stringLength("!@#$"); // Returns 4
Constraints: str can contain any printable ASCII characters. The number of characters in str (|str|) does not exceed 10^5.

Expected Time Complexity: O(1), as the length() function is a constant time operation.

Expected Auxiliary Space: O(1), constant space complexity is expected as we're not using extra space proportional to input size.

Hint: Remember that in Java, you can use the length() method of the String class to get the length of any string.

Note: The function should consider spaces and special characters as part of the length.