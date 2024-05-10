package org.todeschini.easy;

import java.util.List;

public class Exercise032 {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static String printFizzBuzz(int n){
        var exit = new StringBuilder();
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                exit.append(FIZZ_BUZZ);
            } else if(i % 3 == 0){
                exit.append(FIZZ);
            } else if(i % 5 == 0){
                exit.append(BUZZ);
            } else {
                exit.append(i);
            }
        }
        return exit.toString();
    }
}
