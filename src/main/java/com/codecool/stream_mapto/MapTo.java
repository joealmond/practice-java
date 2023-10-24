package com.codecool.stream_mapto;

import java.util.Arrays;
import java.util.List;

public class MapTo {
    public static void main(String[] args) {
        // arrange
        List<String> strings = Arrays.asList("apple", "banana", "orange");

        // string lengths to int
        strings.stream()
                .mapToInt(s -> s.length())
                .forEach(System.out::println);
    }
}
