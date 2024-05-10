# Printing FizzBuzz - Loop and Conditional Statements

[code](Exercise032.java)

## Introduction

In this challenge, you will implement a function named `printFizzBuzz` that prints the numbers from 1 to n. 
But for multiples of three, it should print "Fizz" instead of the number, and for multiples of five, 
it should print "Buzz". For numbers which are multiples of both three and five, it should print "FizzBuzz".

## Steps

1. Define a function `printFizzBuzz` which accepts an integer n as its argument.
2. Traverse from 1 through n (inclusive) using a for loop.

For each number:
If the number is divisible by both 3 and 5, print "FizzBuzz".
Else, if the number is divisible by 3, print "Fizz".
Else, if the number is divisible by 5, print "Buzz".
Else, print the number itself.

## Requirements

The function printFizzBuzz should be defined in the Exercise class.
The function printFizzBuzz should print the correct output as per the problem statement.

Input: An integer n.
Output: Print the sequence as per the problem statement.

## Examples:

Exercise032.printFizzBuzz(15);
// Output:
// 1
// 2
// Fizz
// 4
// Buzz
// Fizz
// 7
// 8
// Fizz
// Buzz
// 11
// Fizz
// 13
// 14
// FizzBuzz

## Constraints:

n will be between 1 and 100, inclusive.
Expected Time Complexity: O(n), where n is the input number.
Expected Auxiliary Space: O(1), constant space complexity is expected as we're not using extra space proportional to input size.

Hint: Use a for loop to traverse from 1 through n. Use the modulus operator % to check divisibility.
Note: This problem is a classic programming interview question used to filter out candidates. It checks basic understanding of loops and conditional statements.
