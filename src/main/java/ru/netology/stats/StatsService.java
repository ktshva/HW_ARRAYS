package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public static int totalSales(long[] sales) {
        int total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return total;
    }

    public int avgSales(long[] sales) {
        int totalSales = totalSales(sales);
        return totalSales / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальным продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int belowAvgCount(long[] sales) {
        int averageSales = avgSales(sales);
        int belowAvgCount = 0;
        for (long sale : sales) {
            if (sale < averageSales) {
                belowAvgCount++;
            }
        }
        return belowAvgCount;
    }

    public int aboveAvgCount(long[] sales) {
        int averageSales = avgSales(sales);
        int aboveAvgCount = 0;
        for (long sale : sales) {
            if (sale > averageSales) {
                aboveAvgCount++;
            }
        }
        return aboveAvgCount;
    }
}