package com.toheeb;

import java.util.*;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        System.out.println("Area of a parallelogram");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the base and height of the parallelogram respactively: ");

        if (input.hasNextFloat()) {
            float base = input.nextFloat();
            float height = input.nextFloat();
            double areaOfParallelogram = base * height;

            System.out.println("The area of parallelogram with base " + base + " and height " + height + " is "
                    + areaOfParallelogram);
        }
    }
}
