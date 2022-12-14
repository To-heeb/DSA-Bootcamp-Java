package com.toheeb;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter a string: ");
        String originalString = input.next();
        char stringChar[] = originalString.toCharArray();
        String reversedString = "";

        for (int i = (stringChar.length - 1); i >= 0; i--){
            reversedString += stringChar[i];
        }

        if(originalString.equalsIgnoreCase(reversedString)){
            System.out.println(originalString+" is a palindrome");
        }else{
            System.out.println(originalString+" is not a palindrome");
        }

    }
}
