package com.toheeb;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the discount percentage: ");
        float discountPercentage = input.nextInt();
        System.out.print("Enter the product price: ");
        float productPrice = input.nextInt();
        float discount = (discountPercentage/100) * productPrice;

        float discountedPrice = productPrice - discount;

        System.out.println("The discount price is "+discountedPrice);
    }
}
