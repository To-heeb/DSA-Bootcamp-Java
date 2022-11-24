package com.toheeb;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the fibonacci count: ");
        int n = input.nextInt();
        System.out.println("Fibonacci series till " + n + "th number");
        int firstNumber = 0;
        int secondNumber = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(firstNumber + ", ");
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
