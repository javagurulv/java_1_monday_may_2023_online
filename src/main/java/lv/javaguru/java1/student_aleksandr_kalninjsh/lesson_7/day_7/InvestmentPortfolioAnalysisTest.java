package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_7.day_7;

class InvestmentPortfolioAnalysisTest {

    public static void main(String[] args) {
        InvestmentPortfolioAnalysisTest investmentPortfolioAnalysisTest = new InvestmentPortfolioAnalysisTest();
        investmentPortfolioAnalysisTest.calculateTotalAssetValue();
        investmentPortfolioAnalysisTest.calculateAveragePortfolioReturnPercentage();
    }

    public void calculateTotalAssetValue() {
        InvestmentPortfolioAnalysis investmentPortfoAnalysis = new InvestmentPortfolioAnalysis();
        Stock[] stocks = {
                new Stock("GOOGLE", 90000.0, 90.68),
                new Stock("BING", 40000, 3.23),
                new Stock("YAHOO!", 20000, 3.17),
        };
        double totalAssetValue = investmentPortfoAnalysis.calculateTotalAssatValue(stocks);
        checkResult(totalAssetValue, 150000, "calculateTotalAssetValue");
    }

    public void calculateAveragePortfolioReturnPercentage() {
        InvestmentPortfolioAnalysis investmentPortfoAnalysis = new InvestmentPortfolioAnalysis();
        Stock[] stocks = {
                new Stock("GOOGLE", 90000.0, 90.68),
                new Stock("BING", 40000, 3.23),
                new Stock("YAHOO!", 20000, 3.17),
        };
        double averageReturnPortfolioPercentage = investmentPortfoAnalysis.calculateAveragePortfolioReturnPercentage(stocks);
        checkResult(averageReturnPortfolioPercentage, 55.692, "calculateAveragePortfolioReturnPercentage");
    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(testScenarioName + ": Test OK");
        } else {
            System.out.println(testScenarioName + ": Test FAIL");
        }
    }
}
