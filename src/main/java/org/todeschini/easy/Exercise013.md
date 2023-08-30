# Separate 0's and 1's from an Array - Array Segregation

[code](Exercise013.java)

## Introduction

In this challenge, you will learn how to segregate 0's and 1's in an integer array in Java. This problem is a simple exercise in array manipulation, where you will need to traverse an array, count specific elements, and then rearrange the array accordingly.

## Steps

1. Define a method called separateZeroAndOne that takes an integer array as input.
2. Traverse through the array and count the number of 0's.
3. Then, fill the first 'n' indices of the array (where 'n' is the number of 0's) with 0's.
4. Fill the rest of the array with 1's.

## Requirements

1. The main class should be named as Exercise013
2. The method separateZeroAndOne should be a public static method.
3. The separateZeroAndOne method should not return anything; instead, it should modify the input array directly.

Input: An integer array consisting of 0's and 1's.
Output: The modified input array such that all 0's are on the left, and all 1's are on the right.

## Examples

int[] arr1 = {0, 1, 0, 1, 1, 0, 1, 0};
Exercise013.separateZeroAndOne(arr1); // arr1 becomes {0, 0, 0, 0, 1, 1, 1, 1}

int[] arr2 = {1, 0, 1, 0, 1, 0, 1, 0};
Exercise013.separateZeroAndOne(arr2); // arr2 becomes {0, 0, 0, 0, 1, 1, 1, 1}
Constraints: The array will only contain the integers 0 and 1. The length of the array is between 1 and 10^6.

Expected Time Complexity: O(n), where n is the size of the input array.
Expected Auxiliary Space: O(1), as we are modifying the input array in-place.

Hint: Use a counter to keep track of the number of 0's while iterating through the array. This will also act as the index separator for 0's and 1's.

Note: The order of 0's and 1's does not matter in the output.
