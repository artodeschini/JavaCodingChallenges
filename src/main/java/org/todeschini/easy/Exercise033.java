package org.todeschini.easy;

public class Exercise033 {

    public static long maxHandshakes(int n){
        // calculate maximum handshakes
        return (long) n * (n - 1) / 2;
    }
}
