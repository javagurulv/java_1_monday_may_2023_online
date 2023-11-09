package lv.javaguru.java1.student_alexey_kosmachev.lesson_5.homework.day_7;

import java.util.Scanner;

class Stock {

    String stockName;
    Scanner scanner = new Scanner(System.in);


    public String stockName() {
        System.out.print("Введите название акции: ");
        this.stockName = scanner.nextLine();
        return stockName;
    }

    public int stockPriceCount() {
        System.out.print("Введите количество котировок акции: ");
        int stockPriceCount = Integer.parseInt(scanner.nextLine());
        return stockPriceCount;
    }

    public double[] writeStockPrices(int stockPriceCount) {
        double[] prices = new double[stockPriceCount];
        for (int i = 0; i < stockPriceCount; i++) {
            System.out.print("Введите цену акции " + (i + 1) + ": ");
            prices[i] = Double.parseDouble(scanner.nextLine());
        }
        return prices;
    }
    public void writeMaxStockPrice(double[] prices) {
        double maxPrice = prices[0];
        for (double price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        System.out.println("Максимальная цена акции " + stockName + ": " + maxPrice);
    }

    public void writeMinStockPrice(double prices[]) {
        double minPrice = prices[0];
        for (double price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        System.out.println("Минимальная цена акции " + stockName + ": " + minPrice);
    }

    public void writeAverageStockPrice(double[] prices) {
        double totalPrice = 0.0;
        for (double price : prices) {
            totalPrice = totalPrice + price;
        }
        double averagePrice = totalPrice / prices.length;
        System.out.println("Средняя цена акции " + stockName + ": " + averagePrice);
    }

}
