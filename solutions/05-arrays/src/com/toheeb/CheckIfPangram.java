package com.toheeb;

import java.util.Arrays;

public class CheckIfPangram {

    public static boolean checkIfPangram(String sentence) {
        // We iterate over 'sentence' for 26 times, one for each letter 'currChar'.
        for (int i = 0; i < 26; ++i) {
            char currChar = (char) ('a' + i);
            System.out.println(currChar);
            // If 'sentence' doesn't contain currChar, it is not a pangram.
            if (sentence.indexOf(currChar) == -1)
                return false;
        }

        // If we manage to find all 26 letters, it is a pangram.
        return true;
    }

    public static void main(String[] args) {

        String sentence = "lamop";
        boolean result = checkIfPangram(sentence);
        System.out.print(result);
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://cutt.ly/V2sPYEd
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;

}
