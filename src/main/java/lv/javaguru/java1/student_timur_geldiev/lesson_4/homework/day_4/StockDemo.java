package lv.javaguru.java1.student_timur_geldiev.lesson_4.homework.day_4;

class StockDemo {
    public static void main(String[] args) {
        Stock AAPL = new Stock("Apple", 185.27);
        AAPL.updatePrice(150, 120.22, 190.20);
        System.out.println(AAPL.getPriceInformation());

    }
}
