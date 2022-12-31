package com.toheeb;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Check if palindrome or not");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter word here: ");
        if (input.hasNext()) {
            String string = input.next();
            String palindromeString = "";

            for (int i = 0; i < string.length(); i++) {
                palindromeString = string.charAt(i) + palindromeString;
            }

            if (string.equalsIgnoreCase(palindromeString)) {
                System.out.println(string + " is a palindrome");
            } else {
                System.out.println(string + " is a not palindrome");
            }

        } else {
            System.out.println("Only strings are allowed");
            main(args);
        }
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how this code runs
    // Link: https://urlzs.com/Nhyhy
    // Link to another way to solve code: https://onecompiler.com/java/3ytgcwm7m
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;
}
