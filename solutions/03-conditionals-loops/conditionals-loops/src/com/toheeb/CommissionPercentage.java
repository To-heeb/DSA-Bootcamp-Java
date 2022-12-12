package com.toheeb;

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the commission percentage? ");
        float comPercentage = input.nextFloat();
        System.out.print("What is the total sales made? ");
        float sales = input.nextFloat();

        float commission = (sales * comPercentage) / 100;

        System.out.println("Your commission is "+ commission);
    }
}
