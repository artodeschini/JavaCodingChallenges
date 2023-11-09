# Calculate Simple Interest - Basic Mathematics

[code](Exercise029.java)

## Introduction

In this challenge, you will create a function called calculateSimpleInterest that computes the simple interest on a principal amount. This problem is centered around basic arithmetic operations in Java and gives you a chance to apply the formula for simple interest in a practical context.

## Steps

* Define a function calculateSimpleInterest which accepts three parameters: principal, rate, and time.
* In the function, apply the formula for simple interest which is (principal * rate * time) / 100.
* Return the computed simple interest.

## Requirements

* The function calculateSimpleInterest should be defined in the Exercise class.
* The function calculateSimpleInterest should return a double representing the calculated simple interest.

Input: Three double values representing principal, rate, and time.
Output: A double value that represents the calculated simple interest.

# Examples

Exercise029.calculateSimpleInterest(1000.0, 4.0, 5.0); // Returns 200.0
Exercise029.calculateSimpleInterest(0.0, 5.0, 5.0); // Returns 0.0
Exercise029.calculateSimpleInterest(1000.0, 0.0, 5.0); // Returns 0.0
Exercise029.calculateSimpleInterest(1000.0, 5.0, 0.0); // Returns 0.0

## Constraints

All input values (principal, rate, time) are non-negative.
rate is in percent and not in decimal form.

Expected Time Complexity: O(1), as calculating simple interest is a constant time operation regardless of the input values.
Expected Auxiliary Space: O(1), constant space complexity is expected as we're not using extra space proportional to input size.

Hint: To calculate the simple interest, use the formula interest = (principal * rate * time) / 100.

Note: Remember that the rate of interest is given in percent form. So, while calculating, we have to divide it by 100.
