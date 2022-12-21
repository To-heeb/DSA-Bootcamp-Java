package com.toheeb;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N number: ");
        int num1 = in.nextInt();
        long sum = sum(num1);
        System.out.println("The sum of fist "+num1+" numbers is "+sum);
    }

    static long sum(int num){
        long sum = 0;
        while(num != 0){
            sum += num;
            num--;
        }

        return sum;
    }
}
