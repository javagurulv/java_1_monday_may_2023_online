package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_5.homework.day_3;

public class TaxesApp {
    public static void main(String[] args) {
        Taxes taxes = new Taxes();

        System.out.println("Taxes:" + taxes.Taxes(11000));
        System.out.println("Taxes:" + taxes.Taxes(9000));
        System.out.println("Taxes:" + taxes.Taxes(31524));
        System.out.println("Taxes:" + taxes.Taxes(55555));
        System.out.println("Taxes:" + taxes.Taxes(0));
        System.out.println("Taxes:" + taxes.Taxes(1));
        System.out.println("Taxes:" + taxes.Taxes(-1));

    }
}