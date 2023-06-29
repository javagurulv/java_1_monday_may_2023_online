package lv.javaguru.java1.student_ainars_belinskis.lesson_4.homework.day_4;

class StockTest {
    public static void main(String[] args) {
        Stock bigBank = new Stock("BigBank", 10);
        bigBank.updatePrice();
        System.out.println(bigBank.getPriceInformation());
        bigBank.setPresentPrice(12);
        bigBank.updatePrice();
        System.out.println(bigBank.getPriceInformation());
        bigBank.setPresentPrice(5);
        bigBank.updatePrice();
        System.out.println(bigBank.getPriceInformation());
        bigBank.setPresentPrice(7);
        bigBank.updatePrice();
        System.out.println(bigBank.getPriceInformation());
        bigBank.setPresentPrice(99);
        bigBank.updatePrice();
        System.out.println(bigBank.getPriceInformation());
        bigBank.setPresentPrice(77);
        bigBank.updatePrice();
        System.out.println(bigBank.getPriceInformation());

    }
}
