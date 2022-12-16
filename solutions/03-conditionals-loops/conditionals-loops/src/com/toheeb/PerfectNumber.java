package com.toheeb;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number here: ");
        int number = input.nextInt();
        int count = 2;
        int perfectNumber = 1;

        while(count*count < number){
            int remainder = number % count;
            if(remainder == 0){
               int secondFactor = number / count;
                perfectNumber += (count + secondFactor);
            }
            count++;
        }

        if(number == perfectNumber){
            System.out.println(number + " is a perfect number.");
        }else{
            System.out.println(number + " is not a perfect number.");
        }
    }
}
