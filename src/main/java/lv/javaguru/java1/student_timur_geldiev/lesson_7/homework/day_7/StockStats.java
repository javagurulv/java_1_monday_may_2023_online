package lv.javaguru.java1.student_timur_geldiev.lesson_7.homework.day_7;

import java.util.ArrayList;
import java.util.List;

public class StockStats {

    public static void main(String[] args) {

        Stock stock1 = new Stock("Apple", 191.94, 20);
        Stock stock2 = new Stock("Meta", 294.26, 5);
        Stock stock3 = new Stock("Tesla", 260.02, 53);
        Stock stock4 = new Stock("Amazon", 130, 9);
        Stock stock5 = new Stock("Nvidia", 443.09, 40);

        List<Stock> stocks = new ArrayList<>();

        stocks.add(stock1);
        stocks.add(stock2);
        stocks.add(stock3);
        stocks.add(stock4);
        stocks.add(stock5);

        StockStats test = new StockStats();
        test.findTotalCostTest(stocks);
        test.findAverageCostTest(stocks);


    }

    public double findTotalCost(List<Stock> stockList) {
        double total = 0;
        for (int i = 0; i < stockList.size(); i++) {
            Stock stock = stockList.get(i);
            total += stock.getAssetValue();
        }
        return total;
    }

    public double findAverageCost(List<Stock> stockList) {
        return findTotalCost(stockList) / stockList.size();
    }

    // Tests

    public void findTotalCostTest(List<Stock> stockList) {
        double expected = 1319.31;
        double actual = findTotalCost(stockList);
        if (actual == expected) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail" + " because actual result " + actual + " not equal expected " + expected);
        }
    }

    public void findAverageCostTest(List<Stock> stockList) {
        double expected = 263.86199999999997;
        double actual = findAverageCost(stockList);
        if (actual == expected) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail" + " because actual result " + actual + " not equal expected " + expected);
        }
    }
}
