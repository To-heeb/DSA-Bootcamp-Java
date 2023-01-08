package com.toheeb;

public class MaximumPopulation {

    public static int maximumPopulation(int[][] logs) {

        // Brute force method

        // int min_year_with_max_population = 2050;
        // int max_population = 0;
        // int min_year = 2050;
        // int max_year = 1950;

        // for(int i = 0; i < logs.length; i++){
        // if(logs[i][1] > max_year){
        // max_year = logs[i][1];
        // }
        // if(logs[i][0] < min_year){
        // min_year = logs[i][0];
        // }
        // }

        // Map<Integer, Integer> all_years = new HashMap<>();

        // while(min_year <= max_year){
        // all_years.put(min_year, 0);
        // min_year++;
        // }

        // for(int i = 0; i < logs.length; i++){
        // for(int j = logs[i][0]; j < logs[i][1]; j++){
        // if(all_years.containsKey(j)){
        // int k = all_years.get(j) + 1;
        // all_years.replace(j, k);
        // }
        // }
        // }

        // //sort hashmap
        // TreeMap<Integer, Integer> sorted_all_years = new TreeMap<>(all_years);

        // for(Map.Entry year: sorted_all_years.entrySet()){
        // int check_year = (int) year.getKey();
        // int check_value = (int) year.getValue();

        // if(check_value > max_population){

        // // if(check_year < min_year_with_max_population){

        // // }else{

        // // }
        // System.out.println(check_value);
        // System.out.println(check_year);
        // min_year_with_max_population = check_year;
        // max_population = check_value;

        // }
        // }
        // System.out.println(all_years);
        // return min_year_with_max_population;

        // Line sweep algorithm
        int[] year = new int[101];

        // line marker(interval marker)
        for (int[] log : logs) {
            year[log[0] - 1950] += 1;
            year[log[1] - 1950] -= 1;
        }

        // initiate max num and year with that number
        int maxYear = 1950;
        int maxNum = year[0];

        for (int i = 1; i < year.length; i++) {
            year[i] += year[i - 1];

            if (year[i] > maxNum) {
                maxYear = i + 1950;
                maxNum = year[i];
            }
        }

        return maxYear;
    }

    public static void main(String[] args) {
        int[][] logs = { { 1993, 1999 }, { 2000, 2010 } };
        int result = maximumPopulation(logs);
        System.out.print(result);

    }

    // Visualization link :
    // This link directs you to a page where you can visualize how
    // this code runs
    // Link: https://cutt.ly/Z2ECwV1
    // click on "Visualize Execution" when you get to the page to run the code and
    // visualize;

}
