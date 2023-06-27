package lv.javaguru.java1.student_butrin_ilya.lesson_4.homework.day4;

public class Stock {
    String nameCompany;
    double onlinePrice ;
    double minimumPrice ;
    double maximumPrice ;

    public Stock (String nameCompany, double onlinePrice) {
        this.nameCompany = nameCompany;
        this.onlinePrice = onlinePrice;
        if (onlinePrice >= maximumPrice) {
            this.maximumPrice = onlinePrice;
        }
        if (minimumPrice > onlinePrice || minimumPrice == 0) {
            this.minimumPrice = onlinePrice;
        }
    }

    public void setOnlinePrice(double onlinePrice) {

        this.onlinePrice = onlinePrice;

        if (onlinePrice >= maximumPrice) {
            this.maximumPrice = onlinePrice;
        }
        if (onlinePrice <= minimumPrice || minimumPrice == 0) {
            minimumPrice = onlinePrice;
        }
    }

    public String getPriceInformation(){
        String info = "Company name: " + nameCompany + " Online price: " +
                onlinePrice + " maximum price: " +  maximumPrice + " minimum price:" + minimumPrice;
        return info;
    }
}
