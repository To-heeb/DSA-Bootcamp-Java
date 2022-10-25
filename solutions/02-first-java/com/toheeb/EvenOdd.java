package com.toheeb;

import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();

        if (number % 2 == 1) {
            System.out.println(number + " is a odd number");
        } else {
            System.out.println(number + " is an even number");
        }
    }
}
