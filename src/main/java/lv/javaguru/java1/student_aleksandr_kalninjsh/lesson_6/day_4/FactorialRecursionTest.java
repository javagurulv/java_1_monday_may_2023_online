package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_6.day_4;

public class FactorialRecursionTest {

    public static void main(String[] args) {

        FactorialForLoopTest factorialForLoopTest = new FactorialForLoopTest();
        factorialForLoopTest.factorial();
    }
    public void factorial() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int expectedResult = 1;
        int realResult = factorialForLoop.factorial(1);
        if (realResult == expectedResult) {
            System.out.println("Factorial test = OK");
        }
        else {
            System.out.println("Factorial test = FAIL");
        }
    }


}
