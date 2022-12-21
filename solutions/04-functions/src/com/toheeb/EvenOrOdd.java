package com.toheeb;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();

        String result = isEven(number) ?  "even" :  "odd" ;
        System.out.println(number+" is "+ result);
    }

    static boolean  isEven(int numb){
        return numb % 2 == 0;
    }
}
