package com.toheeb;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the workdone in joules: ");
        float work = input.nextFloat();
        System.out.print("Please enter the time in seconds: ");
        float time = input.nextFloat();

        float power = work / time;
        System.out.println("The power is " + power +" watt(s)");


    }
}
