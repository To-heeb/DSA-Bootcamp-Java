package com.toheeb;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 9, 3, 1 };
        int maxAmount = rob(nums);
        System.out.println(maxAmount);
    }

    public static int rob(int[] nums) {

        int prev2 = 0;
        int prev1 = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = prev1;
            prev1 = Math.max(prev2 + nums[i], prev1);
            prev2 = temp;
        }

        return prev1;
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://urlzs.com/j5VSF (recursion)
    // Link: https://urlzs.com/91RT6 (recursion with memoization)
    // Link: https://urlzs.com/9Vfg2 (iteration with memoization)
    // Link: https://urlzs.com/vuuf3 (iteration with two pointers)
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;

    // there is a question similar to this in pattern from the previous jump
    // question
    // please check for it
    // try to go through it again tomorrow 😢

}
