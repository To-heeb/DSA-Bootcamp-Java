package com.toheeb;

import java.util.*;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        System.out.println("Volume of a cynlinder");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius and height of the cynlinder respectively: ");

        if (input.hasNextFloat()) {
            float radius = input.nextFloat();
            float height = input.nextFloat();

            double volumeOfCylinder = Math.PI * Math.pow(radius, 2) * height;

            System.out.println(
                    "The volume of the cynlinder with height " + height + " and radius " + radius + " is "
                            + volumeOfCylinder);
        }
    }
}
