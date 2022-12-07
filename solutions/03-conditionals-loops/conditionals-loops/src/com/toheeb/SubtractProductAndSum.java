package com.toheeb;

import java.util.Scanner;

class subtractProductAndSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = input.nextInt();

        int originalNumber = n;
        int sum = 0;
        int product = 1;

        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            sum += remainder;
            product *= remainder;
            originalNumber /= 10;
        }

        int result = product - sum;
        System.out.println(result);

    }
}