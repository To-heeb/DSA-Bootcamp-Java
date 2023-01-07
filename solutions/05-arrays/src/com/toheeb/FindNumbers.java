package com.toheeb;

public class FindNumbers {
    public static int findNumbers(int[] nums) {

        int result = 0;
        for (int i = 0; i < nums.length; i++) {

            int digit = 0;
            int num = nums[i];
            while (num != 0) {
                digit++;
                num /= 10;
            }

            if (isEven(digit))
                result++;
        }

        return result;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        int result = findNumbers(nums);
        System.out.print(result);

    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://cutt.ly/x2vmiyc
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;
}
