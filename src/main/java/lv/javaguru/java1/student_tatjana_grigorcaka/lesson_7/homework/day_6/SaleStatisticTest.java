package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_7.homework.day_6;


import java.util.ArrayList;
import java.util.List;


public class SaleStatisticTest {

    public static void main(String[] args) {

        List<Sale> allSales = new ArrayList<>();
        Sale sale1 = new Sale("Apple iPhone 11 Pro Max", 669.33, 3);
        Sale sale2 = new Sale("Apple iPhone 12 Pro Max", 836.83, 1);
        Sale sale3 = new Sale("Apple iPhone 13 Pro Max", 500.73, 4);
        Sale sale4 = new Sale("Apple iPhone 14 Pro Max", 1429.00, 2);

        allSales.add(sale1);
        allSales.add(sale2);
        allSales.add(sale3);
        allSales.add(sale4);

        SaleStatistic saleStatistic = new SaleStatistic();
        saleStatistic.bestSellingProduct(allSales, "Apple iPhone 13 Pro Max");
        saleStatistic.mostProfitableProduct(allSales, "Apple iPhone 14 Pro Max");

        SaleStatisticTest test = new SaleStatisticTest();
        test.testBestSellingProduct(allSales);
        test.testMostProfitableProduct(allSales);
    }

    public void testBestSellingProduct(List<Sale> allSales) {
        SaleStatistic saleStatistic1 = new SaleStatistic();
        double expectedResult = 4;
        double realResult = saleStatistic1.bestSellingProduct(allSales, "Apple iPhone 13 Pro Max");
        checkResult(realResult, 4, "testBestSellingProduct");
    }


    public void testMostProfitableProduct(List<Sale> allSales) {
        SaleStatistic saleStatistic1 = new SaleStatistic();
        double expectedResult = 2858;
        double realResult = saleStatistic1.mostProfitableProduct(allSales, "Apple iPhone 14 Pro Max");
        checkResult(realResult, 2858, "testBestSellingProduct");
    }


    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }
}









