package lv.javaguru.java1.student_ainars_belinskis.lesson_4.homework.day_4;

class Stock {
    private String kompanyName;
    private double presentPrice;
    private double minPrice;
    private double maxPrice;

    public Stock(String kompanyName, double presentPrice) {
        this.kompanyName = kompanyName;
        this.presentPrice = presentPrice;
    }

    public void setPresentPrice(double presentPrice) {
        this.presentPrice = presentPrice;

    }

    public void updatePrice() {
        if (minPrice == 0) {
            this.minPrice = presentPrice;
        }
         if (maxPrice == 0) {
            this.maxPrice = presentPrice;
        }
         if (maxPrice <= presentPrice) {
            this.maxPrice = presentPrice;
        }
        if (minPrice >= presentPrice) {
            this.minPrice = presentPrice;
        }

    }

    public String getPriceInformation() {
        return "Kompany: " + kompanyName + ", Min Price: " + minPrice + ", Present Price: " + presentPrice + ", Max Price: " + maxPrice;
    }


}
