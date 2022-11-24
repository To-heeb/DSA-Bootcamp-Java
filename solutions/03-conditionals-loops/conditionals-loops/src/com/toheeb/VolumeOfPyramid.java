package com.toheeb;

import java.util.*;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        System.out.println("Volume of a pyramid");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the base area and height of the pyramid respectively: ");

        if (input.hasNextFloat()) {
            float baseArea = input.nextFloat();
            float height = input.nextFloat();
            double constant = (float) 1 / 3;
            double volumeOfPyramid = constant * baseArea * height;

            System.out.println(
                    "The volume of the pyramid with height " + height + " and base area " + baseArea + " is "
                            + volumeOfPyramid);
        }
    }
}
