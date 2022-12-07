package com.toheeb;

import java.util.*;

public class Largest {
    public static void main(String[] args) {
        System.out.println("Print the largest number");
        Scanner input = new Scanner(System.in);

        float largest = 0;
        while (true) {
            System.out.print("Please enter number: ");
            float number = input.nextInt();

            if (number != 0) {
                largest = Math.max(largest, number);
            } else {
                break;
            }

        }

        System.out.println("The largest numbers is " + largest);

    }

}
