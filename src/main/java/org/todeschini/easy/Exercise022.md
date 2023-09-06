# Calculate Area of a Rectangle - Object-Oriented Programming

[code](Exercise022.java)

# Introduction

In this challenge, you'll practice the basic principles of Object-Oriented Programming (OOP) in Java. Specifically, you'll be designing a Rectangle class that calculates the area of a rectangle. By doing so, you'll learn about class design, object creation, and method implementation in Java.

## Steps

1. Define a Rectangle class inside the Exercise022 class.
2. Inside the Rectangle class, declare two instance variables length and width to store the dimensions of the rectangle.
3. Implement a constructor that takes two parameters to initialize the length and width.
4. Implement a method named area that returns the area of the rectangle.

## Requirements

1. The Exercise022 class should contain a nested Rectangle class.
2. The Rectangle class should have two instance variables: length and width.
3. The Rectangle class should have a constructor that initializes length and width.
4. The Rectangle class should have an area method that calculates and returns the area of the rectangle.

Input: Two integers length and width.
Output: An integer representing the area of the rectangle.

## Examples:

Exercise022.Rectangle rectangle = new Exercise022.Rectangle(5, 4);
rectangle.area(); // Returns 20

## Constraints:

1. The length and width can be any integer.
2. If length or width are negative, the area should also be negative.
3. If length or width are zero, the area should be zero.

Expected Time Complexity: O(1), as we only perform a single operation (multiplication).
Expected Auxiliary Space: O(1), as we only use a constant amount of space to store the length and width.

Hint: To solve this problem, define a class Rectangle with instance variables length and width. Implement a constructor to initialize these variables, and an area method that calculates and returns the area of the rectangle.
Note: If the length or width of the rectangle is zero, the area will be zero. If they are negative, the area will also be negative.
