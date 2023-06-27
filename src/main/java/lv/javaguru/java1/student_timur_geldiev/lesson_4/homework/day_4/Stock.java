package lv.javaguru.java1.student_timur_geldiev.lesson_4.homework.day_4;

public class Stock {
    String companyName;
    double startPrice;
    double currentPrice;
    double minPrice;
    double maxPrice;

    public Stock(String companyName, double startPrice) {
        this.companyName = companyName;
        this.startPrice = startPrice;
    }

    public void updatePrice(double currentPrice, double minPrice, double maxPrice) {
        this.currentPrice = currentPrice;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;

    }

    public String getPriceInformation() {
        return "Company: " + companyName +
                "\nCurrent Price: " + currentPrice +
                "\nMinimum Price: " + minPrice +
                "\nMaximum Price: " + maxPrice;
    }
}
