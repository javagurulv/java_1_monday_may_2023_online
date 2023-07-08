package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_4.day_4;

public class Stock {

    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    public Stock(String companyName, int currentPrice, int minPrice, int maxPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;

    }
    String getCompanyName() {
        return companyName;
    }
    int getCurrentPrice() {
        return currentPrice;
    }
    int getMinPrice() {
        return minPrice;
    }
    int getMaxPrice() {
        return maxPrice;
    }
    public void updatePrice(int newPrice) {
        currentPrice = newPrice;
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
        else if (newPrice < minPrice) {
            minPrice = newPrice;
        }
    }
    public void getPriceInformation() {
        System.out.println("Company name = " + companyName);
        System.out.println("Current price = " + currentPrice);
        System.out.println("Min price = " + minPrice);
        System.out.println("Max price = " + maxPrice);
    }

}
