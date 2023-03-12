package com.toheeb;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        int index = 0;
        int current = 0;
        int previous = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            current = nums[i];
            if (current != previous) {
                nums[index++] = nums[i];
                previous = current;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int result = removeDuplicates(nums);
        System.out.print(result);
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://urlzs.com/cXW3S
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;

}
