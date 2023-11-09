# Swap Two Numbers - Variable Operations

[code](Exercise028.java)

## Introduction

In this challenge, you will implement a function named swapNumbers that swaps the values of two given numbers without using a third variable. This is a classic programming question that tests your understanding of variables and mathematical operations.

## Steps

* Define a function swapNumbers which accepts two integers as its arguments.
* Add the two numbers and assign the result to the first number.
* Subtract the second number from the first number (which is now the sum of both numbers) and assign the result to the second number.
* Subtract the second number (which now holds the original first number) from the first number (which is the sum of both original numbers) and assign the result to the first number.
* Return the swapped numbers as an array.

## Requirements

* The function swapNumbers should be defined in the Exercise class.
* The function swapNumbers should return an integer array containing the swapped values of the input parameters.
* Input: Two integers a and b.
* Output: An integer array with two elements [b, a], where b and a are the values of the original a and b after swapping.

## Examples

Exercise028.swapNumbers(1, 2); // Returns [2, 1]
Exercise028.swapNumbers(2, -3); // Returns [-3, 2]
Exercise028.swapNumbers(99, 0); // Returns [0, 99]
Exercise028.swapNumbers(5, 5); // Returns [5, 5]

## Constraints

Both input numbers can be any integer (negative, zero, or positive).
Expected Time Complexity: O(1), as the number of operations is constant and does not depend on the size of the input.
Expected Auxiliary Space: O(1), as we're not using any extra space that scales with input size.
Hint: Use basic arithmetic operations (addition and subtraction) to swap the numbers without using a temporary variable.
Note: In Java, you can swap two numbers without using a third variable by performing arithmetic operations. However, be aware that this method can lead to integer overflow if the sum of the two numbers exceeds the maximum limit of the integer.
