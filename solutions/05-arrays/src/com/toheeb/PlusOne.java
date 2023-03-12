package com.toheeb;

import java.util.*;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        int length = digits.length - 1;

        for (int i = length; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] digits_plus_one = new int[digits.length + 1];
        digits_plus_one[0] = 1;
        return digits_plus_one;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int[] result = plusOne(nums);
        System.out.println(Arrays.toString(result));
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://urlzs.com/5Kwd1
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;
}
