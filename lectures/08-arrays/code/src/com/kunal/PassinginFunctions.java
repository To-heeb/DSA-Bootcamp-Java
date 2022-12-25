package com.kunal;

import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 12 };
        String[] strings = { "me", "you", "he", "here" };
        System.out.println(Arrays.toString(nums));
        change(nums);
        changeIndex(strings);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(strings));
    }

    private static void changeIndex(String[] strings) {
        strings[0] = "I";
    }

    static void change(int[] arr) {
        arr[0] = 99;
    }
}
