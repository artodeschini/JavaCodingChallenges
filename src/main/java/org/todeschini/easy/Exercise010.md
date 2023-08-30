# Compute Nth Fibonacci Number - Recursion and Memoization

[code](Exercise010.java)

## Introduction

In this challenge, you are tasked with creating a function nthFibonacci that will compute the nth number in the Fibonacci sequence. This challenge introduces the concepts of recursion and memoization in Java, a useful technique for optimizing recursive computations.

## Steps

1. Define the function nthFibonacci that takes an integer n as an input.
2. Initialize a long array memo of size n+1.
3. Return the result of the helper function fibonacci(n, memo).
4. In the helper function fibonacci, if n is 0 or 1, return n.
5. If memo[n] is not yet set (i.e., equals 0), calculate it as the sum of fibonacci(n - 1, memo) and fibonacci(n - 2, memo). 
6. Return memo[n].

## Requirements

1. The function nthFibonacci should be defined in the Exercise010 class. 
2. The function nthFibonacci should return a long, the nth Fibonacci number.

Input: An integer n (0 ≤ n ≤ 50).

Output: A long representing the nth Fibonacci number.

## Examples

Exercise010.nthFibonacci(1); // Returns 1
Exercise010.nthFibonacci(2); // Returns 1
Exercise010.nthFibonacci(8); // Returns 21
Exercise010.nthFibonacci(12); // Returns 144
Exercise010.nthFibonacci(34); // Returns 5702887

Constraints: The input number n is in the range from 0 to 50.

Expected Time Complexity: O(n), linear time complexity.

Expected Auxiliary Space: O(n), linear space complexity.

Hint: Use a helper function fibonacci that employs memoization to store and re-use previously computed values of the Fibonacci sequence.

Note: The Fibonacci sequence starts with 0 and 1, and each subsequent number is the sum of the previous two.
