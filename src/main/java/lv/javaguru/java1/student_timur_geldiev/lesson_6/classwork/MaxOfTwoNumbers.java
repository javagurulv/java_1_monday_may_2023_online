package lv.javaguru.java1.student_timur_geldiev.lesson_6.classwork;

class MaxOfTwoNumbers {

    public static void main(String[] args) {

        MaxOfTwoNumbers test1 = new MaxOfTwoNumbers();
        test1.firstNumBigger();
        test1.secondNumBigger();
        test1.numbersEqual();
    }
    public void firstNumBigger(){
        int number1 = 15;
        int number2 = 10;
        MaxOfTwoNumbers check1 = new MaxOfTwoNumbers();
        int actual = check1.max(number1, number2);
        checkResult(actual, 15, "firstNumBigger");
    }
    public void secondNumBigger(){
        int number1 = 10;
        int number2 = 20;
        MaxOfTwoNumbers check2 = new MaxOfTwoNumbers();
        int actual = check2.max(number1, number2);
        checkResult(actual, 20, "secondNumBigger");
    }
    public void numbersEqual(){
        int number1 = 10;
        int number2 = 10;
        MaxOfTwoNumbers check3 = new MaxOfTwoNumbers();
        int actual = check3.max(number1, number2);
        checkResult(actual, 10, "numbersEqual");
    }

    public void checkResult(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " Test PASS");
        } else {
            System.out.println(testName + " Test FAIL");
        }
    }

    public int max(int number1 , int number2){
        if(number1>number2){
            return number1;
        } else{
            return number2;
        }
    }


}
