# Factorial Computation - Recursion

[code](Exercise006.java)

## Introduction:

Calculating the factorial of a number is a common problem in mathematics and computer science. The factorial of a non-negative integer n is the product of all positive integers less than or equal to n. It is denoted by n!, and defined by the product n! = n * (n-1) * (n-2) * ... * 3 * 2 * 1. Factorial of 0 is defined as 1. This problem will help you learn how to solve problems recursively in Java.

## Steps

1. If the input number is less than 0, throw an IllegalArgumentException because factorial is undefined for negative numbers.
2. If the input number is 0 or 1, return 1 because the factorial of 0 and 1 is 1.
3. Otherwise, return the product of the current number and the factorial of the previous number. This is done by recursively calling the function with the input number decremented by 1.

## Requirements

1. Write a public method named factorial that takes an integer as input and returns a long should be defined in the Exercise006 class.
2. The factorial method should throw an IllegalArgumentException if the input number is negative.
3. The factorial method should return the factorial of the input number calculated using recursion.

Input

A single integer n (0 ≤ n ≤ 20).

Output

The factorial of the input number n as a long.

## Examples

Exercise006.factorial(5);  // Returns: 120
Exercise006.factorial(0);  // Returns: 1
Exercise006.factorial(1);  // Returns: 1
Exercise006.factorial(20); // Returns: 2432902008176640000L

## Constraints:

The input number will always be between 0 and 20, inclusive.

Expected Time Complexity:

O(n), where n is the input number.

Expected Auxiliary Space:

O(n), where n is the input number. The extra space is required for the function call stack due to recursion.

Hint:

Factorial of a number n can be calculated as the product of n and the factorial of n-1.

Note:

Be careful when dealing with large factorials as they can quickly exceed the limit of integer data types. Use a long to store the result.