package com.toheeb;

import java.util.Scanner;

public class SumOfNTypeNumbers {
    public static void main(String[] args) {
        System.out.println("Print sum of numbers");
        Scanner input = new Scanner(System.in);

        float sumOfNegativeNumbers = 0;
        float sumOfEvenPositiveNumbers = 0;
        float sumOfOddPositiveNumbers = 0;

        while (true) {
            System.out.print("Please enter number: ");
            float number = input.nextFloat();

            if (number != 0) {

                //sum of negative numbers
                if(number < 0){
                    sumOfNegativeNumbers += number;
                }
                //sum of positive even numbers
                if(number > 0 && number % 2 == 0){
                    sumOfEvenPositiveNumbers += number;
                }

                //sum of positive odd numbers
                if(number > 0 && number % 2 != 0){
                    sumOfOddPositiveNumbers += number;
                }
            } else {
                break;
            }

        }

        System.out.println("The sum of negative numbers is " + sumOfNegativeNumbers);
        System.out.println("The sum of even positive numbers is " + sumOfEvenPositiveNumbers);
        System.out.println("The sum of odd positive numbers is " + sumOfOddPositiveNumbers);

    }
}
