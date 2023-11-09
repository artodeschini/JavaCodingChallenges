# Convert Fahrenheit to Celsius - Temperature Conversion

[code](Exercise026.java)

## Introduction

The Fahrenheit and Celsius scales are the two most common temperature scales. However, they start at different temperatures and the degrees are different sizes. In this exercise, we will write a program to convert temperature from Fahrenheit to Celsius. The formula for conversion is (Fahrenheit - 32) * 5/9.

## Steps

1. Function Definition: Define a function named convertFahrenheitToCelsius that takes one parameter of type double representing the temperature in Fahrenheit.
2. Conversion Calculation: Use the formula (Fahrenheit - 32) * 5/9 to convert the Fahrenheit temperature to Celsius.
3. Return Result: Return the calculated Celsius temperature.

## Requirements

1. Function name: convertFahrenheitToCelsius
2. Parameters: One double type, fahrenheit.
3. Return: A double type representing the calculated Celsius temperature.

Input
A single double value representing the temperature in Fahrenheit.
Output:
A single double value representing the converted temperature in Celsius.

## Examples

Exercise026.convertFahrenheitToCelsius(32.0); // should return 0.0
Exercise026.convertFahrenheitToCelsius(212.0); // should return 100.0
Exercise026.convertFahrenheitToCelsius(100.0); // should return 37.78

## Constraints

There are no specific constraints for this problem.
Expected Time Complexity:

O(1), as the conversion calculation takes constant time regardless of the input value.

Expected Auxiliary Space:

O(1), as no extra space is needed for this calculation.

Hint:

Use the formula for converting Fahrenheit to Celsius, (Fahrenheit - 32) * 5/9.

Note:

Be mindful of the precision when working with floating-point numbers. The result should be correct up to two decimal places.
