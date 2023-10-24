package com.codecool.rounding;

import static java.lang.Math.round;

public class Rounding {
    public static void main(String[] args) {
        System.out.println(round(3.141459)); // nearest whole number
        System.out.println(round(3.141459 * 100) / 100); // nearest whole number
        System.out.println(round(3.141459 * 100.00) / 100.00); // two decimals

        int percentage = (int) round(3.141459); // nearest whole number represented as int
    }
}
