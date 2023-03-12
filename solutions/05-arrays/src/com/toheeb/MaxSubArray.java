package com.toheeb;

public class MaxSubArray {

    public static int maxSubArray(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;

        int maxSum = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {

            maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
            maxSum = Math.max(maxEndingHere, maxSum);
        }

        return maxSum;

        // the same solution
        // int n = nums.length;
        // int max = Integer.MIN_VALUE, sum = 0;
        // for(int i=0;i<n;i++){
        // sum += nums[i];
        // max = Math.max(sum,max);
        // if(sum<0) sum = 0;
        // }
        // return max;
    }

    public static void main(String[] args) {
        int[] num = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int result = maxSubArray(num);
        System.out.print(result);
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://urlzs.com/dUHe6
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;
}
