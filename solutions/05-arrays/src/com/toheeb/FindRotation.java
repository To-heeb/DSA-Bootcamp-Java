package com.toheeb;

import java.util.*;

public class FindRotation {

    public static boolean findRotation(int[][] mat, int[][] target) {

        // 90 degree * 4 = 360degree, but we can just rotate 3 time if we start by
        // checking the matrix
        // we can rotate 90 degree & check whether it matches the target

        for (int i = 0; i < 4; i++) {
            // check if both mat and target are equal
            if (isEqual(mat, target))
                return true;
            // transpose mat
            transpose(mat);
            // rotate mat
            rotate(mat);
        }

        return false;
    }

    public static boolean isEqual(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != target[i][j])
                    return false;
            }
        }
        return true;
    }

    public static void transpose(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat[0].length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    public static void rotate(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            int left = 0;
            int right = mat.length - 1;
            while (left < right) {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] nums = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
        int[][] target = { { 1, 1, 1 }, { 0, 1, 0 }, { 0, 0, 0 } };
        boolean result = findRotation(nums, target);
        System.out.print(result);

    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://urlzs.com/hTPgc
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;

}
