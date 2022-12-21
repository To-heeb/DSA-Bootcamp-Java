package com.kunal;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // fun();
        // multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc");
        // demo();
        demo(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
    }

    static void demo(int... v) {
        System.out.println(v[0]);
        System.out.println(Arrays.toString(v));
    }

    static void demo(String... v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String... v) {

    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
