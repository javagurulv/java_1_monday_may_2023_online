package lv.javaguru.java1.student_ainars_belinskis.lesson_6.homework.day_4;

class FactorialForLoopTest {
    public static void main(String[] args) {
        FactorialForLoopTest test = new FactorialForLoopTest();
        test.testFactorialNum0();
        test.testFactorialNum1();
        test.testFactorialNum5();
        test.testFactorialNumMin5();
        test.testFactorialNum10();

    }

    public void testFactorialNum0(){
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int n = 0;
        int result = factorialForLoop.factorial(n);
        checkResult(result, 1,"testFactorialNum0");
    }
    public void testFactorialNum1(){
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int n = 1;
        int result = factorialForLoop.factorial(n);
        checkResult(result, 1,"testFactorialNum1");
    }
    public void testFactorialNum5(){
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int n = 5;
        int result = factorialForLoop.factorial(n);
        checkResult(result, 120,"testFactorialNum5");
    }
    public void testFactorialNumMin5(){
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int n = -5;
        int result = factorialForLoop.factorial(n);
        checkResult(result, 1,"testFactorialNumMin5");
    }
    public void testFactorialNum10(){
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int n = 10;
        int result = factorialForLoop.factorial(n);
        checkResult(result, 3628800,"testFactorialNum10");
    }


    private void checkResult(int realResult,
                             int expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }

}
