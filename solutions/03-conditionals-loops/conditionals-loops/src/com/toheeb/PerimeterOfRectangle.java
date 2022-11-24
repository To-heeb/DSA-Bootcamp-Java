package com.toheeb;

import java.util.*;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        System.out.println("Perimeter of rectangle");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length and breathe of the rectangle respectively: ");
        if (input.hasNextFloat()) {
            float length = input.nextFloat();
            float breathe = input.nextFloat();
            double perimeterOfRectangle = 2 * (length + breathe);

            System.out
                    .println("The perimeter of the rectangle with length " + length + " and breathe " + breathe + " is "
                            + perimeterOfRectangle);
        }
    }
}
