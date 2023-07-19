package lv.javaguru.java1.student_butrin_ilya.lesson_5.homework.day_7;

import java.util.Scanner;

public class Stock {


    String stockName;
    Scanner scan = new Scanner(System.in);

    public String stockName() {
        System.out.println("Введите название акции: ");
        this.stockName = scan.nextLine();
        return stockName;
    }
    public int stockPriceCount() {
        System.out.print("Введите количество котировок акции: ");
        int stockPriceCount = Integer.parseInt(scan.nextLine());
        return stockPriceCount;
    }
    public double[] price(int stockPriceCount) {
        double[] price = new double[stockPriceCount];
        for (int i = 0; i < stockPriceCount; i++) {
            System.out.print("Введите цену акции " + (i + 1) + ": ");
            price[i] = Double.parseDouble(scan.nextLine());
        }
        return price;
    }
    public void maxPrice(double max[]) {
        double maximum = max[0];
        for (int i = 0; i < max.length - 1; i++) {
            if (maximum < max[i]) {
                maximum = max[i];
            }
        }
        System.out.println("Максимальная цена акции " + stockName + ": " + maximum);
    }
    public void minPrice(double min[]) {
        double minimum = min[0];
        for (int i = 0; i < min.length - 1; i++) {
            if (minimum > min[i]) {
                minimum = min[i];
            }
        }
        System.out.println("Минимальная  цена акции " + stockName + ": " + minimum);
    }
    public void averagePrice(double[] price) {
        double totalPrice = 0;
        for (double stockPrice : price) {
            totalPrice = totalPrice + stockPrice;
        }
        double averagePrice = totalPrice / price.length;
        System.out.println("Средняя цена акции " + stockName + ": " + averagePrice);
        System.out.println("Программа завершена.");
    }
}
