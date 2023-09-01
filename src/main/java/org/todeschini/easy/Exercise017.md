# Recursive Exponentiation

[code](Exercise017.java)

## Introduction

In this exercise, you're tasked with calculating the power of a number using recursion in Java. The power, or exponentiation, of a number can be calculated by multiplying that number by itself for the number of times specified by the exponent.

## Steps

1. Create a function named power in the Exercise017 class, which takes a base (double) and an exponent (int) as input.
2. If the exponent (n) is 0, return 1, as any number raised to the power of 0 is 1.
3. If n is greater than 0, return the base x multiplied by the power of x to n - 1.
4. If n is less than 0, return the reciprocal of x raised to the power of -n to handle negative exponents.

## Requirements

1. The function power should be defined inside the Exercise017 class.
2. This function should return a double, which is the result of raising x to the power of n.

Input:

A double x (the base) and an integer n (the exponent).

Output:

A double, which is the result of raising x to the power of n.

## Examples:

Exercise017.power(2, 3);  // Returns 8
Exercise017.power(2, 0); // Returns 1
Exercise017.power(2, -3); // Returns 0.125
Exercise017.power(0.5, 3); // Returns 0.125

Constraints

x can be any real number.

n can be any integer.

Expected Time Complexity:

O(n), where n is the absolute value of the exponent.

Expected Auxiliary Space:

O(n), for the function call stack.

Hint:

Implement the recursive function to handle positive, negative, and zero exponents.

Note:

If the exponent is less than 0, we need to calculate the reciprocal of the base raised to the absolute value of the exponent.
