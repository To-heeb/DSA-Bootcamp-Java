package com.toheeb;

import java.util.Scanner;

public class PythagoreanTriples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = in.nextInt();
        System.out.println("Are these number pythagorean triples?");
        System.out.println(isPythagoreanTriples(num1, num2, num3));
    }

    static boolean isPythagoreanTriples(int a, int b, int c){
        a = a * a;
        b = b * b;
        c = c * c;
        if (a == b + c || b == c + a || c == b + a) return true;
        return false;
    }
}
