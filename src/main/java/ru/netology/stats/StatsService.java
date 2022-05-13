package ru.netology.stats;

public class StatsService {

    public long calcSum(long[] sales) {
        long sum = 0;

        for (long sale : sales) {
            sum += sale;
        }

        return sum;
    }

    public long calcAverage(long[] sales) {
        StatsService service = new StatsService();
        long average;
        long sum;

        sum = service.calcSum(sales);
        average = sum / sales.length;
        return average;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;

        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }

            month++;
        }

        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;

        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }

        return maxMonth + 1;
    }

    public int aboveAverage(long[] sales) {
        StatsService service = new StatsService();
        long average = service.calcAverage(sales);
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
        StatsService service = new StatsService();
        long average = service.calcAverage(sales);
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
