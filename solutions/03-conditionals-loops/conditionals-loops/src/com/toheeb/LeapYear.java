package com.toheeb;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a calender year: ");
        int year = input.nextInt();
        boolean leapYearStatus = false;
        if(year % 400 == 0){
            leapYearStatus = true;
        }

        if(year % 4 == 0 && year % 100 != 0){
            leapYearStatus = true;
        }

        if(leapYearStatus){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }
    }
}
