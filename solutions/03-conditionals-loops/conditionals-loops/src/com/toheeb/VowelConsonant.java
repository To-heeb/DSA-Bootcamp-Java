package com.toheeb;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String character = input.next();

        if(character.length() > 1){
            System.out.print("Only one character is allowed");
            System.exit(1);
        }

        switch (character){
            case "a":
            case "e":
            case "i":
            case "o":
                System.out.println("This is a vowel character");
                break;
            case "u":
                System.out.println("This is a vowel character");
                break;
            default:
                System.out.println("This is a consonant character");
                break;
        }
    }
}
