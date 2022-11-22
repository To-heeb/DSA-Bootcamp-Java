package com.toheeb;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some input: ");
        if(input.hasNextInt()){
            int number = input.nextInt();
            if(number % 2 == 0){
                System.out.println(number +" is an even number");
            }else{
                System.out.println(number + " is an odd number");
            }
            System.exit(0);
        }
        System.out.println("Only Integers are allowed as input");
        main(args);
    }
}
