package com.toheeb;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Principle number: ");
        float principal = input.nextFloat();
        System.out.print("Enter Interest rate: ");
        float rate = input.nextFloat();
        System.out.print("Enter a Time period in years: ");
        float time = input.nextFloat();
        double compound_interest;

        compound_interest = principal * (Math.pow((1 + rate / 100), time)) - principal;

        System.out.println("The Compound Interest is: " + compound_interest);

    }
}
