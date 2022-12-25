package com.toheeb;

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {

        int maximum_wealth = 0;

        for(int i = 0; i < accounts.length; i++){
            int customer_wealth = 0;

            for(int j = 0; j < accounts[i].length; j++){
                customer_wealth += accounts[i][j];
            }


            maximum_wealth = Math.max(maximum_wealth, customer_wealth);
        }

        return maximum_wealth;
        //System.out.print(Arrays.toString(ans));
    }

    public static void main(String[] args){


        int[][] input = {{1, 3, 4}, {5, 3, 4}, {1, 7, 9}, {2, 9, 1}};
        int result = maximumWealth(input);
        System.out.print(result);
    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://cutt.ly/10MdLtE
    // click on "Visualize Execution" when you get to the page to run the code and visualize;
}
