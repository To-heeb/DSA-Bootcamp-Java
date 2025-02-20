package com.toheeb;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int numberOne = input.nextInt();
        System.out.print("Enter second number: ");
        int numberTwo = input.nextInt();
        int max = 0;
        int min = 0;

        if (numberOne == 0 && numberTwo == 0) {
            System.out.println("The HCF is 0");
            System.exit(1);
        }

        if (numberOne == 0) {
            System.out.println("The HCF is " + numberTwo);
            System.exit(1);
        }

        if (numberTwo == 0) {
            System.out.println("The HCF is " + numberOne);
            System.exit(1);
        }

        if (numberOne == 1 || numberTwo == 1) {
            System.out.println("The HCF is 1");
            System.exit(1);
        }

        if (numberOne > numberTwo) {
            max = numberOne;
            min = numberTwo;
        } else {
            max = numberTwo;
            min = numberOne;
        }

        // while (min != 0) {
        // int temp = min;
        // min = max % min;
        // max = temp;
        // }

        while (min != 0) {
            if (numberOne > numberTwo) {
                numberOne %= numberTwo;
                max = numberTwo;
                min = numberOne;
            } else {
                numberTwo %= numberOne;
                max = numberOne;
                min = numberTwo;
            }
        }

        System.out.println("The HCF is " + max);
    }
}
