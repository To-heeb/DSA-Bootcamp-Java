package com.toheeb;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        if (input.hasNext()){
            String name = input.next();

            System.out.println("Welcome "+ name + " to my java course");
        }
    }
}
