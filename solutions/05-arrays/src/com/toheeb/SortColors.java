package com.toheeb;

import java.util.Arrays;

public class SortColors {

    public static void sortColors(int[] nums) {
        // Three pointer algorithms(Dutch National Flag algorithm[one-pass/in-place])

        int low = 0;
        int high = nums.length - 1;
        int kounter = 0;
        while (kounter <= high) {
            if (nums[kounter] == 0) {
                swap(low, kounter, nums);
                low++;
                kounter++;
            } else if (nums[kounter] == 1) {
                kounter++;
            } else if (nums[kounter] == 2) {
                // System.out.println(i+" "+high);
                swap(kounter, high, nums);
                high--;
            }
        }
    }

    public static void swap(int num1, int num2, int[] nums) {

        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }

    public static void main(String[] args) {

        int[] nums = { 2, 0, 2, 1, 1, 0 };
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://urlzs.com/3Yfx3
    // Link: https://urlzs.com/8uvrp (Python solution)
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;
}
