package lv.javaguru.java1.student_timur_geldiev.lesson_4.homework.day_4;

class Stock {
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

        if (currentPrice >= maxPrice) {
            this.currentPrice = maxPrice;
            this.maxPrice=maxPrice;
            this.minPrice = minPrice;
        } else if (currentPrice <= minPrice) {
            this.currentPrice = minPrice;
            this.minPrice = minPrice;
            this.maxPrice = maxPrice;
        } else {
            this.minPrice = minPrice;
            this.maxPrice = maxPrice;
            this.currentPrice = currentPrice;
        }
    }


    public String getPriceInformation() {
        return "Company: " + companyName +
                "\nCurrent Price: " + currentPrice +
                "\nMinimum Price: " + minPrice +
                "\nMaximum Price: " + maxPrice;
    }
}

