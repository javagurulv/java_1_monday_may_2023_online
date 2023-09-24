package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_6.homework.day_1;

public class TriangleSquareTest {
    public static void main(String[] args) {
        TriangleSquareTest test = new TriangleSquareTest();
        test.testPerimeter();
        test.testSquare();
    }
    public void testPerimeter(){
        TriangleSquare triangleSquare = new TriangleSquare();
        int a = 4;
        int b = 8;
        int c = 7;
        double result = triangleSquare.calculateSemiPerimeter(a,b,c);
        checkResult(result,9.5,"testPerimeter");
    }
    public void testSquare(){
        TriangleSquare triangleSquare = new TriangleSquare();
        int a = 3;
        int b = 4;
        int c = 5;
        double result = triangleSquare.calculateSquare(a,b,c);
        checkResult(result,15,"testSquare");
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