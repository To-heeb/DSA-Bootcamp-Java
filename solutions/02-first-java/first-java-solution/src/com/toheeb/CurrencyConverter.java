package com.toheeb;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println("Currency Converter");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in naira: ");

        if (input.hasNext()) {
            float naira = input.nextFloat();

            // Convert to dollar
            float dollar = naira / 775;
            System.out.println("₦" + naira + " is equal to $" + dollar);
        }
    }
}
