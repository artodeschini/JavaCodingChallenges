# Check Even or Odd - Basic Conditional Statements

[code](Exercise030.java)

# Introduction

In this challenge, you will create a function called checkEvenOrOdd that checks whether a given integer is even or odd. This problem is a simple exercise in using conditional statements in Java to perform a basic check.

## Steps

* Define a function checkEvenOrOdd that takes an integer number as its parameter.
* Inside the function, use an if statement to check whether the number is divisible by 2 or not.
* If the number is divisible by 2 (i.e., number % 2 == 0), return the string "Even".
*  Otherwise, return the string "Odd".

## Requirements

* The function checkEvenOrOdd should be defined in the Exercise class.
* The function checkEvenOrOdd should return a string, either "Even" or "Odd".

Input: An integer number.
Output: A string that is either "Even" or "Odd" based on the value of the input number.

## Examples

Exercise030.checkEvenOrOdd(4); // Returns "Even"
Exercise030.checkEvenOrOdd(9); // Returns "Odd"
Exercise030.checkEvenOrOdd(0); // Returns "Even"
Exercise030.checkEvenOrOdd(-6); // Returns "Even"

## Constraints

The input number can be any integer, positive, negative, or zero.
Expected Time Complexity: O(1), as checking whether a number is even or odd is a constant time operation.
Expected Auxiliary Space: O(1), constant space complexity is expected as we're not using extra space proportional to input size.

Hint: Use the modulo operator % to check if the number is divisible by 2.
