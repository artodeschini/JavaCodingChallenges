
Counting Vowels - String Operations
Introduction: In this challenge, you are to implement a function named countVowels that calculates the number of vowels in a given string. Vowels in the English language are the characters 'a', 'e', 'i', 'o', 'u' (in both lowercase and uppercase).

Steps:

Define a function countVowels that accepts a string as its argument.

Initialize a counter to zero. This will keep track of the number of vowels in the string.

Iterate over each character of the string:

In each iteration, check if the current character is a vowel (i.e., 'a', 'e', 'i', 'o', 'u' in either lowercase or uppercase). If so, increment the counter.

After iterating through all characters, return the counter.

Requirements:

The function countVowels should be defined in the Exercise class.

The function countVowels should return an integer indicating the number of vowels in the input string.

Input: A string str (1 ≤ |str| ≤ 10^5) consisting of printable ASCII characters.

Output: An integer representing the number of vowels in str.

Examples:

Exercise.countVowels("aeiou"); // Returns 5
Exercise.countVowels("bcdfg"); // Returns 0
Exercise.countVowels("Hello World!"); // Returns 3
Exercise.countVowels(""); // Returns 0
Constraints: str can contain any printable ASCII characters. The number of characters in str (|str|) does not exceed 10^5.

Expected Time Complexity: O(n), where n is the length of the input string.

Expected Auxiliary Space: O(1), constant space complexity is expected as we're not using extra space proportional to input size.

Hint: Consider utilizing a String that contains all the vowels and the indexOf function to check if a character is a vowel.

Note: The function should be case-insensitive, meaning it treats uppercase and lowercase vowels as the same.

