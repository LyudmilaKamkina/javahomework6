package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

public class StatsServiceTest {

    @Test
    public void calcSumTest() {
        StatsService service = new StatsService();
        long sales[] = {10, 20, 30, 40, 50, 60, 70, 20, 30, 40, 50, 60};
        long actual = service.calcSum(sales);
        long expected = 10 + 20 + 30 + 40 + 50 + 60 + 70 + 20 + 30 + 40 + 50 + 60;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcAverageTest() {
        StatsService service = new StatsService();
        long sales[] = {10, 20, 30, 40, 50, 60, 70, 20, 30, 40, 50, 60};
        long actual = service.calcAverage(sales);
        long expected = (10 + 20 + 30 + 40 + 50 + 60 + 70 + 20 + 30 + 40 + 50 + 60) / 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesTest() {
        StatsService service = new StatsService();
        long sales[] = {10, 20, 30, 40, 50, 60, 70, 20, 30, 40, 50, 60};
        long actual = service.minSales(sales);
        long expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesTest() {
        StatsService service = new StatsService();
        long sales[] = {10, 20, 30, 40, 50, 60, 70, 20, 30, 40, 50, 60};
        long actual = service.maxSales(sales);
        long expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveAverageTest() {
        StatsService service = new StatsService();
        long sales[] = {10, 20, 30, 40, 50, 60, 70, 20, 30, 40, 50, 60};
        long actual = service.aboveAverage(sales);
        long expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowAverageTest() {
        StatsService service = new StatsService();
        long sales[] = {10, 20, 30, 40, 50, 60, 70, 20, 30, 40, 50, 60};
        long actual = service.belowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}
