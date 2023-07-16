package lv.javaguru.java1.student_butrin_ilya.lesson_6.homework.day7;

import lv.javaguru.java1.student_butrin_ilya.lesson_6.homework.day1.AverageFinderTest;

public class CompoundInterestCalculatorTest {
    CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        public static void main(String[] args) {
CompoundInterestCalculatorTest test = new CompoundInterestCalculatorTest();
test.CompoundInterestTest();
        }
        public void CompoundInterestTest () {
            int start = 10000;
            int interest = 10;
            int year = 2;
            double realRezult = start * Math.pow((1 + (interest / 100d)), year);
            double expectedRezultOne = compoundInterestCalculator.CompoundInterest(10000,10,2);
            checkRezult(realRezult , expectedRezultOne , "averageTestIntRezult");
        }

    public void checkRezult(double real, double expected, String name) {
        if (real == expected) {
            System.out.println("test " + name + " is OK");
        } else {
            System.out.println("test " + name + " is FAIL. Reason: real rezul "
                    + real + " not equal expexted rezul " + expected);
        }
    }
}

