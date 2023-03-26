package com.toheeb;

import java.util.*;

public class SpiralMatrixIII {

    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

        // direction mapping
        // 0 = right (east)
        // 1 = bottom (south)
        // 2 = left (west)
        // 3 = top (north)

        // direction_coordinate
        // {col, row}

        int[][] direction_coordinate = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        int positions = rows * cols;
        int[][] coordinates = new int[positions][2];
        int kounter = 0;
        coordinates[kounter++] = new int[] { rStart, cStart };
        int row = rStart;
        int col = cStart;
        int direction = 0;
        int distance = 0;

        while (kounter < positions) {

            if (direction == 0 || direction == 2) {
                distance++;
            }

            for (int i = 1; i <= distance; i++) {
                row += direction_coordinate[direction][0];
                col += direction_coordinate[direction][1];

                if (col > 0 && col <= cols && row > 0 && row <= rows) {
                    coordinates[kounter++] = new int[] { row, col };
                }
            }

            direction = ++direction % 4;
        }

        return coordinates;

    }

    public static void main(String[] args) {
        int rows = 5, cols = 6, rStart = 1, cStart = 4;
        int[][] result = spiralMatrixIII(rows, cols, rStart, cStart);

        System.out.println(Arrays.deepToString(result));
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://urlzs.com/FFJRH
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;

}