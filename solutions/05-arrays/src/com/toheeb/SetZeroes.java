package com.toheeb;

import java.util.*;

public class SetZeroes {

    public static int[][] setZeroes(int[][] matrix) {

        boolean isRow0 = false;
        boolean isCol0 = false;
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            if (matrix[i][0] == 0)
                isRow0 = true;
        }

        for (int j = 0; j < col; j++) {
            if (matrix[0][j] == 0)
                isCol0 = true;
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (isRow0) {
            for (int i = 0; i < row; i++) {
                matrix[i][0] = 0;
            }
        }

        if (isCol0) {
            for (int j = 0; j < col; j++) {
                matrix[0][j] = 0;
            }
        }

        return matrix;

    }

    public static void main(String[] args) {
        int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

        int[][] result = setZeroes(matrix);

        System.out.println(Arrays.deepToString(result));
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://urlzs.com/rV5qZ
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;
}
