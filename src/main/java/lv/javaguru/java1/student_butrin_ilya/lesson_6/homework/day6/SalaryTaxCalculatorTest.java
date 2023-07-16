package lv.javaguru.java1.student_butrin_ilya.lesson_6.homework.day6;

public class SalaryTaxCalculatorTest {
    SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();

    public static void main(String[] args) {
        SalaryTaxCalculatorTest test = new SalaryTaxCalculatorTest();
        test.taxTo10000();
        test.taxTo50000();
        test.taxMore50000();

    }

    public void taxTo10000() {
        double realRezult = 1500;
        double expextedRezult = salaryTaxCalculator.calculate(5000);
        checkRezultTrue(realRezult, expextedRezult, "tax from 5000");

    }

    public void taxTo50000() {
        double realRezult = 7000;
        double expextedRezult = salaryTaxCalculator.calculate(20000);
        checkRezultTrue(realRezult, expextedRezult, "tax from 20000");

    }
    public void taxMore50000() {
        double realRezult = 44000;
        double expextedRezult = salaryTaxCalculator.calculate(100000);
        checkRezultTrue(realRezult, expextedRezult, "tax from 100000");

    }


    public void checkRezultTrue(double real, double expected, String name) {
        if (real == expected) {
            System.out.println("test " + name + " is OK");
        } else {
            System.out.println("test " + name + " is FAIL. Reason: real rezul "
                    + real + " not equal expexted rezul " + expected);
        }
    }
}
