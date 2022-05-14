package ru.netology.stats;

import java.util.ArrayList;
import java.util.Arrays;

public class StatsService {

    public long calcSum(long[] sales) {
        long sum = 0;

        for (long sale : sales) {
            sum += sale;
        }

        return sum;
    }

    public long calcAverage(long[] sales) {
        long average;
        long sum;

        sum = calcSum(sales);
        average = sum / sales.length;
        return average;
    }

    public long findMinSale(long[] sales){
        long minSale = sales[0];
        for (long sale : sales) {
            if (sale <= minSale){
                minSale = sale;
            }
        }
        return minSale;
    }

    public long findMaxSale(long[] sales){
        long maxSale = sales[0];
        for (long sale : sales) {
            if (sale >= maxSale){
                maxSale = sale;
            }
        }
        return maxSale;
    }
    public int[] minSales(long[] sales) {
        ArrayList<Integer> minMonthNum = new ArrayList<>();
        int minMonth = 0;
        int month = 0;
        long minSale = findMinSale(sales);

        for (long sale : sales) {

            if (sale <= minSale) {
                minMonth = month + 1;
                minMonthNum.add(minMonth);
            }

            month++;
        }
        int[] minMonthNums = new  int[minMonthNum.size()];

        for (int i = 0; i < minMonthNum.size(); i++){
            minMonthNums[i] = minMonthNum.get(i);
        }
        return minMonthNums;
    }

    public int[] maxSales(long[] sales) {
        ArrayList<Integer> maxMonthNum = new ArrayList<>();
        int maxMonth = 0;
        int month = 0;
        long maxSale = findMaxSale(sales);

        for (long sale : sales) {

            if (sale >= maxSale) {
                maxMonth = month + 1;
                maxMonthNum.add(maxMonth);
            }

            month++;
        }
        int[] maxMonthNums = new  int[maxMonthNum.size()];

        for (int i = 0; i < maxMonthNum.size(); i++){
            maxMonthNums[i] = maxMonthNum.get(i);
        }
        return maxMonthNums;
    }

    public int aboveAverage(long[] sales) {
        long average = calcAverage(sales);
        int countAboveAverage = 0;
        int month = 0;

        for (long sale : sales){

            if (sale >= average){
                countAboveAverage++;
            }
            month++;
        }
        return countAboveAverage;
    }

    public int belowAverage(long[] sales) {
        long average = calcAverage(sales);
        int countBelowAverage = 0;
        int month = 0;

        for (long sale : sales){

            if (sale < average){
                countBelowAverage++;
            }
            month++;
        }
        return countBelowAverage;
    }
}
