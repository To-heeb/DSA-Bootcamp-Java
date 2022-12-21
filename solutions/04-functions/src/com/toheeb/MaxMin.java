package com.toheeb;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, max, min;
        System.out.print("Please enter first number: ");
         a = input.nextInt();
        System.out.print("Please enter second number: ");
        b = input.nextInt();
        System.out.print("Please enter third number: ");
        c = input.nextInt();
        max = max(a,b,c);
        min = min(a,b,c);
        System.out.println("The maximum number is "+max+" and the minimum number is "+min);
    }

    static int max(int a, int b, int c){
        int max;
        max = Math.max(a, b);
        max = Math.max(max, c);
        return max;
    }

    static int min(int a, int b, int c){
        int min;
        min = Math.min(a, b);
        min = Math.min(min, c);
        return min;
    }
}
