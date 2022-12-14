package com.toheeb;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a string: ");
        String originalString = input.next();
        String reversedString = "";
        for (int i =0; i < originalString.length(); i++){
            reversedString = originalString.charAt(i) + reversedString;
        }

        System.out.println("The reversed string is: "+reversedString);
    }
}
