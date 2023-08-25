# Toggle Case of Characters - String Operations

[code](Exercise011.java)

## Introduction

In this challenge, you are required to create a function toggleCase that will toggle the case of each character in the provided string. This exercise enhances your understanding of string manipulation methods in Java.

## Steps

1. Define the function toggleCase that takes a string s as input.
2. Create a new StringBuilder object, toggledString.
3. Iterate through each character in the string s.
4. Check if the current character is lowercase using Character.isLowerCase(), if it is, append the uppercase version of the character to toggledString using Character.toUpperCase().
5. If the character is not lowercase, it means it's either an uppercase letter or a non-alphabetic character, in that case, append the lowercase version of the character to toggledString using Character.toLowerCase().
6. After iterating through all the characters, return the string representation of toggledString.

## Requirements

1. The function toggleCase should be defined in the Exercise class.
2. The function toggleCase should return a String, the input string with the case of each character toggled.

Input: A string s (0 ≤ s.length ≤ 1000).
Output: A string, the input string s with the case of each character toggled.

## Examples

Exercise.toggleCase("hello"); // Returns "HELLO"
Exercise.toggleCase("WORLD"); // Returns "world"
Exercise.toggleCase("Hello World"); // Returns "hELLO wORLD"
Exercise.toggleCase(""); // Returns ""
Constraints: The input string s will contain only ASCII characters and its length will be in the range from 0 to 1000.

Expected Time Complexity: O(n), where n is the length of the input string.

Expected Auxiliary Space: O(n), where n is the length of the input string.

## Hint

Utilize the Character.isLowerCase(), Character.toUpperCase(), and Character.toLowerCase() methods in Java for this task.

```code
Character.isLetter(c) ? c ^ ' ' : c
```

Note: In the case of non-alphabetic characters, the Character.toLowerCase() method will return the character itself.
