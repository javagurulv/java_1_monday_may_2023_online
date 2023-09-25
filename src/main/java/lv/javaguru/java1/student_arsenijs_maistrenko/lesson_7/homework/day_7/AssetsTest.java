package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_7.homework.day_7;

class AssetsTest {

    public static void main(String[] args) {
        AssetsTest test = new AssetsTest();
        test.test1();
        test.test2();
    }
    public void test1() {
        Assets assetReport = new Assets();
        Stock[] stocks = {
                new Stock("ABC", 215.45, 1.0),
                new Stock("ASD", 12.12, 10.0),
                new Stock("QWE", 5423.12, 5.0),
                new Stock("FGH", 100.24, 12.0),
        };

        double totalAssetValue = assetReport.calculateTotalAssetValue(stocks);
        checkResult(totalAssetValue, 5750.93, "test1");
    }


    public void test2() {
        Stock[] stocks = {
                new Stock("ABC", 215.45, 1.0),
                new Stock("ASD", 12.12, 10.0),
                new Stock("QWE", 5423.12, 5.0),
                new Stock("FGH", 100.24, 12.0),

        };
        Assets assetReport = new Assets ();
        double averageReturnInPercents = assetReport.calculatePortfolioReturnPercentage(stocks);
        checkResult(averageReturnInPercents, 4.982694972813093, "test2");
    }


    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(testScenarioName + ": PASS");
        } else {
            System.out.println(testScenarioName + ": FAIL");
        }
    }
}