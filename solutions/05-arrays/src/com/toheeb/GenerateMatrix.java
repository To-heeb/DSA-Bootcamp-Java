package com.toheeb;

import java.util.*;

public class GenerateMatrix {

    public static int[][] generateMatrix(int n) {

        int[][] generated_matrix = new int[n][n];
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int count = 1;
        while (left <= right && top <= bottom) {

            for (int i = left; i <= right; i++) {
                generated_matrix[top][i] = count++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                generated_matrix[i][right] = count++;
            }
            right--;

            if (left <= right) {
                for (int i = right; i >= left; i--) {
                    generated_matrix[bottom][i] = count++;
                }
                bottom--;
            }

            if (top <= bottom) {
                for (int i = bottom; i >= top; i--) {
                    generated_matrix[i][left] = count++;
                }
                left++;
            }
        }

        return generated_matrix;

    }

    public static void main(String[] args) {
        int n = 2;
        int[][] result = generateMatrix(n);

        System.out.println(Arrays.deepToString(result));
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://urlzs.com/x95hk
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;

}