package com.toheeb;

import java.util.*;

public class KidsWithGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> kidsWithCandiesBooolean = new ArrayList<>(candies.length);
        int max_candies = 0;
        for (int i = 0; i < candies.length; i++) {
            max_candies = Math.max(max_candies, candies[i]);
        }

        for (int i = 0; i < candies.length; i++) {

            kidsWithCandiesBooolean.add(max_candies <= candies[i] + extraCandies);

        }

        return kidsWithCandiesBooolean;
        // System.out.print(Arrays.toString(ans));
    }

    public static void main(String[] args) {

        int[] input = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        List<Boolean> result = kidsWithCandies(input, extraCandies);
        System.out.print(result);
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://cutt.ly/V0M0aiQ
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;
}
