package com.toheeb;

public class EvenDaysOfAugust {
    public static void main(String[] args) {
        int daysInAugust = 31;
        int evenDaysCount = 0;
        while(daysInAugust != 0){

            if(daysInAugust % 2 == 0){
                evenDaysCount++;
            }

            daysInAugust--;
        }

        System.out.println("Kunal can go out "+evenDaysCount+" times in the month of August");

    }
}
