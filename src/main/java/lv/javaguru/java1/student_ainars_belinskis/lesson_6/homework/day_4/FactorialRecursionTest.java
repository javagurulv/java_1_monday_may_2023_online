package lv.javaguru.java1.student_ainars_belinskis.lesson_6.homework.day_4;

class FactorialRecursionTest {
    public static void main(String[] args) {
        FactorialRecursionTest test = new FactorialRecursionTest();
        test.testFactorialNum0();
        test.testFactorialNum1();
        test.testFactorialNum5();
        test.testFactorialNumMin5();
        test.testFactorialNum10();

    }

    public void testFactorialNum0(){
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int n = 0;
        int result = factorialRecursion.factorial(n);
        checkResult(result, 1,"testFactorialNum0");
    }
    public void testFactorialNum1(){
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int n = 1;
        int result = factorialRecursion.factorial(n);
        checkResult(result, 1,"testFactorialNum1");
    }
    public void testFactorialNum5(){
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int n = 5;
        int result = factorialRecursion.factorial(n);
        checkResult(result, 120,"testFactorialNum5");
    }
    public void testFactorialNumMin5(){
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int n = -5;
        int result = factorialRecursion.factorial(n);
        checkResult(result, 1,"testFactorialNumMin5");
    }
    public void testFactorialNum10(){
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int n = 10;
        int result = factorialRecursion.factorial(n);
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
