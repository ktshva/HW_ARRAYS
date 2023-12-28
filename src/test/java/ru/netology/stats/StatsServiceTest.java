package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindTotal() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedTotalSales = 180;
        int totalSales = service.totalSales(sales);
        System.out.println("Общая сумма продаж в месяц: " + totalSales);

        Assertions.assertEquals(expectedTotalSales, totalSales);
    }

    @Test
    public void shouldFindAvg() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAvgSales = 15;
        int avgSales = service.avgSales(sales);
        System.out.println("Средняя сумма продаж в месяц: " + avgSales);

        Assertions.assertEquals(expectedAvgSales, avgSales);
    }

    @Test
    public void shouldFindMax() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int maxSales = service.maxSales(sales);

        System.out.println("Месяц с наибольшими продажами: " + maxSales);

        Assertions.assertEquals(expectedMonth, maxSales);
    }

    @Test
    public void shouldFindMin() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int minSales = service.minSales(sales);

        System.out.println("Месяц с наименьшими продажами: " + minSales);

        Assertions.assertEquals(expectedMonth, minSales);
    }

    @Test
    public void shouldFindBelowAvgCount() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthCount = 5;
        int belowAvgCount = service.belowAvgCount(sales);

        System.out.println("Количество месяцев с продажами ниже среднего: " + belowAvgCount);

        Assertions.assertEquals(expectedMonthCount, belowAvgCount);
    }

    @Test
    public void shouldFindAboveAvgCount() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthCount = 5;
        int aboveAvgCount = service.aboveAvgCount(sales);

        System.out.println("Количество месяцев с продажами выше среднего: " + aboveAvgCount);

        Assertions.assertEquals(expectedMonthCount, aboveAvgCount);
    }
}
