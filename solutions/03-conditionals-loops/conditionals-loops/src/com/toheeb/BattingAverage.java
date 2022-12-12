package com.toheeb;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of runs scored by the batter: ");
        float runsScored = input.nextInt();
        System.out.print("Enter the number of times the batter has been caught out.: ");
        float timesOut = input.nextInt();

        float battingAverage = runsScored / timesOut;

        System.out.println("The batting average is: " + battingAverage);
    }
}
