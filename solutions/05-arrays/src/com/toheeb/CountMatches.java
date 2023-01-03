package com.toheeb;

import java.util.ArrayList;
import java.util.List;

public class CountMatches {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count = 0;
        for (int i = 0; i < items.size(); i++) {

            if (ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue))
                count++;
            if (ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue))
                count++;
            if (ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue))
                count++;

        }

        return count;
    }

    public static void main(String[] args) {

        String[][] items_array = {
                { "phone", "blue", "pixel" },
                { "computer", "silver", "lenovo" },
                { "phone", "gold", "iphone" }
        };

        List<List<String>> items = new ArrayList<>(items_array.length);

        for (int i = 0; i < items_array.length; i++) {
            items.add(new ArrayList<>());
            for (int j = 0; j < 3; j++) {
                items.get(i).add(items_array[i][j]);
            }

        }

        String ruleKey = "color";
        String ruleValue = "silver";
        int result = countMatches(items, ruleKey, ruleValue);
        System.out.print(result);

    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://urlzs.com/SVbY3
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;
}