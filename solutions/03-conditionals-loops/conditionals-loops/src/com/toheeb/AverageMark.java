package com.toheeb;

import java.util.Scanner;

public class AverageMark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers of mark: ");
        int count = 1;
        float sum = 0;
        float average = 0;
        int number = input.nextInt();

        while(count <= number){
            System.out.print("Enter the "+count+" mark: ");
            float nextValue = input.nextInt();
            sum += nextValue;
            count++;
        }

        average = sum/count;
        System.out.println("The average mark is "+average);

    }
}
