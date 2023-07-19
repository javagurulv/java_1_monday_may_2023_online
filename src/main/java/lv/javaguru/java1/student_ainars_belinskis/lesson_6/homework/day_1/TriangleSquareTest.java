package lv.javaguru.java1.student_ainars_belinskis.lesson_6.homework.day_1;

class TriangleSquareTest {
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
        int a = 4;
        int b = 8;
        int c = 7;
        double result = triangleSquare.calculateSquare(a,b,c);
        checkResult(result,14,"testSquare");
    }
//real result 13.99776...., поэтому тест Failed.

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
