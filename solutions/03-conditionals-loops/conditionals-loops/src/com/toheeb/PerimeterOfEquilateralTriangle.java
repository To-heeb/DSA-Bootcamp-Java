package com.toheeb;

import java.util.*;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        System.out.println("Perimeter of an equilateral triangle");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length of one of the sides of the equilateral triangle: ");

        if (input.hasNextFloat()) {
            float length = input.nextFloat();

            double perimeterOfEquilateralTriangle = 3 * length;

            System.out.println(
                    "The perimeter of equilatral triangle with length " + length + " is "
                            + perimeterOfEquilateralTriangle);
        }
    }
}
