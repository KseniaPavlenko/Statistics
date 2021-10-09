package ru.netology.stats;

public class StatsService {

    public long calculateTotalOfAllSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long findAvg(long[] sales) {
        return calculateTotalOfAllSales(sales) / sales.length;

    }

    public int findMonthMaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int findMonthMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int findNumberOfMonthsBelowAverage(long[] sales) {
        long average = findAvg(sales);
        int number = 0;
        for (long sale : sales) {
            if (sale < average) {
                number = number + 1;
            }
        }
        return number;
    }

    public int findNumberOfMonthsAboveAverage(long[] sales) {
        long average = findAvg(sales);
        int number = 0;
        for (long sale : sales) {
            if (sale > average) {
                number = number + 1;
            }
        }
        return number;
    }

}
