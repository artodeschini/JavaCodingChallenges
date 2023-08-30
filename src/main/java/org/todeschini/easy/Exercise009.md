# Count Number of Digits - Mathematical Approach

[code](Exercise009.java)

## Introduction

In this challenge, you are tasked with creating a function countDigits which will count the number of digits in an integer. You will learn to perform mathematical operations and recursion in Java to achieve this goal.

## Steps

1. Define the function countDigits that takes an integer number as an input.
2. If number is negative, multiply it by -1 to make it positive.
3. If number is zero, return 1 as the count.
4. Calculate the number of digits using the mathematical formula Math.floor(Math.log10(number) + 1).
5. The function should return the count as an integer.

## Requirements

1. The function countDigits should be defined in the Exercise009 class.
2. The function countDigits should return an integer, the count of digits in the input number.

Input: An integer number.

Output: An integer representing the count of digits in the input number.

## Examples

Exercise009.countDigits(10); // Returns 2
Exercise009.countDigits(-123); // Returns 3
Exercise009.countDigits(0); // Returns 1
Exercise009.countDigits(5); // Returns 1

Constraints: number can be a positive, negative, or zero.

Expected Time Complexity: O(1), constant time complexity.

Expected Auxiliary Space: O(1), constant space complexity.

Hint: The number of digits in a non-negative integer can be calculated using logarithm. Specifically, the number of digits d in a number n is d = floor(log10(n) + 1).

Note: Be sure to handle the case where number is zero or negative correctly.
