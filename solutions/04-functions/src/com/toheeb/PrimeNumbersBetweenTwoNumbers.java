package com.toheeb;

import java.util.Scanner;

public class PrimeNumbersBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter lower bound number: ");
        int num1 = in.nextInt();
        System.out.print("Enter upper bound number: ");
        int num2 = in.nextInt();
        primeNumbers2(num1, num2);
    }

    static void primeNumbers(int a, int b){
        String primeNumber = "";
        for(int i = a; i < b; i++){

            int count = 2;
            while(count * count <= i){
                if(i % count == 0){
                    break;
                }
                count++;
            }

            if(count * count > i){
                primeNumber += i;
                primeNumber += ", ";
                continue;
            }

        }

        System.out.println("Prime numbers between "+a+" and "+b+" is "+primeNumber);
    }

    static void primeNumbers2(int a, int b){
        String primeNumber = "";
        for(int i = a; i < b; i++){
            if(isPrime(i)){
                primeNumber += i;
                primeNumber += ", ";
            }
        }
        System.out.println("Prime numbers between "+a+" and "+b+" is "+primeNumber);
    }

    static boolean isPrime(int number){
        if (number <= 1) {
            return false;
        }
        int c = 2;
        while(c * c <= number){
            if(number % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }

}
