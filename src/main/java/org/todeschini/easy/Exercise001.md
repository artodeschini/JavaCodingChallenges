# Finding the Smallest Element - Array Operations

[code](Exercise001.java)

## Introduction:

In this challenge, you will implement a function named findSmallestElement that returns the smallest number from a given integer array. You will traverse the array, compare elements, and find the smallest number.

## Steps:

1. Define a function findSmallestElement which accepts an integer array as its argument.
2. Initialize a variable smallest with the highest possible integer value (Integer.MAX_VALUE).
3. Traverse the array, and for each element:
4. If the current element is smaller than smallest, update smallest with the current element.
5. After the traversal, return the smallest value.

## Requirements:

The function findSmallestElement should be defined in the Exercise class.
The function findSmallestElement should return an integer representing the smallest element in the array.

## sample

Input: An integer array arr.
Output: An integer that represents the smallest element in the given array.

Examples:

Exercise.findSmallestElement(new int[]{1, 2, 3, 4, 5}); // Returns 1
Exercise.findSmallestElement(new int[]{2, -3, 4}); // Returns -3
Exercise.findSmallestElement(new int[]{0, 99, 1001, 32}); // Returns 0
Exercise.findSmallestElement(new int[]{}); // Returns Integer.MAX_VALUE

## Constraints:

The array length can be 0 to 10^6.
Each array element is an integer which can be negative, zero, or positive.

Expected Time Complexity: O(n), where n is the length of the array.
Expected Auxiliary Space: O(1), constant space complexity is expected as we're not using extra space proportional to input size.

Hint: Traverse the array and compare each element with a variable initialized to Integer.MAX_VALUE. If the current element is smaller, update the variable.
Note: In Java, Integer.MAX_VALUE is used as the initial smallest value because it is the maximum possible integer value that can exist in Java. So, any value in the array will be less than or equal to this.

Understand how to traverse a Java array, compare elements, and identify the smallest element within it.
