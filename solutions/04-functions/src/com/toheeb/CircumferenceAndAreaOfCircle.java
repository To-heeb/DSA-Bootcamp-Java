package com.toheeb;

import java.util.Scanner;

public class CircumferenceAndAreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius of the circle: ");
        float radius = input.nextFloat();
        double circumferenceOfCircle = circumferenceOfCircle(radius);
        double areaOfCircle = areaOfCircle(radius);

        System.out.println("The area of circle is " + areaOfCircle + " and the circumference of the circle is "+ circumferenceOfCircle );
    }

    static double circumferenceOfCircle(float radius){
        double circumferenceOfCircle = Math.PI * radius * 2;
        return circumferenceOfCircle;
    }

    static double areaOfCircle(float radius){
        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        return areaOfCircle;
    }
}
