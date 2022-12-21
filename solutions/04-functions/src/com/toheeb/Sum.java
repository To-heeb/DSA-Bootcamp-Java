package com.toheeb;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = sum(num1,num2);
        System.out.println("Sum of number is "+sum);
    }

    static int sum(int a, int b){
        return a + b;
    }
}
