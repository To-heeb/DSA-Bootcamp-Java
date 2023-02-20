package com.toheeb;

import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

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
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.print(Arrays.toString(result));

    }

}
