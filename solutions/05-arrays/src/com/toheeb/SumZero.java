package com.toheeb;

import java.util.*;

public class SumZero {
    public static int[] sumZero(int n) {

        int[] array = new int[n];
        int left = 0;
        int right = n - 1;
        int number = n / 2;
        while (left < right) {

            array[left] = -1 * number;
            array[right] = number;

            number--;
            right--;
            left++;
        }

        return array;
    }

    public static void main(String[] args) {

        int n = 5;
        int[] result = sumZero(n);
        System.out.println(Arrays.toString(result));
    }
}
