package lv.javaguru.java1.student_alexey_kosmachev.lesson_5.homework.day_7;

import java.util.Scanner;

class StockApp {

    public static void main(String[] args) {
        Stock newStockList = new Stock();
        Scanner scanner = new Scanner(System.in);
        String stockName = newStockList.stockName();
        int stockPriceCount = newStockList.stockPriceCount();
        double[] prices = newStockList.writeStockPrices(stockPriceCount);
        newStockList.writeMaxStockPrice(prices);
        newStockList.writeMinStockPrice(prices);
        newStockList.writeAverageStockPrice(prices);


        System.out.println("Программа завершена.");

    }
}
