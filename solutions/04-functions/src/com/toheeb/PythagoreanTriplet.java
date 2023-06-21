package com.toheeb;

import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.stream.Stream;

public class PythagoreanTriplet {

    // Driver program to test above function
    public static void main(String[] args) {
        // quickSort(Arrays.asList(10, 5, 2, 3));
        int ar[] = { 3, 1, 4, 6, 5 };
        int ar_size = ar.length;
        if (isTriplet(ar, ar_size) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean isTriplet(int arr[], int n) {

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * arr[i];
        }

        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        for (int i = n - 1; i >= 2; i--) {

            int left = 0;
            int right = i - 1;
            // System.out.println(i);
            while (left < right) {
                // System.out.println((arr[left] + arr[right]));
                if (arr[i] == arr[left] + arr[right]) {
                    return true;
                }

                if (arr[i] < arr[left] + arr[right]) {
                    right--;
                } else if (arr[i] > arr[left] + arr[right]) {
                    left++;
                }
            }

        }

        // If we reach here, no triplet found
        return false;
    }

    public static List<Integer> quickSort(List<Integer> list) {

        if (list.size() < 2)
            return list;

        Integer pivot = list.get(0);

        List<Integer> left = list.stream().skip(1)
                .filter(index -> index <= pivot)
                .collect(Collectors.toList());

        List<Integer> right = list.stream().skip(1)
                .filter(index -> index > pivot)
                .collect(Collectors.toList());

        return Stream.of(
                quickSort(left).stream(),
                Stream.of(pivot),
                quickSort(right).stream())
                .flatMap(Function.identity())
                .collect(Collectors.toList());

    }
}
