package com.toheeb;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();

        String result = isPalindrome(number) ? " is palindrome" : " is not palindrome";
        System.out.println(number + result);

    }

    static boolean isPalindrome(int number){

        int originalNumber  = number;
        int reversedNumber = 0;
        int digit = 0;

        number = originalNumber;

        while(number != 0){
            int remainder = number % 10;
            reversedNumber =  (reversedNumber  * 10) + remainder;
            number /= 10;
        }

        return reversedNumber == originalNumber;
    }
}
