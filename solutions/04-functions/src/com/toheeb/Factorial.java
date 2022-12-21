package com.toheeb;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        System.out.println("Factorial of "+number+" is "+factorial(number));
    }

    static double factorial(int number){
        if (number < 1) {
            return 0;
        }
        if(number == 1 || number == 0){
            return 1;
        }

        int counter = number;
        double factorial = 1;
        while(counter > 1){
            factorial *= counter;
            counter--;
        }
        return factorial;
    }
}
