package com.toheeb;

import java.util.Scanner;
import java.lang.Math;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Area of a Cirle");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius of the circle: ");
        if (input.hasNextFloat()) {
            float radius = input.nextFloat();
            double areaOfCircle = Math.PI * Math.pow(radius, 2);

            System.out.println("The area of a circle with radius " + radius + " is " + areaOfCircle);
        }
    }
}
