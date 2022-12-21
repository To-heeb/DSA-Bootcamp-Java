package com.toheeb;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int product = product(num1,num2);
        System.out.println("Product of number is "+product);

    }

    static int product(int a, int b){
        return a * b;
    }
}
