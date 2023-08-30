# Counting Vowels - String Operations

[code](Exercise002.java)

## Introduction: In this challenge, you are to implement a function named countVowels that calculates the number of vowels in a given string. Vowels in the English language are the characters 'a', 'e', 'i', 'o', 'u' (in both lowercase and uppercase).

## Steps:

1. Define a function countVowels that accepts a string as its argument.
2. Initialize a counter to zero. This will keep track of the number of vowels in the string.
3. Iterate over each character of the string:
4. In each iteration, check if the current character is a vowel (i.e., 'a', 'e', 'i', 'o', 'u' in either lowercase or uppercase). If so, increment the counter.
5. After iterating through all characters, return the counter.

## Requirements:

1. The function countVowels should be defined in the Exercise002 class.
2. The function countVowels should return an integer indicating the number of vowels in the input string.

Input: A string str (1 ≤ |str| ≤ 10^5) consisting of printable ASCII characters.
Output: An integer representing the number of vowels in str.

## Examples:

Exercise002.countVowels("aeiou"); // Returns 5
Exercise002.countVowels("bcdfg"); // Returns 0
Exercise002.countVowels("Hello World!"); // Returns 3
Exercise002.countVowels(""); // Returns 0

Constraints: str can contain any printable ASCII characters. The number of characters in str (|str|) does not exceed 10^5.

Expected Time Complexity: O(n), where n is the length of the input string.
Expected Auxiliary Space: O(1), constant space complexity is expected as we're not using extra space proportional to input size.

Hint: Consider utilizing a String that contains all the vowels and the indexOf function to check if a character is a vowel.

Note: The function should be case-insensitive, meaning it treats uppercase and lowercase vowels as the same.
