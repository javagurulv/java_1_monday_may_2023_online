package lv.javaguru.java1.student_aleksandr_kalninjsh.lesson_6.day_1;

public class AverageFinderTest {

    public static void main(String[] args) {

        AverageFinderTest averageFinderTest = new AverageFinderTest();
        averageFinderTest.findAverageEvenNumbers();
        averageFinderTest.findAverageOddNumbers();
    }
    public void findAverageEvenNumbers() {
        AverageFinder averageFinder = new AverageFinder();
        int a = 3;
        int b = 5;
        double expectedResult = 4;
        double realResult = averageFinder.findAverage(a, b);
        if (realResult == expectedResult) {
            System.out.println("Even numbers test = OK");
        }
        else {
            System.out.println("Even numbers test = FAIL");
        }
    }
    public void findAverageOddNumbers() {
        AverageFinder averageFinder = new AverageFinder();
        int a = 4;
        int b = 3;
        double expectedResult = 3.5;
        double realResult = averageFinder.findAverage(a, b);
        if (realResult == expectedResult) {
            System.out.println("Odd numbers test = OK");
        }
        else {
            System.out.println("Odd numbers test = FAIL");
        }
    }



}
