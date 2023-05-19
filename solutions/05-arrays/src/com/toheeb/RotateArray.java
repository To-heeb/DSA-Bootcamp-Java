package com.toheeb;

import java.util.Arrays;

public class RotateArray {

    public static int[] rotateArray(int[] nums, int k) {

        if (k > nums.length) {
            k = k % nums.length;
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            if (i < k) {
                result[i] = nums[nums.length - k + i];
            } else {
                result[i] = nums[i - k];
            }
        }

        System.arraycopy(result, 0, nums, 0, nums.length);

        return nums;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int[] result = rotateArray(nums, k);
        System.out.println(Arrays.toString(result));
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://urlzs.com/tLMgJ [ Runtime: O(n²), Unoptimized solution]
    // Link: https://urlzs.com/DxeWw [ Runtime: O(n), Optimized solution]
    // Link: https://urlzs.com/eZWnJ [ Runtime: O(n), Optimized solution without
    // extra space]
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;

}