package com.toheeb;

import java.util.Arrays;

public class RunningSumOfArray {
    public static int[] runningSum(int[] nums) {

        int[] runningSum = new int[nums.length];
        int sumAtStep = 0;
        for (int i = 0; i < nums.length; i++) {
            sumAtStep += nums[i];
            runningSum[i] = sumAtStep;
        }

        return runningSum;
        // System.out.print(Arrays.toString(ans));
    }

    public static void main(String[] args) {

        int[] input = { 0, 2, 1, 5, 3, 4 };
        int[] result = runningSum(input);
        System.out.print(Arrays.toString(result));
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://cutt.ly/30MsSPk
    // click on "Visualize Execution" when you get to the page to run the code and visualize;
}
