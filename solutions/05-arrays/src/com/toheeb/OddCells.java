package com.toheeb;

public class OddCells {
    public static int oddCells(int m, int n, int[][] indices) {

        int[][] matrix = new int[m][n];
        int result = 0;
        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];
            int[] currentRow = matrix[row];

            // Increase row
            for (int j = 0; j < matrix[row].length; j++) {
                matrix[row][j] += 1;
            }

            // Increase col
            for (int k = 0; k < matrix.length; k++) {
                matrix[k][col] += 1;
            }

            // System.out.println(Arrays.deepToString(matrix));
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (isOdd(matrix[i][j])) {
                    result += 1;
                }
            }
        }

        return result;
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public static void main(String[] args) {

        int[][] indices = { { 0, 1 }, { 1, 1 } };
        int m = 2;
        int n = 3;
        int result = oddCells(m, n, indices);
        System.out.print(result);
        // System.out.print(Arrays.toString(result));
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://urlzs.com/TnWQ5
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;
}
