package com.toheeb;

public class CanJump {

    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int reachable = 0;

        for (int i = 0; i < n; i++) {
            if (reachable < i)
                return false;
            reachable = Math.max(reachable, i + nums[i]);
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 1, 4 };
        boolean result = canJump(nums);
        System.out.println(result);
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://urlzs.com/yBj7x
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;

}
