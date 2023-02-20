package com.toheeb;

public class NumberOfGoodPairs {

    public static int shuffle(int[] nums) {

        // This is not optimized will come back to optimize it.
        int good_pairs = 0;
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }

                if (nums[i] == nums[j]) {
                    if (i <= j) {
                        good_pairs++;
                    }
                }

            }

        }

        return good_pairs;
        // System.out.print(Arrays.toString(ans));

        // optimized solution
        // Space complexity; O(n)
        // Time complexity: O(n)

        // int[] frequency = new int[nums.length];
        // int opt_good_pairs = 0;
        // for(int i = 0; i < nums.length; i++) {
        // opt_good_pairs += frequency[nums[i]]++;
        // }
        // return opt_good_pairs;

        // int[] frequency = new int[nums.length];
        // int opt_good_pairs = 0;
        // for(int i = 0; i < nums.length; i++) {
        // opt_good_pairs += (nums[i] * (nums[i] - 1)) / 2;
        // }
        // return opt_good_pairs;
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 1, 1, 3 };
        // int n = input.length / 2;
        int result = shuffle(input);
        System.out.print(result);
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://cutt.ly/i00rQIL (optimized code here)
    // Link to optimized code: https://onecompiler.com/java/3ysx7uj4c
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;

}
