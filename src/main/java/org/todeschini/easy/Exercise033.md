# Maximum Possible Handshakes - Combinatorics

[code](Exercise033.java)

## Introduction

In this challenge, you will implement a function named maxHandshakes that calculates the maximum possible number of handshakes in a group of n people. The concept of handshake problem is a common example of a combinatory problem.

## Steps

1. Define a function maxHandshakes which accepts an integer n as its argument.
2. The formula for the maximum number of handshakes in a group of n people is given by n * (n - 1) / 2.

## Requirements

The function maxHandshakes should be defined in the Exercise class.
The function maxHandshakes should return the maximum number of handshakes.

Input: An integer n representing the number of people in the group.

Output: Return the maximum number of handshakes.

## Examples

System.out.println(Exercise033.maxHandshakes(5));  // Output: 10
System.out.println(Exercise033.maxHandshakes(1));  // Output: 0
System.out.println(Exercise033.maxHandshakes(10)); // Output: 45
System.out.println(Exercise033.maxHandshakes(100)); // Output: 4950

## Constraints

n will be between 1 and 10^5, inclusive.

Expected Time Complexity: O(1), as the calculation is constant time regardless of the input size.
Expected Auxiliary Space: O(1), no extra space is used.

Hint: The solution to this problem involves the concept of combinatorics. Specifically, you are asked to calculate the number of ways n people can shake hands, which is a problem of combinations.

# Note: This problem is an example of a combinatorial problem, which involves counting the number of ways in which a particular event can happen.
