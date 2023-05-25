package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void getSumSell() {
        StatsService service = new StatsService();

        int [] report = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.getSumSell(report);

        Assertions.assertEquals(expectedSum, actualSum);
    }
    @Test
    public void getSumAvr() {
        StatsService service = new StatsService();

        int [] report = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 15;
        int actualSum = service.getSumAvr(report);

        Assertions.assertEquals(expectedSum, actualSum);
    }
    @Test
    public void maxSales() {
        StatsService service = new StatsService();

        int [] report = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 8;
        int actualSum = service.maxSales(report);

        Assertions.assertEquals(expectedSum, actualSum);
    }
    @Test
    public void minSales() {
        StatsService service = new StatsService();

        int [] report = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 9;
        int actualSum = service.minSales(report);

        Assertions.assertEquals(expectedSum, actualSum);
    }
    @Test
    public void qntLowSales() {
        StatsService service = new StatsService();

        int [] report = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 5;
        int actualSum = service.qntLowSales(report);

        Assertions.assertEquals(expectedSum, actualSum);
    }
    @Test
    public void qntHighSales() {
        StatsService service = new StatsService();

        int [] report = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 5;
        int actualSum = service.qntHighSales(report);

        Assertions.assertEquals(expectedSum, actualSum);
    }
}
