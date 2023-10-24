package com.codecool.percentage;

import static java.lang.Math.round;

public class Percentage {
    public static void main(String[] args) {

        // get percentage if total: 100  part: 25
        double percentage = (double) 25 / 100 * 100;
        System.out.println(percentage);
        double percentage1 = (double) 100 * 0.25;
        System.out.println((int) round(percentage1)); // round to nearest whole number, and represent as int
    }
}
