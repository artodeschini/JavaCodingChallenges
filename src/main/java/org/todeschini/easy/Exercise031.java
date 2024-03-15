package org.todeschini.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Exercise031 {

    // funcionalidade de java 17 permite de elimitar boilerplate em pojos
    public record Brother(String name, int age) {
        public String getNome() {
            return this.name;
        }
    }
    // substituindo a inner class comentada
//    static class Brother {
//        String name;
//        int age;
//
//        Brother(String name, int age) {
//            this.name = name;
//            this.age = age;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public int getAge() {
//            return age;
//        }
//
//        public void setAge(int age) {
//            this.age = age;
//        }
//    }

    public static Brother findYoungestBrother(Brother[] brothers){
        // check if the array is empty
        Brother youngest;
        // your code here
        if (brothers.length == 0) {
            throw new NoSuchElementException();
        }

        youngest = brothers[0];


        // initialize youngest with the first brother
        // your code here
        for (Brother b : brothers) {
            if (youngest.age > b.age) {
                youngest = b;
            }
            // loop through each brother in the array
            // your code here
        }
            // return the youngest brother found
            // your code here
        //    return Arrays.stream(brothers).min(Comparator.comparing(b -> b.age)).orElseThrow(NoSuchElementException::new);
        return youngest;
        //return Arrays.stream(brothers).min(Comparator.comparing(b -> b.age)).orElseThrow(NoSuchElementException::new);
    }

    public static Brother findYoungestBrotherWithStream(Brother[] brothers) {
        return Arrays.stream(brothers).min(Comparator.comparing(b -> b.age)).orElseThrow(NoSuchElementException::new);
    }

    public static void main(String[] args) {
        var brothers = new Brother[] {
                new Brother("a", 1),
                new Brother("b", 2),
                new Brother("c", 3)
        };

        Arrays.stream(brothers).forEach(System.out::println);
        //Arrays.stream(brothers).forEach(b -> System.out.println(b.age()));
        Brother yongest = Arrays.stream(brothers).min(Comparator.comparing(b -> b.age)).orElseThrow(NoSuchElementException::new);
        System.out.println("O mais jovem é " + yongest);
    }

}

