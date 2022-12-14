package com.toheeb;

import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the present value of investment: ");
        float presentValue = input.nextFloat();
        System.out.print("Enter the interest paid by the investment: ");
        float interest = input.nextFloat();
        System.out.print("Enter the time period in years the investment will be held: ");
        float time = input.nextFloat();

        double futureInvestment = presentValue * Math.pow((1 + interest/100), time);

        System.out.println("The Future Investment is "+ futureInvestment);


    }
}
