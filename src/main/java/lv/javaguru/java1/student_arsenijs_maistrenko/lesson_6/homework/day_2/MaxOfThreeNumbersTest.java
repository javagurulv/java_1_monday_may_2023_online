package lv.javaguru.java1.student_arsenijs_maistrenko.lesson_6.homework.day_2;

public class MaxOfThreeNumbersTest {
        public static void main(String[] args) {
            MaxOfThreeNumbersTest test = new MaxOfThreeNumbersTest();
            test.test1();
            test.test2();
            test.test3();
            test.test4();
        }
        public void test1(){
            int num1 = 3;
            int num2 = 2;
            int num3 = 1;
            MaxOfThreeNumbers test1 = new MaxOfThreeNumbers();
            int actual = test1.findMax(num1, num2, num3);
            checkResult(actual, 3, "test1");
        }
        public void test2(){
            int num1 = 1;
            int num2 = 3;
            int num3 = 2;
            MaxOfThreeNumbers test2 = new MaxOfThreeNumbers();
            int actual = test2.findMax(num1, num2, num3);
            checkResult(actual, 3, "test2");
        }
        public void test3(){
            int num1 = 1;
            int num2 = 2;
            int num3 = 3;
            MaxOfThreeNumbers test3 = new MaxOfThreeNumbers();
            int actual = test3.findMax(num1, num2, num3);
            checkResult(actual, 3, "test3");
        }
        public void test4(){
            int num1 = 1;
            int num2 = 1;
            int num3 = 1;
            MaxOfThreeNumbers test1 = new MaxOfThreeNumbers();
            int actual = test1.findMax(num1, num2, num3);
            checkResult(actual, 1, "test4");
        }
        public void checkResult(int actualResult, int expectedResult, String testName) {
            if (actualResult == expectedResult) {
                System.out.println(testName + " PASS");
            } else {
                System.out.println(testName + " FAIL.");
            }
        }
    }