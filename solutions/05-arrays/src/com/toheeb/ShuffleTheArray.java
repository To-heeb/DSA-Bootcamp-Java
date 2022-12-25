package com.toheeb;

import java.util.Arrays;

public class ShuffleTheArray {

    public static int[] shuffle(int[] nums, int n) {

        if ((n * 2) != nums.length) {
            // throw custom error here
            return nums;
        }

        int[] ans = new int[nums.length];
        int i = 0;
        for (int j = 0; j < n; j++) {
            ans[i] = nums[j];
            ans[i + 1] = nums[j + n];

            i += 2;
        }

        return ans;
        // System.out.print(Arrays.toString(ans));
    }

    public static void main(String[] args) {

        int[] input = { 1, 2, 3, 4, 4, 3, 2, 1 };
        int n = input.length / 2;
        int[] result = shuffle(input, n);
        System.out.print(Arrays.toString(result));
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://cutt.ly/q0MV0SC
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;
}
