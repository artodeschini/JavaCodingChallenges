package org.todeschini.easy;

import java.util.Optional;;
import java.util.stream.Stream;

public class Exercise010 {
    public static long nthFibonacci(int n){
        // initialize a memoization array
        // your code here

        // call the helper function and return the result
        // your code here
        // Optional max = Stream.iterate(new long[]{0, 1}, t -> new long[]{t[1], t[0] + t[1]})
        //         .limit(n)
        //         .map(t -> t[0])
        //         .max(Long::compare);

        // return (long) max.get();
        if (n < 2) {
            return n;
        } else {
            return nthFibonacci(n - 1) + nthFibonacci(n - 2);
        }
    }

    public static long nthFibonacciWithStream(int n){
        // initialize a memoization array
        // your code here

        // call the helper function and return the result
        // your code here
        // Optional max = Stream.iterate(new long[]{0, 1}, t -> new long[]{t[1], t[0] + t[1]})
        //         .limit(n)
        //         .map(t -> t[0])
        //         .max(Long::compare);

        // return (long) max.get();
        if (n < 2) {
            return n;
        } else {
            Optional max = Stream.iterate(new long[]{0, 1}, t -> new long[]{t[1], t[0] + t[1]})
                     .limit(n+1)
                     .map(t -> t[0])
                     .max(Long::compare);

            return (long) max.get();
        }
    }
    private static long fibonacci(int n, long[] memo){
        // if n is 0 or 1, return n
        // your code here

        // if memo[n] is not yet set, calculate it
        // your code here

        // return memo[n]
        // your code here
        return nthFibonacci(n);
    }

    public static long nthFibonacciSolve(int n){
        long[] memo = new long[n+1];
        return fibonacci(n, memo);
    }

    private static long nthFibonacciSolve(int n, long[] memo){
        if(n <= 1){
            return n;
        }
        if(memo[n] == 0){
            memo[n] = nthFibonacciSolve(n - 1, memo) + nthFibonacciSolve(n - 2, memo);
        }
        return memo[n];
    }

    public static void main(String[] args) {
        System.out.println(nthFibonacci(10));
        System.out.println(nthFibonacciWithStream(10));
    }
}
