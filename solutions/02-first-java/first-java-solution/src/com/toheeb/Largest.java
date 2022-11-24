package com.toheeb;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        System.out.println("Print largest number");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        if (input.hasNextFloat()) {
            float numberOne = input.nextFloat();
            System.out.print("Please enter second number: ");

            if (input.hasNextFloat()) {
                float numberTwo = input.nextFloat();
                if (numberTwo > numberOne) {
                    System.out.println("The largest number is : " + numberTwo);
                } else {
                    System.out.println("The largest number is : " + numberOne);
                }

            } else {
                System.out.println("Only Integers are allowed as input");
                main(args);
            }
        } else {
            System.out.println("Only Integers are allowed as input");
            main(args);
        }

    }
}
