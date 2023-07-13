package lv.javaguru.java1.student_timur_geldiev.lesson_6.homework.day_4;

public class FactorialForLoopTest {
    public static void main(String[] args) {
        FactorialForLoopTest test = new FactorialForLoopTest();
        test.checkFactorialCalculation();
    }
    public void checkFactorialCalculation(){
        int number = 5;
        FactorialForLoop check = new FactorialForLoop();
        int actual = check.factorial(number);
        checkResult(actual, 120, "Factorial check");

    }
    public void checkResult(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " Test PASS");
        } else {
            System.out.println(testName + " Test FAIL");
        }
    }
}
