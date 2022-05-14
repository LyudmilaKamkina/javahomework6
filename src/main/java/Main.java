import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 17, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int[] minMonthes = new int[service.minSales(sales).length];
        int[] maxMonthes = new int[service.maxSales(sales).length];
        int countAboveAverage, countBelowAverage;
        long sum, average, minSale;

        minMonthes = service.minSales(sales);
        maxMonthes = service.maxSales(sales);
        sum = service.calcSum(sales);
        average = service.calcAverage(sales);
        countAboveAverage = service.aboveAverage(sales);
        countBelowAverage = service.belowAverage(sales);

        System.out.println("Месяц(ы) с минимальной суммой продаж:");
        for (int i = 0; i < minMonthes.length; i++) {
            System.out.println(minMonthes[i]);
            }

        System.out.println("Месяцы с максимальной суммой продаж:");
        for (int i = 0; i < maxMonthes.length; i++) {
            System.out.println(maxMonthes[i]);
        }

        System.out.println("Сумма продаж: " + sum);
        System.out.println("Средняя сумма продаж: " + average);
        System.out.println(countAboveAverage);
        System.out.println(countBelowAverage);
    }
}
