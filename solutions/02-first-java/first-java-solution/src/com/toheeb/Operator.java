package com.toheeb;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        System.out.println("Calculator X");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        if(input.hasNextFloat()){
            float numberOne = input.nextFloat();
            System.out.print("Please enter second number: ");

            if(input.hasNextFloat()){
                float numberTwo = input.nextFloat();
                System.out.print("Please enter one of the operators(+, -, *, /): ");

                if(input.hasNext()){
                    String operator = input.next();
                    float total = switch (operator) {
                        case "+" -> numberOne + numberTwo;
                        case "-" -> numberOne - numberTwo;
                        case "*" -> numberOne * numberTwo;
                        case "/" -> numberOne / numberTwo;
                        default -> 0;
                    };

                    System.out.println("Result :" + total);
                }else{
                    System.out.println("Only Integers are allowed as input");
                    main(args);
                }
            }else{

            }

        }else{
            System.out.println("Only Integers are allowed as input");
            main(args);
        }
    }
}
