package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

public class StatsServiceTest {

    @Test
    public void calcSumTest() {
        StatsService service = new StatsService();
        long sales[] = {10, 20, 30, 40, 50, 60, 10, 20, 30, 40, 50, 60};
        long actual = service.calcSum(sales);
        long expected = 10 + 20 + 30 + 40 + 50 + 60 + 10 + 20 + 30 + 40 + 50 + 60;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcAverageTest() {
        StatsService service = new StatsService();
        long sales[] = {10, 20, 30, 40, 50, 60, 10, 20, 30, 40, 50, 60};
        long actual = service.calcAverage(sales);
        long expected = (10 + 20 + 30 + 40 + 50 + 60 + 10 + 20 + 30 + 40 + 50 + 60) / 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesTest() {
        StatsService service = new StatsService();
        long sales[] = {10, 20, 30, 40, 50, 60, 10, 20, 30, 40, 50, 60};
        int actual[] = service.minSales(sales);
        int expected[] = {1, 7};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void maxSalesTest() {
        StatsService service = new StatsService();
        long sales[] = {10, 20, 30, 40, 50, 60, 10, 20, 30, 40, 50, 60};
        int actual[] = service.maxSales(sales);
        int expected[] = {6, 12};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void aboveAverageTest() {
        StatsService service = new StatsService();
        long sales[] = {10, 20, 30, 40, 50, 60, 10, 20, 30, 40, 50, 60};
        long actual = service.aboveAverage(sales);
        long expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowAverageTest() {
        StatsService service = new StatsService();
        long sales[] = {10, 20, 30, 40, 50, 60, 10, 20, 30, 40, 50, 60};
        long actual = service.belowAverage(sales);
        long expected = 6;

        Assertions.assertEquals(expected, actual);
    }
}
