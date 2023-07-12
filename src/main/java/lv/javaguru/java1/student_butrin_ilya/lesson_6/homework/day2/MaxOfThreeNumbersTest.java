package lv.javaguru.java1.student_butrin_ilya.lesson_6.homework.day2;

public class MaxOfThreeNumbersTest {
    MaxOfThreeNumbers max = new MaxOfThreeNumbers();
    public static void main(String[] args) {
        MaxOfThreeNumbersTest test = new MaxOfThreeNumbersTest();
        test.FirstBiggestTest();
        test.SecondBiggestTest();
        test.lastBiggestTest();
        test.firstAndSeccondBiggestTest();
        test.secondAndLastBiggestTest();
        test.noBiggestTest();
        test.firstAndLastBiggestTest();


    }
    public void FirstBiggestTest() {
        int realRezult = 5;
        int expectedRezult = max.findMax(5,3,2);
        checkRezult(realRezult, expectedRezult, " Первое число самое большое");

    }
    public void SecondBiggestTest() {
        int realRezult = 5;
        int expectedRezult = max.findMax(3,5,2);
        checkRezult(realRezult, expectedRezult, " второе число самое большое");
    }
    public void lastBiggestTest() {
        int realRezult = 5;
        int expectedRezult = max.findMax(1,3,5);
        checkRezult(realRezult, expectedRezult, " третье число самое большое");
    }
    public void noBiggestTest() {
        int realRezult = 5;
        int expectedRezult = max.findMax(5,5,5);
        checkRezult(realRezult, expectedRezult, " все числа равны");
    }
    public void firstAndSeccondBiggestTest() {
        int realRezult = 5;
        int expectedRezult = max.findMax(5,5,2);
        checkRezult(realRezult, expectedRezult, " первые два числа самые большие");
    }
    public void firstAndLastBiggestTest() {
        int realRezult = 5;
        int expectedRezult = max.findMax(5,3,5);
        checkRezult(realRezult, expectedRezult, " первое и последние числа самые большие");
    }
    public void secondAndLastBiggestTest() {
        int realRezult = 5;
        int expectedRezult = max.findMax(3,5,5);
        checkRezult(realRezult, expectedRezult, " второе и третье число самые большие");

    }

    public void checkRezult (int real, int expected, String num) {
        if (real == expected) System.out.println("test" + num + " OK");
        else System.out.println("test" + num + " FAIL");
    }
}
