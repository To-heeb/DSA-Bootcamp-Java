package com.toheeb;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int originalNumber = input.nextInt();
        int number = originalNumber;
        int digit = 0;
        int total = 0;
        while(number != 0){
            //int remainder = number % 10;
            digit++;
            number /= 10;
        }

        number = originalNumber;

        while(number != 0){
            int remainder = number % 10;
            total += Math.pow(remainder, digit);
            number /= 10;
        }

        if(originalNumber == total){
            System.out.println(originalNumber+" is an armstrong number");
        }else{
            System.out.println(originalNumber+" is not an armstrong number");
        }
    }
}
