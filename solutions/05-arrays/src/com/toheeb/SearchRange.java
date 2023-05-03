package com.toheeb;

import java.util.*;

public class SearchRange {

    public static int[] searchRange(int[] nums, int target) {

        int length = nums.length - 1;
        int output[] = new int[2];

        output[0] = binarySearchLeft(nums, target, 0, length);
        output[1] = binarySearchRight(nums, target, 0, length);

        return output;
    }

    public static int binarySearchLeft(int[] nums, int target, int low, int high) {

        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        int mid_value = nums[mid];

        if (mid_value > target) {
            return binarySearchLeft(nums, target, low, (mid - 1));
        } else if (mid_value < target) {
            return binarySearchLeft(nums, target, (mid + 1), high);
        } else {
            if (mid == 0 || nums[mid - 1] != nums[mid]) {
                return mid;
            } else {
                return binarySearchLeft(nums, target, low, (mid - 1));
            }
        }
    }

    public static int binarySearchRight(int[] nums, int target, int low, int high) {

        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        int mid_value = nums[mid];

        if (mid_value > target) {
            return binarySearchRight(nums, target, low, (mid - 1));
        } else if (mid_value < target) {
            return binarySearchRight(nums, target, (mid + 1), high);
        } else {
            if (mid == (nums.length - 1) || nums[mid + 1] != nums[mid]) {
                System.out.println(mid);
                return mid;
            } else {
                return binarySearchRight(nums, target, (mid + 1), high);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 6;

        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://urlzs.com/FZJZw
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;

}