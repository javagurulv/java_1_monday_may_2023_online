package lv.javaguru.java1.student_butrin_ilya.lesson_5.homework.day3;

public class TaxCalculationApp {
    public static void main(String[] args) {
        TaxCalculation taxCalculation = new TaxCalculation();
        System.out.println(taxCalculation.calculateTax(100));
        System.out.println(taxCalculation.calculateTax(1000));
        System.out.println(taxCalculation.calculateTax(10000));
        System.out.println(taxCalculation.calculateTax(20000));
        System.out.println(taxCalculation.calculateTax(200000));
        System.out.println(taxCalculation.calculateTax(-5));
    }
}
