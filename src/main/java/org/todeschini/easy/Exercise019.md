# Palindrome Check - String Verification

[code](Exercise019.java)

## Introduction

A palindrome is a word, number, phrase, or other sequences of characters that reads the same backward as forward, disregarding spaces, punctuation, and capitalization. In this challenge, you are tasked with implementing a function that determines whether a given string is a palindrome.

## Steps

1. Define a function isPalindrome that takes a string str as an argument.
2. Create two pointer variables, start and end. Initialize start to the first index (0) and end to the last index (string length - 1).
3. If the characters at start and end indexes are not equal, return false.
4. Increment start by 1 and decrement end by 1.
5. Repeat steps 3 and 4 until start is greater than or equal to end.
6. If the function has not returned false during the loop, return true, as the string is a palindrome.

## Requirements

1. The function isPalindrome should be defined in the Exercise class.
2. The function isPalindrome should return a boolean indicating whether the string is a palindrome.

Input: A string str.
Output: A boolean value. True if the string is a palindrome, false otherwise.

## Examples

Exercise019.isPalindrome("radar"); // Returns true
Exercise019.isPalindrome("java"); // Returns false
Exercise019.isPalindrome("a"); // Returns true

## Constraints

The string can be empty, contain a single character, or multiple characters.
The string is case-sensitive, "Radar" is not considered a palindrome.
Expected Time Complexity: O(n), where n is the length of the string.
Expected Auxiliary Space: O(1), as the check is done in-place, no extra space is used.

Hint: Use two-pointer technique to traverse from both ends towards the middle of the string. If at any point the characters at both pointers do not match, the string is not a palindrome.
Note: This method is case-sensitive, meaning "Radar" and "radar" would not be considered the same. If you want the method to be case-insensitive, consider converting the entire string to lower case before checking.
