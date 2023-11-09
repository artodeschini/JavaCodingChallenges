# Calculating Volume - Cube Operations

[code](Exercise027.java)

Introduction: In this challenge, you are required to implement a function named calculateCubeVolume that calculates the volume of a cube given the length of its edge. You will use mathematical operations in Java to perform this calculation.

## Steps

* Define a function calculateCubeVolume which accepts a double representing the length of a cube's edge as its argument.
* Use the mathematical operation Math.pow(edgeLength, 3) to calculate the volume of the cube.
* Return the calculated volume.

## Requirements

* The function calculateCubeVolume should be defined in the Exercise class.
* The function calculateCubeVolume should return a double representing the volume of the cube.
* Input: A double edgeLength representing the length of an edge of the cube.
* Output: A double that represents the volume of the cube.

## Examples

Exercise027.calculateCubeVolume(3); // Returns 27.0
Exercise027.calculateCubeVolume(2.0); // Returns 8.0
Exercise027.calculateCubeVolume(0); // Returns 0.0
Exercise027.calculateCubeVolume(-2.0); // Returns -8.0

## Constraints

The edge length can be any double value from -10^6 to 10^6.
Expected Time Complexity: O(1), a constant time complexity as there are no loops or recursive calls in the function.
Expected Auxiliary Space: O(1), constant space complexity as we're not using extra space proportional to input size.
Hint: The formula to calculate the volume of a cube is edge length cubed (edgeLength^3). You can use Math.pow(edgeLength, 3) to calculate this in Java.
Note: The volume of a cube with a negative edge length is mathematically undefined. However, in this challenge, we allow negative edge lengths, and the volume calculation simply cubes the negative value.
