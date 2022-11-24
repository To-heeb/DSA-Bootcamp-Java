package com.toheeb;

import java.util.*;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        System.out.println("Area of an equilateral triangle");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length of one of the sides of the equilateral triangle: ");

        if (input.hasNextFloat()) {
            float length = input.nextFloat();

            double areaOfEquilateralTriangle = Math.sqrt(3) * (Math.pow(length, 2) / 4);

            System.out.println(
                    "The area of equilatral triangle with length " + length + " is " + areaOfEquilateralTriangle);
        }
    }
}
