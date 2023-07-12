package lv.javaguru.java1.student_alexey_kosmachev.lesson_6.homework.day_2;


// diskriminant a = 5, b = 7, c = 10 return - 151
// isSquareRoot1 a = 1, b = 10, c = 2 return >= 0 true
// isSquareRoot2 a = 1, b = 2, c = 1 return = 0 true
// first root a = 2, b = 3, c = 1 return = - 1
// second root a = 2, b = 3, c = 1 return = - 0.5
public class SquareEquationTest {

    public static void main(String[] args) {
        SquareEquationTest test = new SquareEquationTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
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
            System.out.println("test2: TEST OK!");
        } else {
            System.out.println("test2: TEST FAIL!");
        }
    }
    public void test3 () {
        SquareEquation isSquareRoot2 = new SquareEquation();
        boolean result = isSquareRoot2.isSquareRoot(1,2,1);
        if (result == true) {
            System.out.println("test3: TEST OK!");
        } else {
            System.out.println("test3: TEST FAIL!");
        }
    }

    public void test4 () {
        SquareEquation isSquareRoot2 = new SquareEquation();
        boolean result = isSquareRoot2.isSquareRoot(5,7,10);
        if (result == false) {
            System.out.println("test4: TEST OK!");
        } else {
            System.out.println("test4: TEST FAIL!");}
    }
    public void test5 () {
        SquareEquation firstRoot = new SquareEquation();
        double result = firstRoot.firstRoot(2,3,1);
        checkResult(result, -1, "test5");
    }
    public void test6 () {
        SquareEquation secondRoot = new SquareEquation();
        double result = secondRoot.secondRoot(2,3,1);
        checkResult(result, -0.5,"test6");
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
