package com.codecool.stream_count;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Count {
    public static void main(String[] args) {
        // arrange
        List<Integer> numbers = Arrays.asList(15, 34, 42, 53);

        List<Product> products = Arrays.asList(
                new Product("Product A", "Category 1"),
                new Product("Product B", "Category 2"),
                new Product("Product C", "Category 1"),
                new Product("Product D", "Category 3"),
                new Product("Product E", "Category 2"),
                new Product("Product F", "Category 1")
        );

        // count the even numbers
        long count = numbers.stream()
                .filter(integer -> integer % 2 == 0)
                .count();
        System.out.println(count); // 2

        // count the even numbers alternative solution
        long coun1 = numbers.stream()
                .filter(integer -> integer % 2 == 0)
                .mapToInt(integer -> 1)
                .sum();
        System.out.println(coun1); // 2

        //Counting the number of products in each category using Java streams
        Map<String, Long> countByCategory = products.stream()
                .collect(Collectors.toMap(
                        p -> p.getCategory(),
                        p -> 1L,
                        (count1, count2) -> count1 + count2
                ));
        countByCategory.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + "; Count: " + entry.getValue()));

    }
}

class Product {
    private String name;
    private String category;

    public Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}