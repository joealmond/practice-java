package com.codecool.stream_sum;

import java.util.Arrays;
import java.util.List;

import static java.lang.Math.round;

public class Sum {
    public static void main(String[] args) {
        // arrange
        List<Integer> numbers = Arrays.asList(5, 10, 15);

        List<Person> people = Arrays.asList(
                new Person("Alice", 50000),
                new Person("Bob", 60000),
                new Person("Charlie", 70000)
        );

        // sum numbers
        int sum = numbers.stream()
                .mapToInt(integer -> integer)
                .sum();
        System.out.println(sum); // 30

        // sum properties
        double sumOfSalaries = people.stream()
                .mapToDouble(p -> p.getSalary())
                .sum();
        System.out.println(round(sumOfSalaries)); // 180000
    }
}

class Person {
    private String name;
    private double salary;

    public Person(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}