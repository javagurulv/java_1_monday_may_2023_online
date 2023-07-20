package lv.javaguru.java1.student_ainars_belinskis.lesson_6.homework.day_7;

class CompoundInterestCalculatorTest {
    public static void main(String[] args) {
        CompoundInterestCalculatorTest test = new CompoundInterestCalculatorTest();
        test.sum0Test();
        test.sumMin10Test();
        test.sum1000Test();
        test.interest10Test();
        test.interestMin10Test();
        test.years1000Test();
        test.yearsMin1000Test();
    }

    public void sum0Test(){
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double sum = 0;
        double interest = 2;
        double year = 2;
        double result = compoundInterestCalculator.compoundInterest(sum,interest,year);
        System.out.println("sum0Test: " + result);
        checkResult(result, 0,"sum0Test");
    }

    public void sum1000Test(){
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double sum = 1000;
        double interest = 2;
        double year = 2;
        double result = compoundInterestCalculator.compoundInterest(sum,interest,year);
        System.out.println("sum1000Test: " + result);
        checkResult(result, 0,"sum1000Test");
    }

    public void sumMin10Test(){
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double sum = -10;
        double interest = 2;
        double year = 2;
        double result = compoundInterestCalculator.compoundInterest(sum,interest,year);
        System.out.println("sumMin10Test: " + result);
        checkResult(result, 0,"sumMin10Test");
    }
    public void interest10Test(){
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double interest = 10;
        double sum = 1000;
        double year = 2;
        double result = compoundInterestCalculator.compoundInterest(sum,interest,year);
        System.out.println("interest10Test result is: " + result);
        checkResult(result, 0,"interest10Test");
    }
    public void interestMin10Test(){
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double interest = -10;
        double sum = 1000;
        double year = 2;
        double result = compoundInterestCalculator.compoundInterest(sum,interest,year);
        System.out.println("interestMin10Test result is: " + result);
        checkResult(result, 0,"interestMin10Test");
    }
    public void years1000Test(){
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double interest = 10;
        double sum = 1000;
        double year = 2;
        double result = compoundInterestCalculator.compoundInterest(sum,interest,year);
        System.out.println("years1000Test result is: " + result);
        checkResult(result, 0,"years1000Test");
    }
    public void yearsMin1000Test(){
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double interest = 2;
        double sum = 1000;
        double year = 1000;
        double result = compoundInterestCalculator.compoundInterest(sum,interest,year);
        System.out.println("yearsMin1000Test result is: " + result);
        checkResult(result, 0,"yearsMin1000Test");
    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }

}
