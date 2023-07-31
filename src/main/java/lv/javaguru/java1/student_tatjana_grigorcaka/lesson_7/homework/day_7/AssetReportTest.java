package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_7.homework.day_7;


class AssetReportTest {

    public static void main(String[] args) {

        AssetReportTest test = new AssetReportTest();
        test.testCalculateTotalAssetValue();
        test.testCalculatePortfolioReturnPercentage();
    }


    public void testCalculateTotalAssetValue() {
        AssetReport assetReport = new AssetReport();
        Stock[] stocks = {
                new Stock("A", 20000.0, 18.0),
                new Stock("B", 25000.0, 12.0),
                new Stock("C", 30000.0, 10.0),
        };

        double totalAssetValue = assetReport.calculateTotalAssetValue(stocks);
        checkResult(totalAssetValue, 75000.0, "testCalculateTotalAssetValue");
    }


    public void testCalculatePortfolioReturnPercentage() {
        Stock[] stocks = {
                new Stock("A", 20000.0, 18.0),
                new Stock("B", 25000.0, 12.0),
                new Stock("C", 30000.0, 10.0),

        };
        AssetReport assetReport = new AssetReport ();
        double averageReturnInPercents = assetReport.calculatePortfolioReturnPercentage(stocks);
        checkResult(averageReturnInPercents, 12.8, "testCalculatePortfolioReturnPercentage");
    }


    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }
}
