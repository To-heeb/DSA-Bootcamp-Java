package com.toheeb;

import java.util.*;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        System.out.println("Curved surface area of cylinder");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius and height of the cone respectively: ");

        if (input.hasNextFloat()) {
            float radius = input.nextFloat();
            float height = input.nextFloat();

            double curvedSurfaceAreaOfCylinder = 2 * Math.PI * radius * height;

            System.out.println(
                    "The curved surface area of cylinder with height " + height + " and radius " + radius + " is "
                            + curvedSurfaceAreaOfCylinder);
        }
    }
}
