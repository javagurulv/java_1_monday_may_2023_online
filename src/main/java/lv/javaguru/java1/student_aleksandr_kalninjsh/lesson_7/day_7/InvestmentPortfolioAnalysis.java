package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_7.day_7;

public class InvestmentPortfolioAnalysis {

    public double calculateTotalAssatValue(Stock[] stocks) {
        double totalAssetValue = 0.0;
        for (int i = 0; i < stocks.length; i++) {
            Stock stock = stocks[i];
            totalAssetValue += stock.getAssetValue();
        }
        return totalAssetValue;
    }

    public double calculateAveragePortfolioReturnPercentage(Stock[] stocks) {
        double totalAssetValue = calculateTotalAssatValue(stocks);
        double totalReturnValue = calculateTotalReturnValue(stocks);
        return (totalReturnValue * 100) / totalAssetValue;
    }

    private double calculateTotalReturnValue(Stock[] stocks) {
        double totalReturnValue = 0.0;
        for (int i = 0; i < stocks.length; i++) {
            Stock stock = stocks[i];
            totalReturnValue += stock.getAssetValue() / 100 * stock.getReturnInPercents();
        }
        return totalReturnValue;
    }
}
