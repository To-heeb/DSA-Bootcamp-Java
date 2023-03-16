package com.toheeb;

import java.util.*;

public class SpiralOrder {

    public static List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> spiral_order = new ArrayList<Integer>();

        int row = matrix.length;
        int col = matrix[0].length;
        int top = 0;
        int bottom = row - 1;
        int left = 0;
        int right = col - 1;

        while (top <= bottom && left <= right) {

            // move across row from left to right →
            for (int i = left; i <= right; i++) {
                spiral_order.add(matrix[top][i]);
            }

            top++;

            // move across col from top to bottom
            for (int i = top; i <= bottom; i++) {
                spiral_order.add(matrix[i][right]);
            }

            right--;

            if (top <= bottom) {

                // move across row from right to left ←
                for (int i = right; i >= left; i--) {
                    spiral_order.add(matrix[bottom][i]);
                }

                bottom--;

            }

            if (left <= right) {

                // move across col from bottom to top
                for (int i = bottom; i >= top; i--) {
                    spiral_order.add(matrix[i][left]);
                }

                left++;
            }

        }

        return spiral_order;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        List<Integer> result = spiralOrder(matrix);

        System.out.println(result);
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://urlzs.com/MGNdh
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;

}