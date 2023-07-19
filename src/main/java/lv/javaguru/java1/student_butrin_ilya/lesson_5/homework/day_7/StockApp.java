package lv.javaguru.java1.student_butrin_ilya.lesson_5.homework.day_7;

import java.util.Scanner;

class StockApp {

    public static void main(String[] args) {
        Stock stock = new Stock();
        Scanner scanner = new Scanner(System.in);
        String stockName = stock.stockName();
        int stockPriceCount = stock.stockPriceCount();
        double[] price = stock.price(stockPriceCount);
        stock.maxPrice(price);
        stock.minPrice(price);
        stock.averagePrice(price);

    }
}



