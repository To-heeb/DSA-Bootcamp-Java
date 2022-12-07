package com.toheeb;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        int c = 2;
        String factors = "";
        while (c * c <= number) {
            if (number % c == 0) {
                factors += c + ", ";
            }
            c++;
        }
        if (factors.isEmpty()) {
            System.out.println(number + " is a prime number, therefore has no factor");
        } else {
            System.out.println(number + " factor(s) is(are) " + factors);
        }
    }
}
