package com.toheeb;

import java.util.Arrays;

public class SmallerNumbersThanCurrent {
    public static int[] smallerNumbersThanCurrent(int[] nums) {

        // This is not optimized will come back to optimize it.
        // int[] count_array = new int[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        // int count = 0;
        // for (int j = 0; j < nums.length; j++) {
        // if (i == j) {
        // continue;
        // }

        // if (nums[i] > nums[j]) {
        // count++;
        // }
        // }

        // count_array[i] = count;
        // }

        // return count_array;
        // System.out.print(Arrays.toString(ans));

        // optimized solution
        // Space complexity; O(n)
        // Time complexity: O(n)
        int[] frequency = new int[101];
        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            frequency[nums[i]]++;
        }

        for (int i = 1; i < frequency.length; i++) {
            frequency[i] += frequency[i - 1];
        }

        for (int i = 0; i < output.length; i++) {
            if (nums[i] == 0)
                output[i] = 0;
            else
                output[i] = frequency[nums[i] - 1];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] input = { 8, 1, 2, 2, 3 };
        int[] result = smallerNumbersThanCurrent(input);
        System.out.print(Arrays.toString(result));
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://cutt.ly/V013KCC (optimized code here)
    // Link to optimized code: https://onecompiler.com/java/3ysxx2h2e
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;

    // Algorithm
    // This is solved using the counting sort algorithm
}

// from collections import Counter

// class Solution:
// def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
// counter = Counter(nums)
// frequencies = [sum(counter[i] for i in range(num)) for num in nums]
// return frequencies
