package com.toheeb;

import java.util.*;

public class AddToArrayForm {

    public static List<Integer> addToArrayForm(int[] num, int k) {

        int i = num.length - 1;
        int array_form = k;
        List<Integer> result = new ArrayList<Integer>();
        while (i >= 0 || array_form > 0) {

            if (i >= 0)
                array_form += num[i];
            result.add(array_form % 10);

            array_form /= 10;

            System.out.println(array_form);
            i--;
        }

        Collections.reverse(result);

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 1, 5 };
        int k = 806;
        List<Integer> result = addToArrayForm(nums, k);
        System.out.print(result);

    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://cutt.ly/E2mYQsx
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;

}
