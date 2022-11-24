package com.toheeb;

import java.util.*;

public class VolumeOfCone {
    public static void main(String[] args) {
        System.out.println("Volume of a cone");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius and height of the cone respectively: ");

        if (input.hasNextFloat()) {
            float radius = input.nextFloat();
            float height = input.nextFloat();
            double constant = (float) 1 / 3; // Math.floorDiv(1, 3);
            double volumeOfCone = constant * Math.PI * Math.pow(radius, 2) * height;

            System.out.println(
                    "The volume of the cone with height " + height + " and radius " + radius + " is "
                            + volumeOfCone);
        }
    }
}
