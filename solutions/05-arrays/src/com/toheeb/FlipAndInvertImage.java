package com.toheeb;

import java.util.*;

public class FlipAndInvertImage {

    public static int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {

            int k = image[i].length - 1;
            for (int j = 0; j < k; j++, k--) {
                int temp = image[i][j];
                image[i][j] = image[i][k];
                image[i][k] = temp;
            }

            for (int j = 0; j < image[i].length; j++) {
                image[i][j] = reverse(image[i][j]);
            }
        }

        return image;
    }

    public static int reverse(int bit) {
        int num = (bit == 1) ? 0 : 1;
        return num;
    }

    public static void main(String[] args) {

        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        int[][] result = flipAndInvertImage(image);
        System.out.print(Arrays.deepToString(result));
        // System.out.print(Arrays.toString(result));
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://urlzs.com/LvxZw
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;
}
