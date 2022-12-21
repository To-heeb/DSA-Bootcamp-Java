package com.toheeb;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        boolean result = isPrime(number);
        System.out.println(result);
    }

    static boolean isPrime(int number){
        if (number <= 1) {
            return false;
        }
        int c = 2;
        while(c * c <= number){
            if(number % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
