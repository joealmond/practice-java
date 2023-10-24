package com.codecool.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMap {
    public static void main(String[] args) {
        // arrange
        List<List<Integer>> numbers_2d = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        // flatten 2d array to 1d
        List<Integer> numbers_1d = numbers_2d.stream()
                .flatMap(list -> list.stream())
                .toList();
        System.out.println(numbers_1d);
    }
}
