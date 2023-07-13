package lv.javaguru.java1.student_timur_geldiev.lesson_6.homework.day_7;

import java.text.DecimalFormat;

public class CompoundInterestCalculatorTest {
    public static void main(String[] args) {
        CompoundInterestCalculatorTest test = new CompoundInterestCalculatorTest();
        test.compoundInterestCheck();
    }

    public void compoundInterestCheck(){
        double sum = 20000;
        double interest = 6;
        double year = 10;
        CompoundInterestCalculator test1 = new CompoundInterestCalculator();
        DecimalFormat df = new DecimalFormat("#.##");
        double number = test1.CompoundInterest(sum, interest, year);
        String roundedNumber = df.format(number);
        double roundedValue = Double.parseDouble(roundedNumber);
        checkResult(roundedValue, 35816.95, "Compound interest check" );
    }
    public void checkResult(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " Test PASS");
        } else {
            System.out.println(testName + " Test FAIL");
        }
    }
}
