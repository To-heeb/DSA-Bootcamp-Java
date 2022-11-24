package com.toheeb;

import java.util.*;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        System.out.println("Perimeter of square");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length of one of the sides the square: ");
        if (input.hasNextFloat()) {
            float length = input.nextFloat();
            double perimeterOfSquare = 4 * length;

            System.out.println("The perimeter of the square with length " + length + " is "
                    + perimeterOfSquare);
        }
    }
}
