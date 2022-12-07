package com.toheeb;

import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int count = 1;
        float sum = 0;
        float average = 0;
        int N = input.nextInt();

        while(count <= N){
            System.out.print("Enter the "+count+" number: ");
            float nextValue = input.nextInt();
            sum += nextValue;
            count++;
        }

        average = sum/count;
        System.out.println("The average is "+average);
    }
}
