# Finding First and Last Occurrence - Array Operations

[code](Exercise021.java)

## Introduction

In this challenge, you will need to implement a function that finds the first and last occurrence of an element in an array. This will test your understanding of array navigation and searching techniques, which are fundamental for data manipulation and algorithm implementation.

## Steps

1. Define a function findFirstAndLast that takes an array of integers arr and a target integer target as arguments.
2. Initialize an array result of length 2 with both elements as -1. This will be used to store the indices of the first and last occurrence of the target element. If the target element is not found in arr, result will remain as {-1, -1}.
3. Traverse arr from the start to find the first occurrence of target, and update result[0] with its index.
4. Traverse arr from the end to find the last occurrence of target, and update result[1] with its index.
5. Return result.

## Requirements

1. The function findFirstAndLast should be defined in the Exercise021 class. 
2. The function findFirstAndLast should return an array of two integers representing the first and last occurrence of target in arr.

Input: An array of integers arr and an integer target.
Output: An array of two integers.

## Examples

Exercise021.findFirstAndLast(new int[]{1, 2, 3, 3, 3, 4, 5}, 3); // Returns [2, 4]
Exercise021.findFirstAndLast(new int[]{1, 2, 3, 4, 5}, 6); // Returns [-1, -1]
Exercise021.findFirstAndLast(new int[]{7}, 7); // Returns [0, 0]

## Constraints:

The array arr can have any length, including 0.
The array arr and the target target can contain any integer, positive, negative, or zero.
Expected Time Complexity: O(n), where n is the length of the array. In the worst-case scenario, we have to iterate over the entire array.
Expected Auxiliary Space: O(1), as we only use a constant amount of space to store the indices of the first and last occurrence.

Hint: You can solve this problem by iterating over the array twice, first from the start to find the first occurrence, and then from the end to find the last occurrence.
Note: If the target is not found in the array, the function should return [-1, -1].
