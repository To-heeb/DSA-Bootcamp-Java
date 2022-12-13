package com.toheeb;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int count = 1;
        float sum = 0;
        int N = input.nextInt();

        while(count <= N){
            System.out.print("Enter the "+count+" number: ");
            float nextValue = input.nextInt();
            sum += nextValue;

            count++;
        }

        System.out.println("The sum is "+sum);
    }
}
