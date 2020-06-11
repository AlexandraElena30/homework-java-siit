package com.siit.homeworks.homework11.exercise04;

import java.util.stream.Stream;

public class Fibonacci {

    public static void main(String[] args) {

        Stream.iterate(new long[]{0l, 1l}, n -> new long[]{n[1], n[0] + n[1]})
                .limit(100)
                .forEach(n -> System.out.println(n[0]));

    }
}
