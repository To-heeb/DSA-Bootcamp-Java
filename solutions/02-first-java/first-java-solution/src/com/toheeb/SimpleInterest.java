package com.toheeb;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Welcome to the simple interest calculator");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your principal: ");
        if(input.hasNextInt()){
            int principal = input.nextInt();
            System.out.print("Please enter your annual rate: ");
            if(input.hasNextFloat()){
                float rate = input.nextFloat();
                System.out.print("Please enter your annual time: ");
                if(input.hasNextInt()){
                    int time = input.nextInt();
                    float simpleInterest = (principal + rate + time)/ 100;

                    System.out.println("Your simple interest is: "+ simpleInterest);
                }else{
                    System.out.println("Only Integers are allowed as Time");
                    main(args);
                }
            }else{
                System.out.println("Only Integers are allowed as Rate");
                main(args);
            }

        }else{
            System.out.println("Only Integers are allowed as Principal");
            main(args);
        }
    }
}
