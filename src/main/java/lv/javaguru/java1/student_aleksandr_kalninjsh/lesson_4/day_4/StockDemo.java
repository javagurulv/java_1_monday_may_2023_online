package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_4.day_4;

public class StockDemo {

    public static void main(String[] args) {

        Stock google = new Stock("Google", 10, 7, 15);

        google.getPriceInformation();
        google.updatePrice(15);
        google.getPriceInformation();
        google.updatePrice(7);
        google.getPriceInformation();
        google.updatePrice(14);
        
    }

}
