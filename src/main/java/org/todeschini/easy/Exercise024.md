# Calculate Profit or Loss - Basic Operations

[code](Exercise024.java)

## Introduction

In this challenge, you're tasked with calculating the profit or loss made by selling a product. If the selling price is more than the cost price, the difference is the profit. If the cost price is more than the selling price, the difference is the loss. This challenge will help you practice basic arithmetic operations and conditional logic in Java.

## Steps

Implement a public static method calculateProfitOrLoss that takes two doubles as arguments. The first argument represents the cost price and the second argument represents the selling price.
Calculate the difference between the selling price and the cost price and return this value.

## Requirements

1. The Exercise024 class should contain a public static method calculateProfitOrLoss.
2. The calculateProfitOrLoss method should take two doubles as arguments and return a double.

Input: Two doubles representing the cost price and the selling price.
Output: A double representing the profit or loss. If the output is positive, it's a profit; if it's negative, it's a loss. If the output is zero, there's neither profit nor loss.

## Examples

Exercise024.calculateProfitOrLoss(20, 30); // Returns 10.0 (profit)
Exercise024.calculateProfitOrLoss(30, 20); // Returns -10.0 (loss)
Exercise024.calculateProfitOrLoss(20, 20); // Returns 0.0 (no profit, no loss)

## Constraints

The input prices can be any double, including zero. Negative prices do not make sense in this context, so they can be excluded from consideration.

Expected Time Complexity: O(1), as we are performing a single subtraction operation.
Expected Auxiliary Space: O(1), as we are not using any additional space for this operation.

Hint: To solve this problem, subtract the cost price from the selling price.
Note: The profit or loss is calculated as the difference between the selling price and the cost price.
