package com.toheeb;

import java.util.*;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        System.out.println("Perimeter of a Cirle");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius of the circle: ");
        if (input.hasNextFloat()) {
            float radius = input.nextFloat();
            double perimeterOfCircle = Math.PI * radius * 2;

            System.out.println("The perimeter of a circle with radius " + radius + " is " + perimeterOfCircle);
        }
    }
}
