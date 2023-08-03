package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_6.day_7;

public class CompoundInterestCalculatorTest {

    public static void main(String[] args) {

        CompoundInterestCalculatorTest compoundInterestCalculatorTest = new CompoundInterestCalculatorTest();
        compoundInterestCalculatorTest.compoundInterest();
    }
    public void compoundInterest() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double sum = 0;
        double interest = 0;
        double year = 0;
        double expectedResult = 0;
        double realResult = compoundInterestCalculator.compoundInterest(sum, interest, year);
        if (realResult == expectedResult) {
            System.out.println("Compound interest test = OK");
        }
        else {
            System.out.println("Compound interest test = FAIL");
        }

    }
}
