package com.toheeb;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number you want factorize: ");

        int number = input.nextInt();
        int real_number = number;
        long factorial = 1;
        while (number > 1) {
            factorial *= number;
            number--;
        }

        System.out.println("Factorial of " + real_number + " is " + factorial);
    }
}
