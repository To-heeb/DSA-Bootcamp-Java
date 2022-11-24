package com.toheeb;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        System.out.println("Area of rectangle");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length and breathe of the rectangle respectively: ");
        if (input.hasNextFloat()) {
            float length = input.nextFloat();
            float breathe = input.nextFloat();
            double areaOfTriangle = length * breathe;

            System.out.println("The area of the rectangle with length " + length + " and breathe " + breathe + " is "
                    + areaOfTriangle);
        }
    }
}
