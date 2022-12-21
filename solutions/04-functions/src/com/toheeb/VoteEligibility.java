package com.toheeb;

import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        String result = isEligible(age) ? "eligible to vote" : "not eligible to vote";
        System.out.println("You're "+ result);
    }

    static boolean isEligible(int age){
        return age >= 18;
    }
}
