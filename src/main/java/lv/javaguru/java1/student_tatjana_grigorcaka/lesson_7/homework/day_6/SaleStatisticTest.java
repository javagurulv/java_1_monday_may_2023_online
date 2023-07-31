package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_7.homework.day_6;



class SaleStatisticTest {

    public static void main(String[] args) {

        SaleStatisticTest test = new SaleStatisticTest();
        test.testBestSellingProductByCount();
        test.testMostProfitableProductBySalesIncomeSum();
    }

    public void testBestSellingProductByCount() {
        SaleStatistic saleStatistic = new SaleStatistic();
        Sale[] sales = {
                new Sale("Apple iPhone 11 Pro Max", 669.33, 3),
                new Sale("Apple iPhone 12 Pro Max", 836.83, 1),
                new Sale("Apple iPhone 13 Pro Max", 500.73, 4),
                new Sale("Apple iPhone 14 Pro Max", 1429.00, 2),
        };
        String bestSellingProduct = saleStatistic.findBestSellingProductByCount(sales);
        checkResult(bestSellingProduct, "Apple iPhone 13 Pro Max", "testBestSellingProductByCount");
    }

    public void testMostProfitableProductBySalesIncomeSum() {
        SaleStatistic saleStatistic = new SaleStatistic();
        Sale[] sales = {
                new Sale("Apple iPhone 11 Pro Max", 669.33, 3),
                new Sale("Apple iPhone 12 Pro Max", 836.83, 1),
                new Sale("Apple iPhone 13 Pro Max", 500.73, 4),
                new Sale("Apple iPhone 14 Pro Max", 1429.00, 2),
        };
        String mostProfitableProduct = saleStatistic.findMostProfitableProductBySalesIncomeSum(sales);
        checkResult(mostProfitableProduct, "Apple iPhone 14 Pro Max", "testMostProfitableProductBySalesIncomeSum");
    }

        private void checkResult(String realResult,
                String expectedResult,
                String testScenarioName) {
            if (realResult.equals(expectedResult)) {
                System.out.println(testScenarioName + ": TEST OK!");
            } else {
                System.out.println(testScenarioName + ": TEST FAIL!");
            }
        }
    }









