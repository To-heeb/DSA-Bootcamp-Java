package com.toheeb;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        System.out.println("Area of a rhombus");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the lenght of both diagonals of the rhombus respactively: ");

        if (input.hasNextFloat()) {
            float diagonalOne = input.nextFloat();
            float diagonalTwo = input.nextFloat();
            double areaOfRhombus = diagonalOne * diagonalTwo;

            System.out.println("The area of rhombus with diagonals " + diagonalOne + " and " + diagonalTwo + " is "
                    + areaOfRhombus);
        }
    }

}
