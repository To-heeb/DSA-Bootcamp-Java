package com.toheeb;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your watt hour usage per day ");

        float wattUsagePerDay = input.nextInt();
        float kiloWattPerDay = wattUsagePerDay / 1000;
        double billPerDay = kiloWattPerDay * 55.87;
        double billPerMonth = billPerDay * 30;

        System.out.println("Your monthly bill is ₦"+billPerMonth);

    }
}
