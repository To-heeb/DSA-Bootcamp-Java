package com.toheeb;

public class DiagonalSum {

    public static int diagonalSum(int[][] mat) {

        int sum = 0;

        int x = 1;
        int k = 0;
        int start = 0;
        for (int i = 0; i < mat.length; i++, x++, start++) {

            int end = mat[i].length - x;
            if (start == end)
                sum += mat[i][start];
            else
                sum += (mat[i][start] + mat[i][end]);

            // System.out.println(sum);
        }

        return sum;
    }

    public static void main(String[] args) {

        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int result = diagonalSum(mat);
        System.out.print(result);
        // System.out.print(Arrays.toString(result));
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://urlzs.com/3mHJR
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;

}
