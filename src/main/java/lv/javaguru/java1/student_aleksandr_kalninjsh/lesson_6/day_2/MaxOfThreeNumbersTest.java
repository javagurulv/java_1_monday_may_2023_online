package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_6.day_2;

class MaxOfThreeNumbersTest {

    public static void main(String[] args) {

        MaxOfThreeNumbersTest maxOfThreeNumbersTest = new MaxOfThreeNumbersTest();
        maxOfThreeNumbersTest.firstIsBiggerTest();
        maxOfThreeNumbersTest.secondIsBiggerTest();
        maxOfThreeNumbersTest.thirdIsBiggerTest();
    }
    public void firstIsBiggerTest() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int a = 8;
        int b = 5;
        int c = 6;
        int expectedResult = 8;
        int realResult = maxOfThreeNumbers.findMax(a, b, c);
        if (realResult == expectedResult) {
            System.out.println("First is bigger test = OK");
        }
        else {
            System.out.println("First is bigger test = FAIL");
        }

    }
    public void secondIsBiggerTest() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int a = 5;
        int b = 8;
        int c = 6;
        int expectedResult = 8;
        int realResult = maxOfThreeNumbers.findMax(a, b, c);
        if (realResult == expectedResult) {
            System.out.println("Second is bigger test = OK");
        }
        else {
            System.out.println("Second is bigger test = FAIL");
        }

    }
    public void thirdIsBiggerTest() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int a = 6;
        int b = 5;
        int c = 8;
        int expectedResult = 8;
        int realResult = maxOfThreeNumbers.findMax(a, b, c);
        if (realResult == expectedResult) {
            System.out.println("Third is bigger test = OK");
        }
        else {
            System.out.println("Third is bigger test = FAIL");
        }

    }


}
