package com.toheeb;

import java.util.*;

public class MatrixReshape {
    public static void main(String[] args) {
        int[][] nums = { { 1, 2 }, { 3, 4 } };
        int r = 1;
        int c = 4;
        int[][] result = matrixReshape(nums, r, c);

        // System.out.print(result);
        System.out.println(Arrays.deepToString(result));
    }

    public static int[][] matrixReshape(int[][] num, int r, int c) {

        int m = num.length;
        int n = num[0].length;

        if ((r * c) != (m * n))
            return num;

        int[][] reshapedMatrix = new int[r][c];
        int row = 0;
        int col = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (col == c) {
                    row++;
                    col = 0;
                }

                reshapedMatrix[row][col++] = num[i][j];
            }
        }

        return reshapedMatrix;
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs

    // O(n) solution
    // Link: https://urlzs.com/F6Lyd

    // O(n²) solution
    // Link: https://urlzs.com/eKLPy

    // O(n²) solution (another method)
    // Link: https://urlzs.com/6jyeg
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;
}
