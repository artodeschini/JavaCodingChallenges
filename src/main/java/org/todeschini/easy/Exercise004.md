Reversing a String - String Operations
Introduction: In this challenge, you will create a function named reverseString to reverse a given string. The Java String class doesn't provide a direct method to reverse a string. However, Java's StringBuilder class comes with a reverse() function that can be used to reverse strings.

Steps:

Define a function reverseString that accepts a string as an argument.

Create a new StringBuilder object and initialize it with the input string.

Use the reverse() method on the StringBuilder object.

Convert the reversed StringBuilder back to a string with the toString() method.

Return the reversed string.

Requirements:

The function reverseString should be defined in the Exercise class.

The function reverseString should return a string that is the reverse of the input string.

Input: A string str (0 ≤ |str| ≤ 10^5) consisting of printable ASCII characters.

Output: A string that is the reverse of str.

Examples:

Exercise.reverseString("Hello"); // Returns "olleH"
Exercise.reverseString(""); // Returns ""
Exercise.reverseString("   "); // Returns "   "
Exercise.reverseString("!@#$1234"); // Returns "4321$#@!"
Constraints: str can contain any printable ASCII characters. The length of str (|str|) does not exceed 10^5.

Expected Time Complexity: O(n), where n is the length of the string. Reversing a string requires iterating through all of its characters.

Expected Auxiliary Space: O(n), as creating a new StringBuilder object requires space proportional to the length of the string.

Hint: You can use the StringBuilder class's reverse() method to reverse a string in Java. Don't forget to convert the StringBuilder back to a string with the toString() method before returning it!

Note: The function should reverse all characters in the string, including whitespaces and special characters.