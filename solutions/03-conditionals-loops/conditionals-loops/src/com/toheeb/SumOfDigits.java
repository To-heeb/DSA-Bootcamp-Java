package com.toheeb;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int number = input.nextInt();
        int tempNumber = number;
        int sum = 0;
        while(number != 0){
            int remainder = number % 10;
            sum += remainder;
            number /= 10;
        }

        System.out.println("Sum of "+tempNumber+" is "+sum);
    }
}
