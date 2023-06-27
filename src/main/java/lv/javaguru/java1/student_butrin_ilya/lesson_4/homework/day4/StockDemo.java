package lv.javaguru.java1.student_butrin_ilya.lesson_4.homework.day4;

public class StockDemo {
    public static void main(String[] args) {
        Stock google = new Stock("GOOG", 0);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
        google.setOnlinePrice(15);
        google.setOnlinePrice(1000);
        google.setOnlinePrice(999);
        google.setOnlinePrice(1500);
        google.setOnlinePrice(-3.65);

        priceInformation = google.getPriceInformation();
        System.out.println(google.getPriceInformation());
    }
}
