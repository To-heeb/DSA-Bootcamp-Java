package com.toheeb;

import java.util.*;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println("Print sum of numbers");
        Scanner input = new Scanner(System.in);

        float sum = 0;
        while (true) {
            System.out.print("Please enter number: ");
            float number = input.nextFloat();

            if (number != 0) {
                sum += number;
            } else {
                break;
            }

        }

        System.out.println("The sum of numbers is " + sum);

    }
}
