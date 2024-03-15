# Find Youngest Brother - Class and Object Operations

[code](Exercise031.java)

## Introduction

In this challenge, you will create a class named `Brother`    
and implement a function `findYoungestBrother` that returns the `youngest`
brother from a given array of Brother objects. You will work with Java objects, class properties,
and perform object comparisons based on these properties.

## Steps

1. Define a `Brother` class inside Exercise031 class, with two properties: name (String) and age (int).
2. Implement a constructor for Brother class which takes two parameters, name and age, and initializes the respective class properties.
3. Define a function `findYoungestBrother` which accepts an array of Brother objects as its argument.

If the array is empty, return null.
Initialize a variable youngest with the first brother in the array.
Traverse the array, and for each brother:
If the current brother's age is smaller than youngest's age, update youngest with the current brother.
After the traversal, return the youngest brother.

## Requirements

1. The class Brother and the function findYoungestBrother should be defined inside the Exercise class.
2. The function findYoungestBrother should return a Brother object representing the youngest brother in the array.

Input: An array of Brother objects brothers.
Output: A Brother object that represents the youngest brother in the given array, or null if the array is empty.

Examples

Exercise031.Brother[] brothers = {
new Exercise.Brother("John", 30),
new Exercise.Brother("Bob", 25),
new Exercise.Brother("Mike", 27)
};
Exercise031.findYoungestBrother(brothers).name; // Returns "Bob"

Exercise031.Brother[] brothers = {new Exercise.Brother("John", 30)};
Exercise031.findYoungestBrother(brothers).name; // Returns "John"

Exercise031.Brother[] brothers = {};
Exercise031.findYoungestBrother(brothers); // Returns null

## Constraints

1. The array length can be 0 to 10^6.
2. Each brother's age is an integer which is between 0 and 150.
3. Expected Time Complexity: O(n), where n is the length of the array.

Expected Auxiliary Space: O(1), constant space complexity is expected as we're not using extra space proportional to input size.
Hint: Traverse the array of brothers and compare each brother's age with a variable initialized to the first brother's age. If the current brother's age is smaller, update the variable.

Note: In Java, objects are compared by their references, not by their values. So, when comparing Brother objects, you need to compare their age properties, not the objects themselves.