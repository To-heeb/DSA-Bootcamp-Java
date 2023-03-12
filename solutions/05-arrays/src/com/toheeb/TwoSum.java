package com.toheeb;

import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        // Time complexity O(n)

        HashMap<Integer, Integer> checkNumber = new HashMap<Integer, Integer>();

        for (int i = 0; i <= nums.length - 1; i++) {

            int secondNumber = target - nums[i];
            // System.out.println(secondNumber + ": " + nums[i]);
            if (checkNumber.containsKey(secondNumber)) {
                int[] compatible = { i, checkNumber.get(secondNumber) };
                return compatible;
            } else {
                checkNumber.put(nums[i], i);
            }
        }
        return null;

        // Brute force
        // Time complexity O(n²)
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i; j < nums.length; j++) {
        // if((nums[i] + nums[j]) == target){
        // int[] result = {i, j};
        // return result;
        // }

        // }
        // return null;

        // With quicksort
        // Time complexity O(nlogn)
        // Arrays.sort(nums);
        // int left = 0;
        // int right = nums.length - 1;

        // while (left < right) {
        // int total = nums[left] + nums[right];

        // if (total == target) {
        // int[] compatible = { left, right };
        // return compatible;
        // } else if (total > target) {
        // right--;
        // } else if (total < target) {
        // left++;
        // }
        // }
        // return null;

    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.print(Arrays.toString(result));

    }

    // Google Interview sample of twosum
    // https://www.youtube.com/watch?v=XKu_SEDAykw

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link : https://urlzs.com/N8hdg
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;

}
