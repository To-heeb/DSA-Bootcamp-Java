package com.toheeb;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {
        System.out.println("Area of a triangle");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the base and height of the triangle respactively: ");

        if (input.hasNextFloat()) {
            float base = input.nextFloat();
            float height = input.nextFloat();
            double areaOfTriangle = 0.5 * base * height;

            System.out.println(
                    "The area of triangle with base " + base + " and height " + height + " is " + areaOfTriangle);
        }
    }
}
