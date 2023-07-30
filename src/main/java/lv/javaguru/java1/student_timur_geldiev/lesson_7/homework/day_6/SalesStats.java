package lv.javaguru.java1.student_timur_geldiev.lesson_7.homework.day_6;

import java.util.ArrayList;
import java.util.List;

// А где тесты ?
class SalesStats {

    public static void main(String[] args) {

        Sale sale1 = new Sale("Table", 101.12, 2);
        Sale sale2 = new Sale("Chair", 53.50, 10);
        Sale sale3 = new Sale("Wardrobe", 250, 3);
        Sale sale4 = new Sale("Bed", 1500, 3);
        Sale sale5 = new Sale("Bookshelf", 30, 9);
        Sale sale6 = new Sale("Dresser", 55.55, 11);
        Sale sale7 = new Sale("Sofa", 999, 11);

        List<Sale> sales = new ArrayList<>();
        sales.add(sale1);
        sales.add(sale2);
        sales.add(sale3);
        sales.add(sale4);
        sales.add(sale5);
        sales.add(sale6);
        sales.add(sale7);

        SalesStats test = new SalesStats();
        test.bestSellerTest(sales);
        test.theMostProfitableTest(sales);

    }

    public String findBestSeller(List<Sale> saleList) {
        String foundSale = null;
        double mostSold = 0;
        for (int i = 0; i < saleList.size(); i++) {
            Sale sale = saleList.get(i);
            if (sale.getUnitCount() > mostSold) {
                mostSold = sale.getUnitCount();
                foundSale = sale.getProduct();
            }
        }
        return "Best seller is: " + foundSale + " with " + mostSold + " units sold.";
    }

    public String findTheMostProfitable(List<Sale> saleList) {
        String foundSale = null;
        double highestProfit = 0;
        for (int i = 0; i < saleList.size(); i++) {
            Sale sale = saleList.get(i);
            double profit = sale.getPricePerUnit() * sale.getUnitCount();
            if (profit > highestProfit) {
                highestProfit = profit;
                foundSale = sale.getProduct();
            }
        }
        return "The most profitable is " + foundSale + " with " + highestProfit + " earned.";
    }

    //Tests

    public void bestSellerTest(List<Sale> saleList) {
        String expected = "Dresser";
        String actual = findBestSeller(saleList);
        if (actual.contains(expected)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail" + " actual result " + actual + " is not equal to expected " + expected);
        }
    }

    public void theMostProfitableTest(List<Sale> saleList) {
        String expected = "Sofa";
        String actual = findTheMostProfitable(saleList);
        if (actual.contains(expected)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail" + " actual result " + actual + " is not equal to expected " + expected);
        }
    }
}
