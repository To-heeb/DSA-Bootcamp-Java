package com.toheeb;

import java.util.*;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        System.out.println("Perimeter of a rhombus");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the lenght of one of the sides rhombus respactively: ");

        if (input.hasNextFloat()) {
            float length = input.nextFloat();
            double perimeterOfRhombus = 4 * length;

            System.out.println(
                    "The perimeter of rhombus with length " + length + " of one of it sides  is "
                            + perimeterOfRhombus);
        }
    }
}
