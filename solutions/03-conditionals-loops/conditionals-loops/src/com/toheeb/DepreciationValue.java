package com.toheeb;

import java.util.Scanner;

public class DepreciationValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of item: ");
        float realValue = input.nextInt();
        System.out.print("Enter useful life of item: ");
        float usefulLife = input.nextInt();
        System.out.print("Enter scrap value of item: ");
        float scrapValue = input.nextInt();

        float depreciationValue = (realValue - scrapValue) / usefulLife;

        System.out.println("The depreciation value per year "+depreciationValue);


    }
}
