package ru.netology.stats;
public class StatsService {
    public int getSumSell(int[] report) {
        int sum = 0;
        for (int i = 0; i < report.length; i++) {
            sum += report[i];
        }
        return sum;
    }

    public int getSumAvr(int[] report) {
        int sum = getSumSell(report);
        int avr = sum / report.length;
        return avr;
    }

    public int maxSales(int[] report) {
        int maxMonth = 0;

        for (int i = 0; i < report.length; i++) {
            if (report[i] >= report[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] report) {
        int maxMonth = 0;

        for (int i = 0; i < report.length; i++) {
            if (report[i] <= report[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int qntLowSales(int[] report) {
        int count = 0;

        for (int i = 0; i < report.length; i++) {
            if (report[i] < getSumAvr(report)) {
                count++;
            }
        }
        return count;
    }
    public int qntHighSales(int[] report) {
        int count = 0;

        for (int i = 0; i < report.length; i++) {
            if (report[i] > getSumAvr(report)) {
                count++;
            }
        }
        return count;
    }

}
