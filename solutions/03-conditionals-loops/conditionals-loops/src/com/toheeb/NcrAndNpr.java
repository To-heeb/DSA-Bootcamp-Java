package com.toheeb;

import java.util.Scanner;

public class NcrAndNpr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = input.nextInt();
        System.out.print("Enter value of r: ");
        int r = input.nextInt();

        double permutation = factorial(n)/factorial(n-r);
        double combination = factorial(n)/ (factorial(n-r) * factorial(r));

        if(n >= r){
            System.out.println("The value of "+n+"P"+r+" is : "+permutation);
            System.out.println("The value of "+n+"C"+r+" is : "+combination);
        }else{
            System.out.println("n value should be greater than or equals to r value");
         }
    }

    static long factorial(float n){
        long number = 1;
        while(n > 1){
            number *= n;
            n--;
        }
        return number;
    }
}
