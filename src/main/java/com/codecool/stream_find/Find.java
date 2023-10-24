package com.codecool.stream_find;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Find {
    public static void main(String[] args) {
        // arrange
        List<String> fruits = Arrays.asList("Banana", "Pear", "Apple", "Plum");

        // find the first four-letter word
        Optional<String> firstFourLetterWord = fruits.stream()
                .filter(f -> f.length() == 4)
                .findFirst();

        if (firstFourLetterWord.isPresent()) {
            System.out.println(firstFourLetterWord.get()); // Pear
        } else {
            System.out.println("Sorry, no four-letter word found?");
        }

        // find any four-letter word
        Optional<String> anyFourLetterWord = fruits.stream()
                .filter(f -> f.length() == 4)
                .findAny();

        if (anyFourLetterWord.isPresent()) {
            System.out.println(firstFourLetterWord.get()); // Pear, same result, gets the first... has role in paralell processing...
        } else {
            System.out.println("Sorry, no four-letter word found?");
        }

    }
}
