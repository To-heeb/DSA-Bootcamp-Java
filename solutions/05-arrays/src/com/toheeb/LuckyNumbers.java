package com.toheeb;

import java.util.*;

public class LuckyNumbers {

    public static List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> lucky_numbers = new ArrayList<Integer>();

        for (int i = 0; i < matrix.length; i++) {

            int min_in_row = Integer.MAX_VALUE;
            int max_in_col = Integer.MIN_VALUE;
            int min_index = 0;

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] < min_in_row) {
                    min_in_row = matrix[i][j];
                    max_in_col = min_in_row;
                    min_index = j;
                }

            }

            for (int k = 0; k < matrix.length; k++) {

                if (matrix[k][min_index] > max_in_col) {
                    max_in_col = matrix[k][min_index];
                }

            }

            if (max_in_col == min_in_row) {
                lucky_numbers.add(min_in_row);
            }
        }

        return lucky_numbers;

    }

    public static void main(String[] args) {

        int[][] matrix = { { 1, 10, 4, 2 }, { 9, 3, 8, 7 }, { 15, 16, 17, 12 } };

        List<Integer> result = luckyNumbers(matrix);

        System.out.print(result);

    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://urlzs.com/3cz6i
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;
}
