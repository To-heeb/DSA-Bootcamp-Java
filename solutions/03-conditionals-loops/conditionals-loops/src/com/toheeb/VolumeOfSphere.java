package com.toheeb;

import java.util.*;

public class VolumeOfSphere {
    public static void main(String[] args) {
        System.out.println("Volume of a sphere");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius of the sphere : ");

        if (input.hasNextFloat()) {
            float radius = input.nextFloat();
            double constant = (float) 4 / 3; // Math.floorDiv(1, 3);
            double volumeOfSphere = constant * Math.PI * Math.pow(radius, 3);

            System.out.println(
                    "The volume of the sphere with radius " + radius + " is "
                            + volumeOfSphere);
        }
    }
}
