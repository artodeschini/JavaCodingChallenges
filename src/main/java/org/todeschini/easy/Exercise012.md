# Count Digit Frequency - Number Operations

[code](Exercise012.java)

## Introduction 

In this challenge, you are tasked with creating a function countDigitFrequency that determines the frequency of a particular digit within a larger number. This exercise will enhance your understanding of number operations and the use of loops in Java.

## Steps

1. Define the function countDigitFrequency that takes a long number and an integer digit as inputs.
2. Initialize a count variable to 0. This will keep track of the number of occurrences of the digit in the number.
3. Use a while loop to iterate through each digit in the number.
4. Inside the loop, check if the last digit of the number (number % 10) is equal to the digit we are looking for. If it is, increment the count.
5. Divide the number by 10 to remove the last digit.
6. Repeat this process until the number is 0.
7. Return the count.

## Requirements

1. The function countDigitFrequency should be defined in the Exercise012 class.
2. The function countDigitFrequency should return an integer, the frequency of the digit in the number.

Input: A long number (0 ≤ number ≤ 10^19) and an integer digit (0 ≤ digit ≤ 9).
Output: An integer, the frequency of the digit in the number.

## Examples

Exercise012.countDigitFrequency(12345, 1); // Returns 1
Exercise012.countDigitFrequency(23456, 5); // Returns 1
Exercise012.countDigitFrequency(12345, 6); // Returns 0
Exercise012.countDigitFrequency(11111, 1); // Returns 5

Constraints: The number will be a non-negative long, and the digit will be a single digit integer (0-9).

Expected Time Complexity: O(log(n)), where n is the input number.
Expected Auxiliary Space: O(1).

Hint: You can use the modulus operator (%) and integer division (/) to iterate through the digits of the number.

Note: Remember that the digits of a number can be iterated from right to left by continuously dividing the number by 10.
