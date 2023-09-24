package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_6.homework.day_2;

public class SquareEquationTest {
    public static void main(String[] args) {
        SquareEquationTest test = new SquareEquationTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }
    public void test1 () {
        SquareEquation discriminant = new SquareEquation();
        double result = discriminant.discriminant(5,7,10);
        checkResult(result, -151,"test1");
    }
    public void test2 () {
        SquareEquation isSquareRoot1 = new SquareEquation();
        boolean result = isSquareRoot1.isSquareRoot(1,10,2);
        if (result == true) {
            System.out.println("test2: PASS");
        } else {
            System.out.println("test2: FAIL");
        }
    }
    public void test3 () {
        SquareEquation firstRoot = new SquareEquation();
        double result = firstRoot.firstRoot(2,3,1);
        checkResult(result, -1, "test3");
    }
    public void test4 () {
        SquareEquation secondRoot = new SquareEquation();
        double result = secondRoot.secondRoot(2,3,1);
        checkResult(result, -0.5,"test4");
    }
    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": PASS");
        } else {
            System.out.println(testScenarioName + ": FAIL");
        }
    }
}