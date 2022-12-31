package com.toheeb;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Get Armstrong number");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter lower bound number: ");
        int lowerBound = input.nextInt();
        System.out.print("Please enter upper bound number: ");
        int upperBound = input.nextInt();

        for (int i = lowerBound; i < upperBound; i++) {

            int digit = 0;
            int result = 0;
            int originalNumber = i;

            // count digit here
            while (originalNumber != 0) {
                originalNumber /= 10;
                ++digit;
            }

            originalNumber = i;

            // add by the power of numbers in the digit
            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, digit);
                originalNumber /= 10;
            }

            if (result == i) {
                System.out.print(i + ", ");
            }
        }
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how this code runs
    // Link: https://urlzs.com/aEFSt
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;
}
