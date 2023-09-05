package org.todeschini.easy;

import org.todeschini.shared.Pair;

import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercise021 {

    public static int[] findFirstAndLast(int[] arr, int target) {
        // your code here
        int[] result = {-1, -1};

        for (int first = 0; first < arr.length; first++) {
            if (arr[first] == target) {
                result[0] = first;
                break;
            }
        }

        for (int last = arr.length -1; last >= 0; last--) {
            if (arr[last] == target) {
                result[1] = last;
                break;
            }
        }

        return result;
    }

    public static int[] findFirstAndLastwithSteam(int[] arr, int target) {
        int[] result = {-1, -1};

        final AtomicInteger index = new AtomicInteger();

        Optional<Pair<Integer,Integer>> first = Arrays.stream(arr)
                .boxed()
                .map(v -> Pair.of(index.getAndIncrement(), v))
                .filter(p -> p.snd == target)
                .findFirst();


        if (first.isPresent()) {
            result[0] = first.get().fst;
        }

        index.set(0);

        Optional<Pair<Integer,Integer>> last = Arrays.stream(arr)
                .boxed()
                .map(v -> Pair.of(index.getAndIncrement(), v))
                .filter(p -> p.snd == target)
                .reduce((pf, pl) -> pl);

        if (last.isPresent()) {
            result[1] = last.get().fst;
        }

        return result;
    }
}
