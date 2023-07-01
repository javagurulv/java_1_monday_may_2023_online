package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_4.homework.day_4;

class StockTest {

    public static void main(String[] args) {
        Stock amazon = new Stock("Amazon", 10);
            String priceInformation = amazon.getPriceInformation();
            System.out.println(priceInformation);
            amazon.updatePrice(12);
            amazon.updatePrice(5);
            amazon.updatePrice(7);
            amazon.updatePrice(99);
            amazon.updatePrice(77);
            priceInformation = amazon.getPriceInformation();
            System.out.println(amazon.getPriceInformation());
        }
    }





