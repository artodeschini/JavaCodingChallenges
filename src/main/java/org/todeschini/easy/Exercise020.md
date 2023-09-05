# Anagram Check - String Comparison

[code](Exercise020.java)

## Introduction

An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once. For example, "listen" and "silent" are anagrams of each other. In this challenge, you need to implement a function that determines if two provided strings are anagrams.

## Steps

1. Define a function areAnagrams that takes two strings, str1 and str2, as arguments.
2. Remove all white spaces from both strings and convert them to lower case.
3. If the lengths of the strings are different, return false since they cannot be anagrams.
4. If the lengths are the same, sort the characters in both strings.
5. Compare the sorted strings. If they are the same, return true. Otherwise, return false.

## Requirements

1. The function areAnagrams should be defined in the Exercise020 class.
2. The function areAnagrams should return a boolean indicating whether the two strings are anagrams.

Input: Two strings str1 and str2.
Output: A boolean value. True if the strings are anagrams, false otherwise.

## Examples

Exercise020.areAnagrams("Listen", "Silent"); // Returns true
Exercise020.areAnagrams("Hello", "World"); // Returns false
Exercise020.areAnagrams("School master", "The classroom"); // Returns true 

## Constraints:

The strings can be empty, contain a single character, or multiple characters.
The strings are case-insensitive, "Listen" and "silent" would be considered the same.

Expected Time Complexity: O(n log n), where n is the length of the string. The dominant factor here is the time complexity of the sorting function.
Expected Auxiliary Space: O(n), as we are converting the input string to a char array.

Hint: You can solve this problem by sorting the characters in both strings and then comparing them. If both sorted strings are equal, then they are anagrams of each other.

Note: This method ignores white spaces and is case-insensitive, meaning "Listen" and "silent" would be considered the same. If you want the method to be case-sensitive or to consider spaces, you should modify the method accordingly.
