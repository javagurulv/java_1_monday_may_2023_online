package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_7.homework.day_7;

class Assets {

    public double calculateTotalAssetValue(Stock[] stocks) {
        double totalAssetValue = 0.0;
        for (int i = 0; i < stocks.length; i++) {
            Stock stock = stocks[i];
            totalAssetValue += stock.getAssetValue();
        }
        return totalAssetValue;
    }

    public double calculatePortfolioReturnPercentage(Stock[] stocks) {
        double totalAssetValue = calculateTotalAssetValue(stocks);
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