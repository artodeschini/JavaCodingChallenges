# Reverse an Array - Without Using the reverse() Method

[code](Exercise018.java)

## Introduction

In this challenge, you are tasked with implementing a function that reverses an array of integers. The trick? You cannot use the built-in reverse() method. This exercise will help reinforce your understanding of arrays and the techniques used to manipulate them.

## Steps

1. Define a function reverseArray that takes an integer array arr as an argument.
2. Create two pointer variables, start and end. Initialize start to the first index (0) and end to the last index (array length - 1).
3. Swap the elements at start and end indexes.
4. Increment start by 1 and decrement end by 1.
5. Repeat steps 3 and 4 until start is greater than or equal to end.
6. Return the reversed array.

## Requirements

1. The function reverseArray should be defined in the Exercise018 class.
2. The function reverseArray should return the array after reversing it.

Input: An integer array arr.
Output: The reversed integer array.

## Examples

Exercise018.reverseArray(new int[]{1, 2, 3, 4, 5}); // Returns [5, 4, 3, 2, 1]
Exercise018.reverseArray(new int[]{99}); // Returns [99]
Exercise018.reverseArray(new int[]{}); // Returns []

## Constraints

The array can be empty, contain a single element, or multiple elements.
Expected Time Complexity: O(n), where n is the length of the array.
Expected Auxiliary Space: O(1), as the reversing is done in-place, no extra space is used.

Hint: The key to solving this challenge is understanding how to use two pointers (one starting at the beginning of the array and the other at the end) to swap elements in place.

Note: This method modifies the original array. If you want to keep the original array intact, you would need to create a copy before performing the reverse operation.
