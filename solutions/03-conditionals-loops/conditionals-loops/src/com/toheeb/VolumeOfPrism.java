package com.toheeb;

import java.util.*;

public class VolumeOfPrism {
    public static void main(String[] args) {
        System.out.println("Volume of a prism");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the base area and height of the prism respectively: ");

        if (input.hasNextFloat()) {
            float baseArea = input.nextFloat();
            float height = input.nextFloat();
            double volumeOfPrism = baseArea * height;

            System.out.println(
                    "The volume of the prism with height " + height + " and base area " + baseArea + " is "
                            + volumeOfPrism);
        }
    }
}
