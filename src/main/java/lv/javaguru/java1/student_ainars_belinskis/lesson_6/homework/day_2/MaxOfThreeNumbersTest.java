package lv.javaguru.java1.student_ainars_belinskis.lesson_6.homework.day_2;

class MaxOfThreeNumbersTest {
    public static void main(String[] args) {
        MaxOfThreeNumbersTest test = new MaxOfThreeNumbersTest();
        test.maxTestNum123();
        test.maxTestNum132();
        test.maxTestNum213();
        test.maxTestNum312();
        test.maxTestNum231();
        test.maxTestNum321();

    }

    public void maxTestNum123(){
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int result = maxOfThreeNumbers.findMax(num1,num2,num3);
        checkResult(result, 3,"maxTestNum123");
    }
    public void maxTestNum132(){
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int num1 = 1;
        int num2 = 3;
        int num3 = 2;
        int result = maxOfThreeNumbers.findMax(num1,num2,num3);
        checkResult(result, 3,"maxTestNum132");
    }
    public void maxTestNum213(){
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int num1 = 2;
        int num2 = 1;
        int num3 = 3;
        int result = maxOfThreeNumbers.findMax(num1,num2,num3);
        checkResult(result, 3,"maxTestNum213");
    }
    public void maxTestNum312(){
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int num1 = 3;
        int num2 = 1;
        int num3 = 2;
        int result = maxOfThreeNumbers.findMax(num1,num2,num3);
        checkResult(result, 3,"maxTestNum312");
    }
    public void maxTestNum231(){
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int num1 = 2;
        int num2 = 3;
        int num3 = 1;
        int result = maxOfThreeNumbers.findMax(num1,num2,num3);
        checkResult(result, 3,"maxTestNum231");
    }
    public void maxTestNum321(){
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int num1 = 3;
        int num2 = 2;
        int num3 = 1;
        int result = maxOfThreeNumbers.findMax(num1,num2,num3);
        checkResult(result, 3,"maxTestNum321");
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
