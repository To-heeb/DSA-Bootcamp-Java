package com.toheeb;

public class LargestAltitude {

    public static int largestAltitude(int[] gain) {

        int max = 0;
        int current = 0;
        for (int i = 0; i < gain.length; i++) {
            current += gain[i];
            max = Math.max(max, current);
        }

        return max;
    }

    public static void main(String[] args) {

        int[] gain = { -5, 1, 5, 0, -7 };
        int result = largestAltitude(gain);
        System.out.print(result);
        // System.out.print(Arrays.toString(result));
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://cutt.ly/R2fh7Rf
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;
}
