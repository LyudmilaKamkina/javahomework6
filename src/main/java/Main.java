import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int minMonth, maxMonth, countAboveAverage, countBelowAverage;
        long sum, average;

        minMonth = service.minSales(sales);
        maxMonth = service.maxSales(sales);
        sum = service.calcSum(sales);
        average = service.calcAverage(sales);
        countAboveAverage = service.aboveAverage(sales);
        countBelowAverage = service.belowAverage(sales);

        System.out.println(minMonth);
        System.out.println(maxMonth);
        System.out.println(sum);
        System.out.println(average);
        System.out.println(countAboveAverage);
        System.out.println(countBelowAverage);
    }
}
