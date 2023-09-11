package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_7.day_6;

class SalesAnalysisTest {

    public static void main(String[] args) {
        SalesAnalysisTest salesAnalysisTest = new SalesAnalysisTest();
        salesAnalysisTest.bestSellingProductByCount();
        salesAnalysisTest.mostProfitableProductBySalesAmount();
    }

    public void bestSellingProductByCount() {
        SalesAnalysis salesAnalysis = new SalesAnalysis();
        Sale[] sales = {
                new Sale("TV LG", 835, 9),
                new Sale("washing mashine BOSCH", 929, 5),
                new Sale("fridge WHIRPOOL", 700, 4),
                new Sale("vacuum cleaner BOSCH", 340, 3),
                new Sale("computer LENOVO", 1638, 7)
        };
        String bestSellingProduct = salesAnalysis.bestSellingProductByCount(sales);
        checkResult(bestSellingProduct, "TV LG", "bestSellingProductByCount");

    }


    public void mostProfitableProductBySalesAmount() {
        SalesAnalysis salesAnalysis = new SalesAnalysis();
        Sale[] sales = {
                new Sale("TV LG", 835, 9),
                new Sale("washing mashine BOSCH", 929, 5),
                new Sale("fridge WHIRPOOL", 700, 4),
                new Sale("vacuum cleaner BOSCH", 340, 3),
                new Sale("computer LENOVO", 1638, 7)
        };
        String mostProfitableProduct = salesAnalysis.mostProfitableProductBySalesAmount(sales);
        checkResult(mostProfitableProduct, "computer LENOVO", "mostProfitableProductBySalesAmount");

    }

    private void checkResult(String realResult,
                             String expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": Test OK");
        } else {
            System.out.println(testScenarioName + ": Test FAIL");
        }
    }

    }


