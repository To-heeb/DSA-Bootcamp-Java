package com.toheeb;

public class MinCostToMoveChips {

    public static int minCostToMoveChips(int[] position) {

        int even_count = 0, odd_count = 0;
        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }
        }

        return Math.min(even_count, odd_count);
    }

    public static void main(String[] args) {
        int[] position = { 2, 2, 2, 3, 3 };
        int result = minCostToMoveChips(position);

        System.out.print(result);
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://urlzs.com/NLYvm
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;
}
