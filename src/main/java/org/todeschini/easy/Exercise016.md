# Sum of Largest and Smallest Element in an Array - Array Operations

[code](Exercise016.java)

## Introduction

In this exercise, you are tasked with finding the sum of the largest and smallest elements in an array. This requires understanding of array traversal and basic operations on integers in Java.

## Steps

1. Create a function named sumOfExtremes in the Exercise class, which takes an array of integers as input.
2. Initialize two integer variables, min and max, to Integer.MAX_VALUE and Integer.MIN_VALUE, respectively. These will hold the smallest and largest elements in the array.
3. Traverse the array. For each number in the array, check if it's smaller than min. If it is, update min. Do a similar check for max.
4. Once the array is fully traversed, return the sum of min and max.

## Requirements

1. The function sumOfExtremes should be defined inside the Exercise class.
2. This function should return an integer representing the sum of the smallest and largest element in the array.

Input
An integer array, arr.
Output:
An integer, which is the sum of the smallest and largest elements in the array.

## Examples

Exercise016.sumOfExtremes(new int[]{1, 3, 5, 7, 9});  // Returns 10
Exercise016.sumOfExtremes(new int[]{-1, -3, -5, -7, -9}); // Returns -10
Exercise016.sumOfExtremes(new int[]{-5, 0, 5, 10}); // Returns 5
Exercise016.sumOfExtremes(new int[]{1}); // Returns 2

## Constraints

1. The array may contain positive or negative integers, and can be of any length, including empty.
2. If the array contains only one element, that element is both the smallest and the largest element.

Expected Time Complexity:

O(n), where n is the length of the array.
Expected Auxiliary Space:
O(1), as we only need two additional variables to hold the smallest and largest elements.

Hint

Use a loop to traverse the array and keep updating min and max.

Note

The values for min and max are initialized to Integer.MAX_VALUE and Integer.MIN_VALUE so that any integer from the array can replace them.
