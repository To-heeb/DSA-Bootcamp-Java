package com.toheeb;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Check if palindrome or not");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter word here: ");
        if(input.hasNext()){
            String string = input.next();
            String palindromeString = "";

            for (int i = 0; i < string.length(); i++){
                palindromeString = string.charAt(i) + palindromeString;
            }

            if(string.equalsIgnoreCase(palindromeString)){
                System.out.println(string +" is a palindrome");
            }else{
                System.out.println(string +" is a not palindrome");
            }


        }else{
            System.out.println("Only strings are allowed");
            main(args);
        }
    }
}
