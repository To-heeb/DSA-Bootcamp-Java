package com.toheeb;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {

        int ans_length = 2 * nums.length;
        int[] ans = new int[ans_length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        return ans;
        // System.out.print(Arrays.toString(ans));
    }

    public static void main(String[] args) {

        int[] input = { 0, 2, 1, 5, 3, 4 };
        int[] result = getConcatenation(input);
        System.out.print(Arrays.toString(result));
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://cutt.ly/h0MspjM
    // click on "Visualize Execution" when you get to the page to run the code and visualize;
}
