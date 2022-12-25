package com.toheeb;

import java.util.Arrays;

public class ArrayFromPermutation {

    public static int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int index = nums[i];
            ans[i] = nums[index];
        }

        return ans;
        // System.out.print(Arrays.toString(ans));
    }

    public static void main(String[] args) {

        int[] input = { 0, 2, 1, 5, 3, 4 };
        int[] result = buildArray(input);
        System.out.print(Arrays.toString(result));
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // https://cutt.ly/I0MsyYJ
    // click on "Visualize Execution" when you get to the page to run the code and visualize;

}
