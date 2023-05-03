package com.toheeb;

import java.util.*;

public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {

        int nums_length = nums.length;
        int[] answer = new int[nums_length];
        int[] left = new int[nums_length];
        int[] right = new int[nums_length];
        int current = 1;

        for (int i = 0; i < nums_length; i++) {
            left[i] = current;
            current *= nums[i];
        }

        current = 1;
        for (int i = nums_length - 1; i >= 0; i--) {
            right[i] = current;
            current *= nums[i];
        }

        for (int i = 0; i < nums_length; i++) {
            answer[i] = left[i] * right[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4 };
        int[] result = productExceptSelf(nums);

        System.out.println(Arrays.toString(result));
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://urlzs.com/y9Ypz => O(n²) solution
    // Link: https://urlzs.com/woP7y => O(n) solution
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;
}
