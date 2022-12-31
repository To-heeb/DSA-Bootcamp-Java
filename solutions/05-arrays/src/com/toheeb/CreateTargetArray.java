package com.toheeb;

import java.util.*;

public class CreateTargetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {

        int[] target = new int[nums.length];
        // all arrays are equal length

        for(int i = 0; i < nums.length; i++){

            if(index[i] < i){
                // shift the values in array to the right
                int j = target.length - 1;
                while(j > index[i]){
                    target[j] =  target[j - 1];
                    j--;
                }
                target[index[i]] = nums[i];
            }else{
                target[index[i]] = nums[i];
            }

        }

        return target;
        //System.out.print(Arrays.toString(ans));
    }

    public static void main(String[] args){
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        //int n = input.length / 2;
        int result[] = createTargetArray(nums, index);
        System.out.print(Arrays.toString(result));
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://cutt.ly/i00rQIL (optimized code here)
    // Link to optimized code: https://onecompiler.com/java/3ytapcrxs
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;
}
