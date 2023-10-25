package com.codecool.average;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Average {
    public static void main(String[] args) {
        // arrange
        List<Integer> numbers = Arrays.asList(10, 20, 30);

        // calculate the average
        OptionalDouble average = numbers.stream()
                .mapToInt(value -> value)
                .average();

        if (average.isPresent()) {
            System.out.println(average.getAsDouble());
        } else {
            System.out.println(0);
        }
    }
}
