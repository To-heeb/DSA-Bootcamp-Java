package com.toheeb;

import java.util.*;

public class Transpose {

    public static int[][] transpose(int[][] A) {

        // transpose the matrix,
        // transpose means first column becomes first row in matrix and the first row
        // will become the last column in the matrix
        // transpose means interchange rows for column in matrix and colums for rows

        int R = A.length, C = A[0].length;
        int[][] ans = new int[C][R];
        for (int r = 0; r < R; r++)
            for (int c = 0; c < C; c++) {
                ans[c][r] = A[r][c];
            }
        return ans;
    }

    public static void main(String[] args) {
        int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 } };

        int[][] result = transpose(nums);
        System.out.print(Arrays.deepToString(result));

    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://cutt.ly/92bY6Mg
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;

    // The transpose of a matrix is found by interchanging its rows into columns or
    // columns into rows.

}
