package com.toheeb;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of subject to calculate for: ");
        int number = input.nextInt();
        int counter = 1;
        int scoreSum = 0;

        while(counter <= number){
            System.out.print("Enter your score for subject "+counter+": ");
            float score = input.nextInt();
            scoreSum += (score/ 10);

            counter++;
        }

        float cgpa = scoreSum / number;
        System.out.println("Your CGPA is "+ cgpa);
    }
}
