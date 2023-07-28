package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_7.homework.day_6;


import java.util.ArrayList;
import java.util.List;

public class SaleStatistic {

    public static void main(String[] args) {

        Sale sale1 = new Sale("Apple iPhone 11 Pro Max", 669.33, 3);
        Sale sale2 = new Sale("Apple iPhone 12 Pro Max", 836.83, 1);
        Sale sale3 = new Sale("Apple iPhone 13 Pro Max", 883.73, 4);
        Sale sale4 = new Sale("Apple iPhone 14 Pro Max", 1429.00, 2);

        List<Sale> allSales = new ArrayList<>();
        int size = allSales.size();

        allSales.add(sale1);
        allSales.add(sale2);
        allSales.add(sale3);
        allSales.add(sale4);

        for (int i = 0; i < allSales.size(); i++) {
            Sale sale = allSales.get(i);
        }
    }

    private List<Sale> allSales = new ArrayList<>();
    public double bestSellingProduct(List<Sale> allSales, String product) {
        String maxUnitCountProduct = null;
        double maxUnitCount = 0;
        for (int i = 0; i < allSales.size(); i++) {
            Sale sale = allSales.get(i);
            if (sale.getUnitCount() > maxUnitCount) {
                maxUnitCount = sale.getUnitCount();
                maxUnitCountProduct = sale.getProduct();
            }
        }
        System.out.println("The best selling product is :  " + maxUnitCountProduct + " with sold units: " + maxUnitCount);
        return maxUnitCount;
    }



    public double mostProfitableProduct(List<Sale> allSales, String product) {
        String maxUnitCountProduct = null;
        double maxProfit = 0;
        double profit = 0;
        for (int i = 0; i < allSales.size(); i++) {
            Sale sale = allSales.get(i);
            profit = sale.getPricePerUnit() * sale.getUnitCount();
            if (profit > maxProfit) {
                maxProfit = (int) profit;
                maxUnitCountProduct = sale.getProduct();
            }
        }
        System.out.println("The best profitable product is :  " + maxUnitCountProduct + " with profit: " + maxProfit);
        return maxProfit;
    }
}
