package com.toheeb;

import java.util.Scanner;

public class DisplayGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Subjects: ");
        int count = input.nextInt();
        float totalMarks = 0;
        int originalCount = count;
        while(count != 0){
            System.out.print("Enter mark for "+count+" subject: ");
            int mark = input.nextInt();
            totalMarks += mark;

            count--;
        }
        System.out.println(totalMarks);
        totalMarks = (totalMarks / (originalCount * 100)) * 100;

        System.out.println("Your grade is "+getGrade(totalMarks));

    }

    static String getGrade(float mark){
        String grade;
        if (mark >= 91 && mark <= 100) {
            grade = "AA";
        } else if (mark >= 81 && mark <= 90) {
            grade = "AB";
        } else if (mark >= 71 && mark <= 80) {
            grade = "BB";
        } else if (mark >= 61 && mark <= 70) {
            grade = "BC";
        }  else if (mark >= 51 && mark <= 60) {
            grade = "CD";
        } else if (mark >= 41 && mark <= 50) {
            grade = "DD";
        } else if (mark <= 40) {
            grade = "Fail";
        } else {
            throw new IllegalStateException("Unexpected value: " + mark);
        }
        return grade;
    }
}
