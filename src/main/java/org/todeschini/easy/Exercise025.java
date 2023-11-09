package org.todeschini.easy;

public class Exercise025 {

    public static double calculateBMI(double weight, double height) {
        // Step 1: Input validation
        // Check if the weight and height are greater than 0.
        // If not, throw an IllegalArgumentException.
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException();
        }
        // Step 2: Calculate the BMI using the formula weight / (height * height)

        // Step 3: Return the calculated BMI.
        return weight / (height * height);
    }
}
