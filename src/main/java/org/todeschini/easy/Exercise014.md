# Separate Even and Odd Numbers - Array Manipulation

[code](Exercise014.java)

## Introduction

In this challenge, you will implement a function named separateEvenOdd that separates even and odd numbers in a given array. The function will place all even numbers at the beginning of the array and all odd numbers at the end.

## Steps

1. Define a function separateEvenOdd which accepts an integer array, arr.
2. Initialize two pointers: left at the start of the array and right at the end of the array.
3. In a loop, increment left until an odd number is found and decrement right until an even number is found.
4. Swap the odd number at the left pointer with the even number at the right pointer.

Continue this process until left is equal to or crosses right.

Return the manipulated array.

## Requirements

1. The function separateEvenOdd should be defined in the Exercise class.
2. The function separateEvenOdd should return an array of integers after separating even and odd numbers.

Input: An array of integers, arr.
Output: An array of integers [a1, a2, ..., an] after separating even and odd numbers, with even numbers at the beginning and odd numbers at the end.
Examples:

Exercise014.separateEvenOdd(new int[]{1, 4, 3, 2}); // Returns [2, 4, 3, 1]
Exercise014.separateEvenOdd(new int[]{1, 3, 5, 7}); // Returns [1, 3, 5, 7] (No even numbers, so array remains the same)
Exercise014.separateEvenOdd(new int[]{2, 4, 6, 8}); // Returns [2, 4, 6, 8] (No odd numbers, so array remains the same)
Exercise014.separateEvenOdd(new int[]{}); // Returns []

Constraints:

The integers can be negative, zero, or positive.
The order of the numbers in the output array does not matter, as long as all even numbers are at the beginning and odd numbers are at the end.

Expected Time Complexity: O(n), where n is the size of the input array.
Expected Auxiliary Space: O(1), as no additional space is required.

Hint: You can use two pointers to iterate from the beginning and the end of the array simultaneously, swapping the odd and even numbers as you encounter them.
Note: You may assume that the input array does not contain null elements.