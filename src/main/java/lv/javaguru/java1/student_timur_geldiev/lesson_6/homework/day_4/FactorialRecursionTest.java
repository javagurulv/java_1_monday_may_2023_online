package lv.javaguru.java1.student_timur_geldiev.lesson_6.homework.day_4;

public class FactorialRecursionTest {
    public static void main(String[] args) {
        FactorialRecursionTest test = new FactorialRecursionTest();
        test.checkFactorialCalculation();
    }
    public void checkFactorialCalculation(){
        int number = 6;
        FactorialRecursion check = new FactorialRecursion();
        int actual = check.factorial(number);
        checkResult(actual, 720, "Factorial check");

    }
    public void checkResult(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " Test PASS");
        } else {
            System.out.println(testName + " Test FAIL." + " Reason: " + "actualResult: " + actualResult + " not equal expected result: " + expectedResult );
        }
    }
}
