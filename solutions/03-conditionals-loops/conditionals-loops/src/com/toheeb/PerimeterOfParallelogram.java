package com.toheeb;

import java.util.*;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        System.out.println("Perimeter of a parallelogram");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the base and height of the parallelogram respactively: ");

        if (input.hasNextFloat()) {
            float base = input.nextFloat();
            float height = input.nextFloat();
            double perimeterOfParallelogram = 2 * (base + height);

            System.out.println("The perimeter of parallelogram with base " + base + " and height " + height + " is "
                    + perimeterOfParallelogram);
        }
    }
}
