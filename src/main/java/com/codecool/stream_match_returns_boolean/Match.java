package com.codecool.stream_match_returns_boolean;

import java.util.Arrays;
import java.util.List;

public class Match {
    public static void main(String[] args) {
        // arrange
        List<Person> people = Arrays.asList(
                new Person("John", 25),
                new Person("Jane", 17),
                new Person("Adam", 30)
        );

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);


        // .allMatch returns true only if all conditions are true
        boolean isAllEven = numbers.stream()
                .allMatch(integer -> integer % 2 == 0);

        System.out.println(isAllEven); // false

        // .anyMatch returns true if any of the conditions are true
        boolean isAnyEven = numbers.stream()
                .anyMatch(integer -> integer % 2 == 0);

        System.out.println(isAnyEven); // true

        // .noneMatch returns true if none of the conditions are true
        boolean isNoneLessThanZero = numbers.stream()
                .noneMatch(integer -> integer <  0);

        System.out.println(isNoneLessThanZero); // true


        // example with a property
        boolean allAdults = people.stream()
                .allMatch(person -> person.getAge() >= 18);

        System.out.println(allAdults);  // false
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}