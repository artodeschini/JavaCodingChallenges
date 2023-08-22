Finding the Second Largest Element - Array Operations
Introduction:

In this exercise, you will be implementing a function that finds the second-largest element in a given array. The array may contain duplicates, and the elements are not necessarily in any particular order. You are required to traverse the array only once.

Steps:

Initialize two variables, firstLargest and secondLargest, with the smallest possible integer value.

Traverse through the array.

For each element, compare it with firstLargest.

If the element is greater than firstLargest, update secondLargest with the value of firstLargest, and then update firstLargest with the value of the element.

If the element is smaller than firstLargest and greater than secondLargest, then update secondLargest with the value of the element.

After traversing through the array, return secondLargest.

Requirements:

You should have a function named secondLargest.

The function secondLargest takes an array of integers as an input and returns the second-largest integer.

Input:

An array of integers. The array might contain duplicate values and the values are not in any specific order.

Output:

An integer which is the second largest in the input array.

Examples:

secondLargest(new int[]{1, 2, 5, 4, 3}); // Output: 4
secondLargest(new int[]{5, 5, 5, 4, 4}); // Output: 4
Constraints:

The input array should have at least two elements.

Expected Time Complexity:

The time complexity of this function is O(n), where n is the length of the array.

Expected Auxiliary Space:

The auxiliary space complexity of this function is O(1), as no additional data structures are used.

Hint:

Initialize two variables, firstLargest and secondLargest, with the minimum possible integer value. These variables will keep track of the largest and the second largest elements encountered so far.

A single traversal of the array is enough to find the second largest element.

Note:

Consider handling the case where the input array has less than two elements separately.