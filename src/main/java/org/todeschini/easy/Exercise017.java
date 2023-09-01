package org.todeschini.easy;

public class Exercise017 {

    public static double power(double x, int n) {
        // Check for base cases

        // Handle positive exponent

        // Handle negative exponent
        if (n == 0) {
            return 1;
        } else if  (n > 0) {
            return x * power(x, n - 1);
        } else {
            return 1 / power(x, -n);
        }
    }

    public static double powerMath(double x, int n) {
        // Check for base cases

        // Handle positive exponent

        // Handle negative exponent
        return Math.pow(x, n);
    }
}
