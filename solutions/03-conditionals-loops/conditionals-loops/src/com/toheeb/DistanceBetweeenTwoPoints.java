package com.toheeb;

import java.util.Scanner;

public class DistanceBetweeenTwoPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float distanceBetweenTwoPoint = 0;
        System.out.print("Enter the first point: ");
        float firstPoint = input.nextInt();
        System.out.print("Enter the second point: ");
        float secondPoint = input.nextInt();

        if(firstPoint > secondPoint){
             distanceBetweenTwoPoint = firstPoint - secondPoint;
        }else{
             distanceBetweenTwoPoint = secondPoint - firstPoint;
        }

        System.out.print("The distance between the first and second point is "+distanceBetweenTwoPoint);
    }
}
