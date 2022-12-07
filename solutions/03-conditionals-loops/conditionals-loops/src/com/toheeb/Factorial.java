package com.toheeb;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number you want factorize: ");

        int number = input.nextInt();
        int real_number = number;
        int factor = 1;
        while(number > 1){
            factor *= number;
            number--;
        }

        System.out.println("Factor of "+real_number+" is "+factor);
    }
}
