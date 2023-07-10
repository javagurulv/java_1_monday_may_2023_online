package lv.javaguru.java1.student_alexey_kosmachev.lesson_5.homework.day_5;



public class ComplicatedPercentApp {
    public static void main(String[] args) {

        ComplicatedPercent newsumm = new ComplicatedPercent();

        System.out.println("The amount of your money after defined term is: ");
        System.out.printf(newsumm.investment(1200, 5.5, 10) + " EUR ");
        System.out.println();
        System.out.printf(newsumm.investment(500, 8.2, 7) + " EUR ");
        System.out.println();
        System.out.printf(newsumm.investment(50000, 2.2, 15) + " EUR ");
        System.out.println();
        System.out.printf(newsumm.investment(100000, 1.3, 20) + " EUR ");


    }
}
