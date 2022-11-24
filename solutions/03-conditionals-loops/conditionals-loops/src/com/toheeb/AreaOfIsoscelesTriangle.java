package com.toheeb;

import java.util.*;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        System.out.println("Area of isosceles triangle");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the base and height of the triangle respactively: ");

        if (input.hasNextFloat()) {
            float base = input.nextFloat();
            float height = input.nextFloat();
            double areaOfIsoscelesTriangle = 0.5 * (base * height);

            System.out.println(
                    "The area of an isosceles triangle with base " + base + " and height " + height + " is "
                            + areaOfIsoscelesTriangle);
        }
    }
}