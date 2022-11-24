package com.toheeb;

import java.util.*;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        System.out.println("Total surface area of cube");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length of one of the sides the cube: ");
        if (input.hasNextFloat()) {
            float length = input.nextFloat();
            double totalSurfaceAreaOfCube = 6 * Math.pow(length, 2);

            System.out.println("The total surface area of cube with length " + length + " is "
                    + totalSurfaceAreaOfCube);
        }
    }
}
