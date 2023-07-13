package lv.javaguru.java1.student_timur_geldiev.lesson_6.homework.day_2;

public class SquareEquationTest {
    int a = 1;
    int b = -2;
    int c = -3;
    public static void main(String[] args) {
        SquareEquationTest test = new SquareEquationTest();
        test.checkDiscriminant();
        test.checkIsRoots();
        test.checkFirstRoot();
        test.checkSecondRoot();
    }
    public void checkDiscriminant(){
        SquareEquation check1 = new SquareEquation();
        double actual = check1.discriminant(a, b, c);
        checkResult(actual, 16, "Discriminant check");
    }
    public void checkIsRoots(){
        SquareEquation check2 = new SquareEquation();
        boolean actual = check2.isSquareRoot(a, b, c);
        checkResultBoolean(actual, true, "Is Roots check");
    }
    public void checkFirstRoot(){
        SquareEquation check3 = new SquareEquation();
        double actual = check3.firstRoot(a, b, c);
        checkResult(actual, -1, "First Root check");

    }
    public void checkSecondRoot(){
        SquareEquation check4 = new SquareEquation();
        double actual = check4.secondRoot(a, b, c);
        checkResult(actual, 3, "Second Root check");

    }
    public void checkResult(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " Test PASS");
        } else {
            System.out.println(testName + " Test FAIL");
        }
    }
    public void checkResultBoolean(boolean actualResult, boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " Test PASS");
        } else {
            System.out.println(testName + " Test FAIL");
        }
    }

}
