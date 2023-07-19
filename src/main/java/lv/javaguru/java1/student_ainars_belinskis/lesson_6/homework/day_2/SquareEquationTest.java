package lv.javaguru.java1.student_ainars_belinskis.lesson_6.homework.day_2;

class SquareEquationTest {
    public static void main(String[] args) {
        SquareEquationTest test = new SquareEquationTest();
        test.testDiscrinimant0();
        test.testDiscrinimantMore0();
        test.testDiscrinimantLess0();
        test.testBooleanDiscrinimant0();
        test.testBooleanDiscrinimantMore0();
        test.testBooleanDiscrinimantLess0();
        test.testFistRootDiscrinimant0();
        test.testSecondRootDiscrinimant0();
        test.testFistRootDiscrinimantMore0();
        test.testSecondRootDiscrinimantMore0();

    }

    public void testDiscrinimant0(){
        SquareEquation squareEquation = new SquareEquation();
        int a = 2;
        int b = 4;
        int c = 2;
        double result = squareEquation.discriminant(a,b,c);
        checkResult(result,0,"testDiscrinimant0");
    }

    public void testDiscrinimantMore0(){
        SquareEquation squareEquation = new SquareEquation();
        int a = 3;
        int b = 5;
        int c = 2;
        double result = squareEquation.discriminant(a,b,c);
        checkResult(result,1,"testDiscrinimantMore0");
    }

    public void testDiscrinimantLess0(){
        SquareEquation squareEquation = new SquareEquation();
        int a = 3;
        int b = 4;
        int c = 2;
        double result = squareEquation.discriminant(a,b,c);
        checkResult(result,-8,"testDiscrinimantLess0");
    }

    public void testBooleanDiscrinimant0(){
        SquareEquation squareEquation = new SquareEquation();
        int a = 2;
        int b = 4;
        int c = 2;
        boolean result = squareEquation.isSquareRoot(a,b,c);
        checkResult2(result, true,"testBooleanDiscrinimant0");
    }

    public void testBooleanDiscrinimantMore0(){
        SquareEquation squareEquation = new SquareEquation();
        int a = 3;
        int b = 5;
        int c = 2;
        boolean result = squareEquation.isSquareRoot(a,b,c);
        checkResult2(result, true,"testBooleanDiscrinimantMore0");
    }

    public void testBooleanDiscrinimantLess0(){
        SquareEquation squareEquation = new SquareEquation();
        int a = 3;
        int b = 4;
        int c = 2;
        boolean result = squareEquation.isSquareRoot(a,b,c);
        checkResult2(result, false,"testBooleanDiscrinimantLess0");
    }
    public void testFistRootDiscrinimant0(){
        SquareEquation squareEquation = new SquareEquation();
        int a = 2;
        int b = 4;
        int c = 2;
        double result = squareEquation.firstRoot(a,b,c);
        checkResult(result,-1,"testFistRootDiscrinimant0");
    }
    public void testSecondRootDiscrinimant0(){
        SquareEquation squareEquation = new SquareEquation();
        int a = 2;
        int b = 4;
        int c = 2;
        double result = squareEquation.secondRoot(a,b,c);
        checkResult(result,-1,"testSecondRootDiscrinimant0");
    }

    public void testFistRootDiscrinimantMore0(){
        SquareEquation squareEquation = new SquareEquation();
        int a = 3;
        int b = 6;
        int c = 2;
        double result = squareEquation.firstRoot(a,b,c);
        checkResult(result,-1.57735,"testFistRootDiscrinimantMore0");
    //result -1.5773502691896255
    }

    public void testSecondRootDiscrinimantMore0(){
        SquareEquation squareEquation = new SquareEquation();
        int a = 3;
        int b = 6;
        int c = 2;
        double result = squareEquation.secondRoot(a,b,c);
        checkResult(result,-0.42265,"testSecondRootDiscrinimantMore0");
    //result -0.42264973081037427
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

    private void checkResult2(boolean realResult,
                             boolean expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }


}
