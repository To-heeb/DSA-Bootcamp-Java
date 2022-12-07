package com.toheeb;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);

        int series = input.nextInt();
        int previous = 0;
        int counter = 0;
        int next = 1;
        while (counter <= series) {
            System.out.print(previous + ", ");
            int newNext = next;
            next = previous + next;
            previous = newNext;

            counter++;
        }
    }
}
